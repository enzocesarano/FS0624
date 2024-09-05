import { useEffect, useState } from "react";
import Article from "./Article";
import { Button, Col, Container, Row } from "react-bootstrap";
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

interface NewPage {
  next: string;
  previous?: string;
}

const AreaArticle = () => {
  const [article, setArticle] = useState<NewsArticle[]>([]);
  const [pageFetch, setPageFetch] = useState('https://api.spaceflightnewsapi.net/v4/articles')
  const [page, setPage] = useState<NewPage | null>();

  const navigate = useNavigate();

  const handleArticleClick = (id: number) => {
    navigate(`/details/${id}`);
  };

  const myFetch = () => {
    fetch(pageFetch)
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
        setPage({
          next: article.next,
          previous: article.previous,
        });
        console.log(page)
      });
  };

  useEffect(() => {
    myFetch();
  }, []);

  useEffect(() => {
    myFetch();
  }, [pageFetch]);


  return (
    <Container className="py-5">
      <Row>
        <Col xs={12} className="mb-5">
          {page?.previous && <Button variant="outline-success" onClick={e => setPageFetch(page.previous!)}>Indietro</Button>}
          {page?.next && <Button variant="outline-success"onClick={e => setPageFetch(page.next)}>Avanti</Button>}
        </Col>
        {article.map((article) => (
          <Col
            key={article.id}
            xs={6}
            md={4}
            lg={2}
            className="pointer zoom mb-3"
            onClick={() => handleArticleClick(article.id)}
          >
            <Article article={article} />
          </Col>
        ))}
      </Row>
    </Container>
  );
};

export default AreaArticle;
