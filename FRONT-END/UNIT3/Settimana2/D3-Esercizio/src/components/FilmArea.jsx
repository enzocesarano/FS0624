import { useState } from "react";
import MyGallery from "./MyGallery";
import { Container, Form, Row, Col } from "react-bootstrap";

const FilmArea = () => {
  

  const [gallery] = useState(["avengers", "thor", "american pie"]);
  const [searchTerm, setSearchTerm] = useState('');

  const submitOff = (e) => {
    e.preventDefault()
  }

  return (
    <Container fluid className="px-5">
      <Row xs={2} md={2} lg={6} className="mb-3">
        <Col>
          <Form onSubmit={submitOff}>
            <Form.Group>
              <Form.Control
                onChange={(e) => {
                  setSearchTerm(e.target.value)
                }}
                value={searchTerm}
                className="bg-dark text-light input text-capitalize me-2"
                placeholder="Cerca i tuoi film preferiti..."
              />
            </Form.Group>
          </Form>
        </Col>
      </Row>
      {searchTerm.length > 3 && (
        <MyGallery gallery={searchTerm} />
      )}

      {gallery.map((film, i) => (
        <MyGallery key={i} gallery={film} />
      ))}
    </Container>
  );
};

export default FilmArea;
