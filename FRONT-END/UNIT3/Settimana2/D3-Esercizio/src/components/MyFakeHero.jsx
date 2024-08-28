import React from "react";
import {
  Dropdown,
  Button,
  ButtonToolbar,
  DropdownToggle,
} from "react-bootstrap";

function MyFakeHero() {
  return (
    <div className="d-flex px-5 text-light align-items-center flex-grow-1 justify-content-between flex-md-grow-0 mb-5">
      <div className="d-flex align-items-end">
        <h1 className="m-0 me-4 fs-2">TV Shows</h1>
        <Dropdown>
          <DropdownToggle
            variant="dark"
            className="bg-black text-light p-2 fw-bold border border-light border-1"
            id="dropdown-genres"
            data-bs-toggle="dropdown"
            aria-expanded="false"
          >
            <span className="me-4 fs-6">Genres</span>
          </DropdownToggle>
          <Dropdown.Menu className="dropdown-menu dropdown-menu-dark bg-dark">
            <Dropdown.Item className="text-light" href="#">
              Action
            </Dropdown.Item>
            <Dropdown.Item className="text-light" href="#">
              Adventure
            </Dropdown.Item>
            <Dropdown.Item className="text-light" href="#">
              Horror
            </Dropdown.Item>
            <Dropdown.Item className="text-light" href="#">
              Fantasy
            </Dropdown.Item>
          </Dropdown.Menu>
        </Dropdown>
      </div>
      <div className="d-none d-lg-flex">
        <ButtonToolbar>
          <Button
            variant="dark"
            className="bg-dark text-light py-1 px-3 fw-bold border border-light border-1"
          >
            <i className="bi bi-text-left"></i>
          </Button>
          <Button
            variant="dark"
            className="bg-dark text-light py-1 px-3 fw-bold border border-secondary border-1"
          >
            <i className="bi bi-grid-fill"></i>
          </Button>
        </ButtonToolbar>
      </div>
    </div>
  );
}

export default MyFakeHero;
