import { Component } from "react";

import { Card, Col, Button } from "react-bootstrap";

class SingleComment extends Component {
  state = {
    asin: this.props.idComment,
  };

  delete = () => {
    fetch(
      `https://striveschool-api.herokuapp.com/api/comments/${this.state.asin}`,
      {
        method: "DELETE",

        headers: {
          Authorization:
            "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmM3MzI1ZTQzYTU2ODAwMTU4ZWMzZDgiLCJpYXQiOjE3MjQzMzA1OTAsImV4cCI6MTcyNTU0MDE5MH0.tTvI7wqASC9lVLSzii2yWT3ayw3ngqdcVR-fkzdPb_Q",
        },
      }
    )
      .then((response) => {
        if (response.ok) {
          alert("PRODOTTO ELIMINATO");
        } else {
          throw new Error("La chiamata non è andata a buon fine");
        }
      })
      .catch((err) => {
        console.log("error", err);
      });
  };

  render() {
    return (
      <Col className="mb-1">
        <Card className="d-flex">
          <Card.Body>
            <Card.Text className="mb-0">{this.props.rate}</Card.Text>
            <Card.Text>{this.props.text}</Card.Text>
          </Card.Body>
          <Button
            variant="secondary"
            onClick={(e) => {
              e.stopPropagation();
              this.delete()
            }}
          >
            🗑️
          </Button>
        </Card>
      </Col>
    );
  }
}

export default SingleComment;
