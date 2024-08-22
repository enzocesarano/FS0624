import { Col } from "react-bootstrap";

import SingleComment from "./SingleComment";

const CommentList = ({ arrayCommentList }) => {
  return (
    <Col className="mb-5">
      {arrayCommentList.map((comment) => {
        return (
          <SingleComment
            key={comment._id}
            text={comment.comment}
            rate={comment.rate}
            idComment={comment._id}
          />
        );
      })}
    </Col>
  );
};

export default CommentList;
