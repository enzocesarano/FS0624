import { Component } from "react";
import CommentList from "./CommentList";
import AddComment from "./AddComment";
import Loading from "./Loading";
import Error from "./Error";

class CommentArea extends Component {
  state = {
    comments: [],
    isLoading: true,
    isError: false,
  };
  

  componentDidMount = () => {
    this.fetchComments()
  };

  componentDidUpdate = (prevProps, prevState) => {
    if (prevProps.asin !== this.props.asin) {
      this.fetchComments()
    }
  }

  fetchComments = () => {
    fetch(`https://striveschool-api.herokuapp.com/api/comments/${this.props.asin}`, {
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
            comments: arrayComment,
            isLoading: false,
            isError: false
        })
      })

      .catch((err) => {
        console.log(err);
        this.setState({
          isError: false
        })
      });
  };


  render() {
    return (
      <div className="text-center">
        {this.state.isLoading && <Loading />}
        {this.state.isError && <Error />}
        <AddComment asin={this.props.asin} />
        <CommentList commentsToShow={this.state.comments} />
      </div>
    );
  }
}

export default CommentArea;
