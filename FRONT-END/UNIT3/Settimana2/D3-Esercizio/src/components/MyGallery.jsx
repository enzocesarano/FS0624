import MyFilm from "./MyFilm";
import { Alert, Col, Row } from "react-bootstrap";
import CardLoading from "./CardLoading";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const MyGallery = ({ gallery }) => {
  const [filmsArray, setFilmsArray] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(false);

  useEffect(() => {
    myFetch();
  }, [gallery]);

  const myFetch = () => {
    fetch(`https://www.omdbapi.com/?apikey=e24d604e&s=${gallery}`)
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("La chiamata non è andata a buon fine");
        }
      })

      .then((arrayFilm) => {
        const films = arrayFilm.Search ? arrayFilm.Search.slice(0, 6) : [];
        setFilmsArray(films);
        setLoading(false);
      })

      .catch((err) => {
        console.log(err);
        setLoading(false);
        setError(true);
      });
  };

  const navigate = useNavigate();

  return (
    <Row className="pb-5 border border-0 border-bottom border-1 border-secondary mb-4">
      <Col xs={12}>
        <h2 className="text-light mb-3 text-capitalize">{gallery}</h2>
      </Col>
      <Col>
        <Row xs={2} md={4} lg={6}>
          {loading && (
            <>
              <CardLoading />
              <CardLoading />
              <CardLoading />
              <CardLoading />
              <CardLoading />
              <CardLoading />
            </>
          )}

          {error && (
            <Alert className="bg-dark border-secondary">
              <span className="me-2 text-light">
                Qualcosa è andato storto...
              </span>
              <i className="bi bi-exclamation-triangle-fill text-danger"></i>
            </Alert>
          )}

          {filmsArray.map((film) => {
            return (
              <MyFilm
                key={film.imdbID}
                img={film.Poster}
                title={film.Title}
                age={film.Year}
                id={film.imdbID}
                onClick={() => {
                  console.log("Film cliccato:", film.imdbID);
                  navigate("/details/" + film.imdbID);
                }}
              />
            );
          })}
        </Row>
      </Col>
    </Row>
  );
};

export default MyGallery;
