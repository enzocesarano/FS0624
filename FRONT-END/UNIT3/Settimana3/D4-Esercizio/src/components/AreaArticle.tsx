import { useEffect, useState } from "react";
import Article from "./Article";
import { Col, Container, Row } from "react-bootstrap";
import { useNavigate } from "react-router-dom";

export interface NewsArticle {
  id: number;
  title: string;
  url: string;
  image_url: string;
  news_site: string;
  summary: string;
  published_at: string;
  updated_at: string;
  featured: boolean;
  launches: [];
  events: [];
}

const AreaArticle = () => {
  const [article, setArticle] = useState<NewsArticle[]>([]);
  const navigate = useNavigate();

  const handleArticleClick = (id: number) => {
    navigate(`/details/${id}`);
  };

  const myFetch = () => {
    fetch("https://api.spaceflightnewsapi.net/v4/articles")
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("Errore nel recupero dei dati");
        }
      })
      .then((article) => {
        console.log(article.results);
        setArticle(article.results);
      });
  };

  useEffect(() => {
    myFetch();
  }, []);

  return (
    <Container className="py-5">
      <Row>
        {article.map((article) => (
          <Col key={article.id} xs={6} md={4} lg={2} className="pointer zoom mb-3" onClick={() => handleArticleClick(article.id)}>
            <Article article={article}/>
          </Col>
        ))}
      </Row>
    </Container>
  );
};

export default AreaArticle;
