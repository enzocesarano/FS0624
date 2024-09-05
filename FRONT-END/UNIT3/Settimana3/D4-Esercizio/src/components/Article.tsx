import Card from 'react-bootstrap/Card';
import { NewsArticle } from './AreaArticle';

interface ArticleProps {
  article: NewsArticle;
}

export const formatDate = (dateString: string) => {
    const date = new Date(dateString);
    return date.toLocaleString('it-IT', {
      weekday: 'long',
      year: 'numeric',
      month: 'long',
      day: 'numeric',
      hour: '2-digit',
      minute: '2-digit',
    });
  };

const Article = ({ article }: ArticleProps) => {
  return (
    <Card className='card-fix bg-dark text-light border-secondary'>
      <Card.Img variant="top" src={article.image_url} alt={article.title} />
      <Card.Body className='d-flex flex-column justify-content-between'>
        <Card.Title className='fs-6'>{article.title.slice(0, 40)}...</Card.Title>
        <Card.Text className='text-small'>
        {article.summary.slice(0, 150)}...
        </Card.Text>
        <Card.Text className='text-small'>
        {formatDate(article.published_at).toUpperCase()}
        </Card.Text>
      </Card.Body>
    </Card>
  );
}

export default Article;