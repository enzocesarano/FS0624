
import CommentList from "./CommentList";
import AddComment from "./AddComment";
import Loading from "./Loading";
import Error from "./Error";
import { useEffect, useState } from "react";

const CommentArea = ({asin}) => {
 /* state = {
    comments: [],
    isLoading: true,
    isError: false,
  }; */

  const [comments, setComments] = useState([])
  const [isLoading, setIsLoading] = useState(true)
  const [isError, setIsError] = useState(false)
  const [changeValue, setChangeValue] = useState(true)

  const changeValueFunction = () => {
    setChangeValue(!changeValue)
  }

  useEffect(() => {
    fetchComments()
  }, [asin])

  useEffect(() => {
    fetchComments()
  }, [changeValue])

  const fetchComments = () => {
    fetch(`https://striveschool-api.herokuapp.com/api/comments/${asin}`, {
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
        setComments(arrayComment)
        setIsLoading(false)
        setIsError(false)
      })

      .catch((err) => {
        console.log(err);
        setIsError(true)
      });
  };


    return (
      <div className="text-center" data-testid='comment-area'>
        {isLoading && <Loading />}
        {isError && <Error />}
        <AddComment asin={asin} changeValueFunction={changeValueFunction}/>
        <CommentList commentsToShow={comments} changeValueFunction={changeValueFunction} />
      </div>
    );
}

export default CommentArea;
