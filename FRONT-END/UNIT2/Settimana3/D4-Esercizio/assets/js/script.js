
const row = document.getElementById('row')



const object = function (query) {
    fetch(`https://api.pexels.com/v1/search?query=${query}`, {

        method: 'GET',

        headers: {
            Authorization: "CUcsicwb7J1NW1AgqMMMbkNv5f7sPWArtE5uug15So7gMoXPQdGuZtxy"
        },

    })
        .then((response) => {
            if (response.ok) {
                return response.json()
            } else {
                throw new Error('error')
            }
        })

        .then((imgSrc) => {
            displayCard(imgSrc.photos)
            console.log(imgSrc.photos)
        })

        .catch((error) => {
            console.log('errore', error)
        })
}


const load = document.getElementById('load')
const load2 = document.getElementById('load-2')
const form = document.getElementById('form')
const inputSearch = document.getElementById('search')



load.addEventListener('click', function () {
    object('soccer');
});

load2.addEventListener('click', function () {
    object('cat');
});

form.addEventListener('submit', function (e) {
    e.preventDefault()
    object(inputSearch.value)
})


function displayCard(card) {
    row.innerHTML = ''
    card.forEach((element) => {
        row.innerHTML += `
            <div class="col col-md-4">
                <div class="card mb-4 shadow-sm">
                    <img
                      src="${element.src.tiny}"
                      class="bd-placeholder-img card-img-top"
                    />
                    <div class="card-body">
                      <h5 class="card-title fs-6">Photographer: <strong class="fs-5">${element.photographer}</strong></h5>
                      <p class="card-text">${element.alt}
                      </p>
                      <div
                        class="d-flex justify-content-between align-items-center">
                        <div class="btn-group">
                          <button
                            type="button"
                            class="btn btn-sm btn-outline-secondary view">
                            View
                          </button>
                          <button
                            type="button"
                            class="btn btn-sm btn-outline-secondary hidden">
                            Hide
                          </button>
                        </div>
                        <small class="text-muted">id: ${element.id}</small>
                      </div>
                    </div>
                  </div>
                </div>
                `

        const view = document.querySelectorAll('.view')
        
        view.forEach(btn => {
            btn.addEventListener('click', function () {
                location.assign(`./details.html?photoId=${element.id}`)
            })
        })


    });

    const hidden = document.querySelectorAll('.hidden')


    hidden.forEach(button => {
        button.addEventListener('click', function (e) {
            e.target.closest('.col').remove()
        })
    })


}


