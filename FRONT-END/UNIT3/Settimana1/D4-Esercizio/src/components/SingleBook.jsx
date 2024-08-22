import { Component } from "react";
import { Card, Col } from "react-bootstrap";

import CommentArea from "./CommentArea";

class SingleBook extends Component {
  state = {
    active: false,
  };

  render() {
    const { book } = this.props;
    const { active } = this.state;

    return (
      <Col
        xs={12}
        md={3}
        onClick={(e) => {
          this.setState({
            active: !this.state.active,
          });
        }}
      >
        <Card className={`d-flex flex-column mb-2 pointer ${active ? "border-2 border-danger" : ""}`}>
          <Card.Img variant="top" src={book.img} />
          <Card.Body>
            <Card.Title>{book.title}</Card.Title>
          </Card.Body>
        </Card>
        {active && <CommentArea elementId={book.asin}/>}
      </Col>
      
    );
  }
}

export default SingleBook;
