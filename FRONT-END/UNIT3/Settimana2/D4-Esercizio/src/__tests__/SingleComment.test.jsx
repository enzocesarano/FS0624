
import { render, screen } from "@testing-library/react"
import CommentArea from "../components/CommentArea"


describe('Welcome component test', () => {
    it('il componente viene montato correttamente', () => {

        render(<CommentArea />)

        const singleComment = screen.queryByTestId('list-item')

        expect(singleComment).not.toBeInTheDocument()
    })
})