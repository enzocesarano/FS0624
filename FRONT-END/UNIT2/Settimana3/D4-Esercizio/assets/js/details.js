const addressBarParameters = new URLSearchParams(location.search).get('photoId')


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
            row.innerHTML += `
            <div class="col col-md-4">
                <div class="card mb-4 shadow-sm">
                    <img
                      src="${imgSrc.src.tiny}"
                      class="bd-placeholder-img card-img-top"
                    />
                    <div class="card-body">
                      <h5 class="card-title fs-6">Photographer: <strong class="fs-5">${imgSrc.photographer}</strong></h5>
                      <p class="card-text">${imgSrc.alt}
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
