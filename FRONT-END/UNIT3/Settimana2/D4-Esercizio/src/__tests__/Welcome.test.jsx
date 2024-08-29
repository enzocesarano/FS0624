
import { render, screen } from "@testing-library/react"
import Welcome from "../components/Welcome"


describe('Welcome component test', () => {
    it('il componente viene montato correttamente', () => {

        render(<Welcome />)

        const welcomeRender = screen.getByText(/benvenuti in epibooks!/i)

        expect(welcomeRender).toBeInTheDocument()
    })
})