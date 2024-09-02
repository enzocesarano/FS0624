import { Col, Container, Row } from "react-bootstrap";
import { Link } from "react-router-dom";
import { useSelector, useDispatch } from "react-redux";

const Favorite = () => {
  const arrayPref = useSelector((store) => {
    return store.pref.arrayPref;
  });

  const dispatch = useDispatch();

  return (
    <Container>
      <Row className="row-cols-1">
        <Col className="mb-5">
          <h1 className="display-1">Aziende Preferite</h1>
        </Col>
        <Col className="border border-1 border-secondary rounded-2 p-5">
          <Row>
            {arrayPref.map((company1, i) => (
              <Col xs={12} key={i} className="d-flex justify-content-between border border-0 border-bottom border-1 border-secondary rounded-2 pb-2 mb-4">
                <Link className="fs-1" to={`/${company1.company_name}`}>
                  {company1.company_name}
                </Link>
                <i className="fs-3 bi bi-heart-fill text-danger pointer" onClick={() => {
                    dispatch({
                      type: "REMOVE_FROM_PREF",
                      payload: company1,
                    });
                  }}
                ></i>
              </Col>
            ))}
          </Row>
        </Col>
      </Row>
    </Container>
  );
};

export default Favorite;
