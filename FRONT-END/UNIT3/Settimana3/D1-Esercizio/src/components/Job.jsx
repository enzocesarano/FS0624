import { Row, Col } from "react-bootstrap";
import { Link } from "react-router-dom";
import { useDispatch, useSelector } from 'react-redux';

const Job = ({ data }) => {

  const arrayPref = useSelector((store) => {
    return store.pref.arrayPref;
  });

  const selected = arrayPref.map(element => element._id).includes(data._id);

  const dispatch = useDispatch();

  return (
    <Row
      className="mx-0 mt-3 p-3"
      style={{ border: "1px solid #00000033", borderRadius: 4 }}
    >
      <Col xs={3}>
        <Link to={`/${data.company_name}`}>{data.company_name}</Link>
      </Col>
      <Col xs={3}>
        <i className={selected ? "bi bi-heart-fill text-danger pointer" : "bi bi-heart pointer"} onClick={() => {
          if(!selected) {
            dispatch({
              type: 'ADD_TO_PREF',
              payload: data,
            })
          } else {
            dispatch({
              type: "REMOVE_FROM_PREF",
              payload: data,
            });
          }
          
        }}></i>
      </Col>
      <Col xs={6}>
        <a href={data.url} target="_blank" rel="noreferrer">
          {data.title}
        </a>
      </Col>
    </Row>
  );
};

export default Job;