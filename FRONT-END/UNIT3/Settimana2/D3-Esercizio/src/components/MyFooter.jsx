import React, { Component } from "react";
import { Container, Row, Col, ListGroup, Button } from "react-bootstrap";

class MyFooter extends Component {
  render() {
    return (
      <footer className="p-5">
        <Container className="text-secondary">
          <Row>
            <Col xs={12} className="fs-3 mb-3">
              <ListGroup horizontal className="list-unstyled d-flex">
                <ListGroup.Item
                  className="border-0 me-3 p-0 bg-transparent text-secondary pointer"
                >
                  <i className="bi bi-facebook"></i>
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 me-3 p-0 bg-transparent text-secondary pointer"
                >
                  <i className="bi bi-instagram"></i>
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 me-3 p-0 bg-transparent text-secondary pointer"
                >
                  <i className="bi bi-twitter"></i>
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 me-3 p-0 bg-transparent text-secondary pointer"
                >
                  <i className="bi bi-youtube"></i>
                </ListGroup.Item>
              </ListGroup>
            </Col>

            <Col xs={6} md className="fs-small mb-4">
              <ListGroup className="list-unstyled">
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Audio and Subtitles
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Media Center
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Privacy
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Contact Us
                </ListGroup.Item>
              </ListGroup>
            </Col>

            <Col xs={6} md className="fs-small mb-4">
              <ListGroup className="list-unstyled">
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Audio Description
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Investor Relations
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Legal Notices
                </ListGroup.Item>
              </ListGroup>
            </Col>

            <Col xs={6} md className="fs-small mb-4">
              <ListGroup className="list-unstyled">
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Help Center
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Jobs
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Cookie Preferences
                </ListGroup.Item>
              </ListGroup>
            </Col>

            <Col xs={6} md className="fs-small mb-4">
              <ListGroup className="list-unstyled">
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Gift Cards
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Terms of Use
                </ListGroup.Item>
                <ListGroup.Item
                  className="border-0 mb-2 p-0 bg-transparent text-secondary pointer"
                >
                  Corporate Information
                </ListGroup.Item>
              </ListGroup>
            </Col>

            <Col xs={12} className="mb-3 fs-small">
              <Button
                variant="outline-secondary"
                className="text-decoration-none bg-dark text-secondary py-1 px-3 fw-bold border border-secondary border-1 pointer"
              >
                Service Code
              </Button>
            </Col>

            <Col xs={12} className="fs-supersmall">
              &copy; 1997-2019 Netflix, Inc. {`{i-0d00fcda2fdf9c0de}`}
            </Col>
          </Row>
        </Container>
      </footer>
    );
  }
}

export default MyFooter;
