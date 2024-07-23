// PRIMO ESERCIZIO

class User {
    constructor(_firstName, _lastName, _age, _location) {
        this.firstName = _firstName
        this.lastName = _lastName
        this.age = _age
        this.location = _location
    }

    compara(utenti) {
        if (this.age > utenti.age) {
            return `${this.firstName} è più grande di ${utenti.firstName}`
        } else if (this.age < utenti.age) {
            return `${utenti.firstName} è più grande di ${this.firstName}`
        } else {
            return `${this.firstName} e ${utenti.firstName} hanno la stessa età`
        }
    }

}

const utente1 = new User('Vincenzo', 'Cesarano', 32, 'Napoli')
const utente2 = new User('Mario', 'Rossi', 52, 'Roma')

console.log(utente1.compara(utente2))



// SECONDO ESERCIZIO



class Pet {
    constructor(_petName, _ownerName, _species, _breed) {
        this.petName = _petName
        this.ownerName = _ownerName
        this.species = _species
        this.breed = _breed
    }

    comparaOwner(pets) {
        if (this.ownerName = pets.ownerName) {
            console.log('true')
        }
    }
}

const pet1 = new Pet('Bobby', 'Vincenzo', 'Cane', 'Pastore Tedesco')
const pet2 = new Pet('Luna', 'Vincenzo', 'Gatto', 'Persiano')

console.log(pet1.comparaOwner(pet2))



const form = document.getElementById('form')

const pets = [];

form.addEventListener('submit', function (e) {
    e.preventDefault()

    const inputName = document.getElementById('petName').value
    const inputOwner = document.getElementById('ownerName').value
    const inputSpecies = document.getElementById('speciesName').value
    const inputBreed = document.getElementById('breedName').value

    const pet = new Pet(inputName, inputOwner, inputSpecies, inputBreed)
    pets.push(pet)
    
    const list = document.getElementById('list')
    list.classList.add('row', 'row-cols-5')

    list.innerText = ''

    for (let i = 0; i < pets.length; i++) {

        const colonna = document.createElement('div')
        colonna.classList.add('col', 'd-flex', 'justify-content-center', 'mb-4')

        const card = document.createElement('div')
        card.classList.add('card')
        card.style.width = '18rem'

        const cardBody = document.createElement('div')
        cardBody.classList.add('card-body', 'd-flex', 'flex-column')

        const namePet = document.createElement('p')
        namePet.classList.add('d-flex', 'justify-content-between', 'align-items-baseline')
        namePet.innerHTML = `Name: <span>${inputName}</span>`

        const ownerPet = document.createElement('p')
        ownerPet.classList.add('d-flex', 'justify-content-between', 'align-items-baseline')
        ownerPet.innerHTML = `Owner: <span>${inputOwner}</span>`

        const speciesPet = document.createElement('p')
        speciesPet.classList.add('d-flex', 'justify-content-between', 'align-items-baseline')
        speciesPet.innerHTML = `Species: <span>${inputSpecies}</span>`

        const breedPet = document.createElement('p')
        breedPet.classList.add('d-flex', 'justify-content-between', 'align-items-baseline')
        breedPet.innerHTML = `Breed: <span>${inputBreed}</span>`

        const deleteCard = document.createElement('i')
        deleteCard.classList.add('bi', 'bi-trash3-fill')


        list.appendChild(colonna)
        colonna.appendChild(card)
        card.appendChild(cardBody)
        cardBody.appendChild(namePet)
        cardBody.appendChild(ownerPet)
        cardBody.appendChild(speciesPet)
        cardBody.appendChild(breedPet)
        cardBody.appendChild(deleteCard)

    }

    form.reset()



    console.log(pets)
})


function deleteElementList(element) {
    pets.splice(element, 1);
}