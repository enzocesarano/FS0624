
import {
  Navbar,
  Nav,
  Container,
  NavDropdown,
} from "react-bootstrap";

import { Link, useLocation } from "react-router-dom";

const MyNav = () => {

  const location = useLocation()

    return (
      <header className="mb-3">
        <Navbar bg="dark" variant="dark" expand="lg" className="px-5">
          <Container fluid className="bg-dark px-0 py-2">
            <Link to="/" className="me-3 logo">
              <img
                className="w-100"
                src="/img/netflix_logo.png"
                alt="logo NETFLIX"
              />
            </Link>
            <Navbar.Toggle aria-controls="navbarNavDropdown" />
            <Navbar.Collapse
              id="navbarNavDropdown"
              className="justify-content-between"
            >
              <Nav>
                <Link to="/tv-show" className={`nav-link me-3 ${
                location.pathname === '/tv-show' ? ' active' : ''
              }`}>
                  TV Shows
                </Link>
                <Link to="/movies" className={`nav-link me-3 ${
                location.pathname === '/movies' ? ' active' : ''
              }`}>
                  Movies
                </Link>
                <Link to="/recently-added" className={`nav-link me-3 ${
                location.pathname === '/recently-added' ? ' active' : ''
              }`}>
                  Recently Added
                </Link>
                <Link to="/my-list" className={`nav-link me-3 ${
                location.pathname === '/my-list' ? ' active' : ''
              }`}>My List</Link>
              </Nav>
              <div className="nav-link d-flex align-items-center justify-content-lg-end position-relative">
                <Link to="/kids" className="nav-link me-3 active text-light">
                  KIDS
                </Link>
                <Link to="/notify">
                  <i className="nav-link bi bi-bell-fill text-light fs-4 me-3"></i>
                </Link>
                <NavDropdown
                  title={
                    <img
                      src="/img/avatar.png"
                      alt="Avatar account"
                      className="w-100"
                    />
                  }
                  id="basic-nav-dropdown"
                  align="end"
                  className="w-15 d-flex align-items-center iconaProfile"
                >
                  <NavDropdown.Item href="#">Edit Profile</NavDropdown.Item>
                  <NavDropdown.Item href="#">Help Center</NavDropdown.Item>
                  <NavDropdown.Divider />
                  <NavDropdown.Item href="#">Signout</NavDropdown.Item>
                </NavDropdown>
              </div>
            </Navbar.Collapse>
          </Container>
        </Navbar>
      </header>
    );
}

export default MyNav;
