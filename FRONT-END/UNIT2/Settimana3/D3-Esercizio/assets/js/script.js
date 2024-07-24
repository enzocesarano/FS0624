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
        card.classList.add('card', 'h-100', 'justify-content-between', 'shadow')

        const imgBook = document.createElement('img')
        imgBook.classList.add('h-60', 'object-fit-cover')
        imgBook.setAttribute('src', `${element.img}`)
        imgBook.setAttribute('alt', `libro ${element.title}`)

        const cardBody = document.createElement('div')
        cardBody.classList.add('d-flex', 'flex-column', 'justify-content-between', 'p-3', 'flex-grow-1')

        const titleBook = document.createElement('h4')
        titleBook.classList.add('card-title', 'fs-small')
        titleBook.innerText = `${element.title}`

        const priceBook = document.createElement('p')
        priceBook.classList.add('card-text', 'fs-6', 'fw-bold', 'text-center' )
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
                shopDisplay()
            })
        }

    });
}


const shopBody = document.getElementById('shopBody')

function shopDisplay() {
    shopBody.innerText = ''

    shopping.forEach((element1, index) => {
        const colShop = document.createElement('div')
        colShop.classList.add('col', 'd-flex', 'mb-5')

        const imgBookShop = document.createElement('img')
        imgBookShop.classList.add('card-img-top', 'w-30')
        imgBookShop.setAttribute('src', `${element1.img}`)
        imgBookShop.setAttribute('alt', `libro ${element1.title}`)

        const cardBodyShop = document.createElement('div')
        cardBodyShop.classList.add('card-body', 'flex-grow-1', 'p-3')

        const titleBookShop = document.createElement('h4')
        titleBookShop.classList.add('card-title', 'text-light')
        titleBookShop.innerText = `${element1.title}`

        const divPrice = document.createElement('div')
        divPrice.classList.add('d-flex', 'flex-column', 'justify-content-between')

        const priceBookShop = document.createElement('p')
        priceBookShop.classList.add('card-text', 'fs-5', 'text-light')
        priceBookShop.innerText = `${element1.price}€`

        const btnRemoveShop = document.createElement('i')
        btnRemoveShop.classList.add('bi', 'bi-trash3-fill', 'align-self-end', 'm-2', 'fs-4')
        btnRemoveShop.addEventListener('click', function(e) {
                e.target.closest('.col').remove()
                shopping.splice(index, 1)
                localStorage.setItem('book', JSON.stringify(shopping))
                shopDisplay()
        });

        shopBody.appendChild(colShop)
        colShop.appendChild(imgBookShop)
        colShop.appendChild(cardBodyShop)
        cardBodyShop.appendChild(titleBookShop)
        colShop.appendChild(divPrice)
        divPrice.appendChild(priceBookShop)
        divPrice.appendChild(btnRemoveShop)
  
    })
}

shopDisplay()