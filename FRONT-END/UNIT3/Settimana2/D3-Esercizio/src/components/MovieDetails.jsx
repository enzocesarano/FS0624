import { useEffect, useState } from "react";
import { Button, Card, Container, Row } from "react-bootstrap";
import { useParams } from "react-router-dom";

const MovieDetails = () => {
  const [filmsArray, setFilmsArray] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(false);

  const params = useParams();

  useEffect(() => {
    myFetch();
  }, [params]);

  const myFetch = () => {
    fetch(`https://www.omdbapi.com/?apikey=e24d604e&i=${params.id}`)
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("La chiamata non è andata a buon fine");
        }
      })

      .then((arrayFilm) => {
        console.log(arrayFilm)
        setFilmsArray(arrayFilm);
        setLoading(false);
      })

      .catch((err) => {
        console.log(err);
        setLoading(false);
        setError(true);
      });
  };

  return (
    <Container>
      <Row>
        <Card style={{ width: "18rem" }}>
          <Card.Img variant="top" src={filmsArray.Poster} />
          <Card.Body>
            <Card.Title>{filmsArray.Title}</Card.Title>
            <Card.Text>
            {filmsArray.Plot}
            </Card.Text>
          </Card.Body>
        </Card>
      </Row>
    </Container>
  );
};

export default MovieDetails;
