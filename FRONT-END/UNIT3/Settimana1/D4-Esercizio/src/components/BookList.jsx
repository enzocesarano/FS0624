import {Row} from "react-bootstrap";
import SingleBook from "./SingleBook";
import fantasy from "../data/fantasy.json"


const BookList = () => {
  return (
  <Row className="g-2">
    {fantasy.map((element) => {
      return (
        <SingleBook key={element.asin} book={element}/>
      )
    })}
  </Row>
    
  );
};


export default BookList