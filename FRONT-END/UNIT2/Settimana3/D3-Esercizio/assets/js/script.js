const rowContainer = document.getElementById('rowContainer')


fetch('https://striveschool-api.herokuapp.com/books')
    .then((response) => {
        if (response.ok) {
            return response.json()
        } else {
            throw new Error('error')
        }
    })

    .then((booksList) => {
        console.log(booksList)
        displayPrint(booksList)
    })

    .catch((error) => {
        console.log('errore', error)
    })

const shopping = JSON.parse(localStorage.getItem('book')) || [];


function displayPrint(books) {
    books.forEach(element => {
        const col = document.createElement('div')
        col.classList.add('col')

        const card = document.createElement('div')
        card.classList.add('card')

        const imgBook = document.createElement('img')
        imgBook.classList.add('card-img-top')
        imgBook.setAttribute('src', `${element.img}`)
        imgBook.setAttribute('alt', `libro ${element.title}`)

        const cardBody = document.createElement('div')
        cardBody.classList.add('card-body')

        const titleBook = document.createElement('h4')
        titleBook.classList.add('card-title')
        titleBook.innerText = `${element.title}`

        const priceBook = document.createElement('p')
        priceBook.classList.add('card-text', 'fs-5')
        priceBook.innerText = `${element.price}€`

        const divButton = document.createElement('div')
        divButton.classList.add('d-flex', 'justify-content-between', 'align-items-center', 'px-3')

        const btnBuy = document.createElement('i')
        btnBuy.innerText = 'Acquista Subito!'
        btnBuy.classList.add('m-2', 'fs-6')
        btnBuy.setAttribute('onclick', addShop())

        const btnRemove = document.createElement('i')
        btnRemove.classList.add('bi', 'bi-trash3-fill', 'align-self-end', 'm-2', 'fs-6')
        btnRemove.setAttribute('onclick', remove())

        rowContainer.appendChild(col)
        col.appendChild(card)
        card.appendChild(imgBook)
        card.appendChild(cardBody)
        cardBody.appendChild(titleBook)
        cardBody.appendChild(priceBook)
        card.appendChild(divButton)
        divButton.appendChild(btnBuy)
        divButton.appendChild(btnRemove)


        function remove() {
            btnRemove.addEventListener('click', function () {
                col.style.display = 'none'
            })
        }

        function addShop() {
            btnBuy.addEventListener('click', function () {
                shopping.push(element)
                localStorage.setItem('book', JSON.stringify(shopping))
            })
        }

    });
}


const shopBody = document.getElementById('shopBody')

function shopDisplay() {
    shopping.forEach(element => {
        const colShop = document.createElement('div')
        colShop.classList.add('col', 'd-flex', 'mb-5')

        const imgBookShop = document.createElement('img')
        imgBookShop.classList.add('card-img-top', 'w-30', 'me-3')
        imgBookShop.setAttribute('src', `${element.img}`)
        imgBookShop.setAttribute('alt', `libro ${element.title}`)

        const cardBodyShop = document.createElement('div')
        cardBodyShop.classList.add('card-body', 'flex-grow-1')

        const titleBookShop = document.createElement('h4')
        titleBookShop.classList.add('card-title', 'text-light', 'mt-3')
        titleBookShop.innerText = `${element.title}`

        const divPrice = document.createElement('div')
        divPrice.classList.add('d-flex', 'flex-column', 'justify-content-between')

        const priceBookShop = document.createElement('p')
        priceBookShop.classList.add('card-text', 'fs-5', 'text-light')
        priceBookShop.innerText = `${element.price}€`

        const btnRemoveShop = document.createElement('i')
        btnRemoveShop.classList.add('bi', 'bi-trash3-fill', 'align-self-end', 'm-2', 'fs-6')
        /* btnRemoveShop.setAttribute('onclick', removeShop()) */

        shopBody.appendChild(colShop)
        colShop.appendChild(imgBookShop)
        colShop.appendChild(cardBodyShop)
        cardBodyShop.appendChild(titleBookShop)
        colShop.appendChild(divPrice)
        divPrice.appendChild(priceBookShop)
        divPrice.appendChild(btnRemoveShop)

    });
}

shopDisplay()