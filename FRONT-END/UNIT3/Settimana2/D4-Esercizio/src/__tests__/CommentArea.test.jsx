
import { fireEvent, render, screen } from "@testing-library/react"
import CommentArea from '../components/CommentArea'
import BookList from "../components/BookList"
import fantasy from "../data/fantasy.json"


describe('Welcome component test', () => {
    it('il componente viene montato correttamente', () => {

        render(<CommentArea /> && <BookList books={fantasy} />)

        const bookListCard = screen.getAllByTestId('click-test')

        fireEvent.click(bookListCard[0])
        
        const commentAreaRender = screen.getAllByTestId('comment-area')

        expect(commentAreaRender.length).toBeGreaterThan(0)
    })
})