import { Component } from "react";

import { Card, Col } from "react-bootstrap";

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
        md={2}
        onClick={(e) => {
          this.setState({
            active: !this.state.active,
          });
        }}
      >
        <Card className={`book-cover d-flex flex-column pointer ${active ? "border-2 border-danger" : ""}`}>
          <Card.Img variant="top" src={book.img} />
          <Card.Body>
            <Card.Title>{book.title}</Card.Title>
          </Card.Body>
        </Card>
      </Col>
    );
  }
}

export default SingleBook;
