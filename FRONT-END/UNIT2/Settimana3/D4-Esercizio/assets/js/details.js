const addressBarParameters = new URLSearchParams(location.search).get('photoId')
const row = document.getElementById('row')
const main = document.getElementById('main')

const object = function (query) {
    fetch(`https://api.pexels.com/v1/photos/${query}`, {

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
            console.log(imgSrc)
            main.style.backgroundColor = `${imgSrc.avg_color}`
            row.innerHTML += `
            <div class="col col-6">
                <div class="card mb-4 shadow-sm">
                    <img
                      src="${imgSrc.src.large2x}"
                      class="bd-placeholder-img card-img-top"
                    />
                    <div class="card-body">
                      <h5 class="card-title fs-6">Photographer: <strong class="fs-5">${imgSrc.photographer}</strong></h5>
                      <a class="card-text">${imgSrc.photographer_url}
                      </a>
                      <div
                        class="d-flex justify-content-center align-items-center">
                        <small class="text-muted">id: ${imgSrc.id}</small>
                      </div>
                    </div>
                  </div>
                </div>
                `
        })

        .catch((error) => {
            console.log('errore', error)
        })
}


object(addressBarParameters)
