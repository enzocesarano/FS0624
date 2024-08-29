
import { Card } from 'react-bootstrap'

const SingleBook = ({changeSelectedBook, book, selectedBookAsin}) => {
    return (
      <>
        <Card
          onClick={() => {
            changeSelectedBook(book.asin)
          }} 
          style={{ border: book.asin === selectedBookAsin ? '3px solid red' : 'none' }}
          data-testid='click-test'
        >
          <Card.Img variant="top" src={book.img} />
          <Card.Body>
            <Card.Title style={{ color: 'black' }}>
              {book.title}
            </Card.Title>
          </Card.Body>
        </Card>
      </>
    )
}

export default SingleBook;
