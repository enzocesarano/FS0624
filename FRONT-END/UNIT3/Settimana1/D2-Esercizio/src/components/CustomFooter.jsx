import { Container, Row, Col } from 'react-bootstrap'

const CustomFooter = function () {
    return (
        <Container fluid className='bg-dark text-secondary'>
            <Row>
                <Col>
                    <ul className='list-unstyled'>
                        <li>Chi siamo</li>
                        <li>Dove siamo</li>
                        <li>Lavora con noi</li>
                        <li>Contattaci</li>
                    </ul>                
                </Col>
            </Row>
        </Container>
    )
}

export default CustomFooter