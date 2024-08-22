import { Component } from "react";
import { Row } from "react-bootstrap";
import CommentList from "./CommentList";



class CommentArea extends Component {
  state = {
    asin: this.props.elementId,
    comments: []
  };

  componentDidMount = () => {
    this.fetchComments();
  };

  fetchComments = () => {
    fetch(`https://striveschool-api.herokuapp.com/api/comments/${this.state.asin}`, {
      headers: {
        Authorization:
          "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmM3MzI1ZTQzYTU2ODAwMTU4ZWMzZDgiLCJpYXQiOjE3MjQzMzA1OTAsImV4cCI6MTcyNTU0MDE5MH0.tTvI7wqASC9lVLSzii2yWT3ayw3ngqdcVR-fkzdPb_Q",
      },
    })

      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("La chiamata non è andata a buon fine");
        }
      })

      .then((arrayComment) => {
        this.setState({
            comments: arrayComment
        })
      })

      .catch((err) => {
        console.log(err);
      });
  };

  render() {
    return (
      <Row>
        <CommentList arrayCommentList={this.state.comments}/>
      </Row>
    );
  }
}

export default CommentArea;
