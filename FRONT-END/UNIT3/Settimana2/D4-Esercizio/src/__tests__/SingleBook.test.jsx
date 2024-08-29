
import { fireEvent, render, screen } from "@testing-library/react"
import fantasy from "../data/fantasy.json"
import BookList from "../components/BookList"


describe('SingleNook component test', () => {
    it('vengono renderizzate tante bootstrap cards quanti sono i libri nel file json utilizzato', () => {

        render(<BookList books={fantasy} />)

        const singleBookLenght = screen.getAllByRole('img')

        expect(singleBookLenght).toHaveLength(150)
    })



    it('filtraggio dei libri tramite navbar si comporti come previsto', () => {

        render(<BookList books={fantasy} />)

        const search = screen.getByPlaceholderText(/cerca un libro/i)
        
        fireEvent.change(search, { target: { value: 'Destiny' } }) 

        const bookArea =  screen.getAllByRole('img')

        expect(bookArea.length).toBeGreaterThan(0)
      })



      it('il suo bordo cambi colore', () => {
        
        render(<BookList books={fantasy} />)

        const singleBook = screen.getAllByTestId('click-test')

        fireEvent.click(singleBook[0])

        expect(singleBook[0]).toHaveStyle('border: 3px solid red')

      })

      it('cliccando su di un secondo libro dopo il primo, il bordo del primo libro ritorni normale.', () => {
        
        render(<BookList books={fantasy} />)

        const singleBook = screen.getAllByTestId('click-test')

        fireEvent.click(singleBook[0])

        expect(singleBook[0]).toHaveStyle('border: 3px solid red')

        fireEvent.click(singleBook[1])

        expect(singleBook[0]).toHaveStyle('border: none')

      })
})