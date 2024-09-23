import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import { NewsArticle } from "./AreaArticle";
import { Card, Col, Container, Row } from "react-bootstrap";
import { formatDate } from "./Article";

const Details = () => {
  const params = useParams<{ id: string }>();
  const [article, setArticle] = useState<NewsArticle | null>(null);

  useEffect(() => {
    fetch(`https://api.spaceflightnewsapi.net/v4/articles/${params.id}`)
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("Errore nel recupero dei dati");
        }
      })
      .then((article) => {
        setArticle(article);
      });
  }, [params]);

  if (!article) {
    return <p>Loading...</p>;
  }

  return (
    <Container className="py-5">
      <Row>
        <Col>
          <Card className="border-0 bg-transparent text-light">
            <div className="divImage">
              <Card.Img
                variant="top"
                className="mb-5 h-100 img-fix"
                src={article.image_url}
                alt={article.title}
              />
            </div>

            <Card.Body className="d-flex flex-column justify-content-between">
              <Card.Title className="display-3 fw-medium mb-5">
                {article.title}
              </Card.Title>
              <Card.Text className="display-5 mb-5">
                {article.summary}
                <a
                  className="nav-link d-inline-block text-info ms-5 fs-3 p-1 border border-2 border-info rounded-2"
                  href={article.url}
                  target="_blank"
                  rel="noreferrer"
                >
                  Leggi di più
                </a>
              </Card.Text>
              <Card.Text>
                Ultimo aggiornamento:{" "}
                <i>{formatDate(article.updated_at).toUpperCase()}</i>
              </Card.Text>
            </Card.Body>
          </Card>
        </Col>
      </Row>
    </Container>
  );
};

export default Details;
