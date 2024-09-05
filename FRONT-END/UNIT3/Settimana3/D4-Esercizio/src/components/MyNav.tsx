import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { Link } from 'react-router-dom';

function MyNav() {
  return (
    <Navbar bg="dark" variant="dark" expand="lg" className="px-5">
      <Container fluid className="bg-dark px-0 py-2">
        <Navbar.Brand href="#home">SPACEFLIGHT</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Link className='nav-link active' to="/">Home</Link>
            <Link className='nav-link disabled' to="/details">Details</Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export default MyNav;