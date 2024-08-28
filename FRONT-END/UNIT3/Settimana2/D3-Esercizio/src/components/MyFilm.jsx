import { useState } from "react";
import { Card, Col } from "react-bootstrap";

const MyFilm = ({img, title, age, id, onClick}) => {

  const [film] = useState({
    Poster: img,
    Title: title,
    Year: age,
    imdbID: id,
  });

  return (
    <Col className="mb-3 mb-lg-0" onClick={onClick}>
      <Card
        className="myCard bg-dark border-0 position-relative pointerSlide"
        id={film.imdbID}
      >
        <Card.Img
          src={film.Poster}
          className="h-100 object-fit-cover object-position-bottom cardImg"
        />
        <Card.Body className="position-absolute bottom-0 w-100 myText d-flex flex-column justify-content-end opacity-0 rounded-2">
          <Card.Title className="mb-0">{film.Title}</Card.Title>
          <Card.Text className="fs-6 text-light">{film.Year}</Card.Text>
        </Card.Body>
      </Card>
    </Col>
  );
};

export default MyFilm;
