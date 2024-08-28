import { Card, Col, Placeholder } from "react-bootstrap";

function CardLoading() {
  return (
    <Col>
      <Card className="myCard p-4 border-secondary glowEffect border-0 d-flex flex-column justify-content-end">
        <Placeholder as={Card.Text} animation="glow">
          <Placeholder xs={7} />
          <Placeholder xs={6} />
        </Placeholder>
      </Card>
    </Col>
  );
}

export default CardLoading;
