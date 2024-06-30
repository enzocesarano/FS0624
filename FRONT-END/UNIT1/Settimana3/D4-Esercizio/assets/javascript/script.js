const tabellone = document.getElementById('tabellone');
const btnRandomNumber = document.getElementById('btnRandomNumber');
const ultimoEstratto = document.getElementById('ultimoEstratto');
const cartelle = document.getElementById('cartelle');
const btnBuy = document.getElementById('btnBuy');
const buyCartelle = document.getElementById('buyCartelle');

const panariello = [];
const totalTabellone = [];
const numberCartelle = [];

function numTabellone() {
    for (let i = 1; i < 91; i++) {
        totalTabellone.push(i);
        const divNum = document.createElement('div');
        divNum.classList.add('divNumeri');
        const h4Num = document.createElement('h4');
        h4Num.innerText = [i];
        tabellone.appendChild(divNum);
        divNum.appendChild(h4Num);
    };
}

numTabellone();


btnRandomNumber.addEventListener('click', function (e) {
    e.preventDefault();
    randomNumber();
    equal();
})


function randomNumber() {
    let random1 = Math.floor(Math.random() * 90 + 1);

    if (!panariello.includes(random1)) {
        panariello.push(random1);
        ultimoEstratto.innerText = `${random1}`;
    } else {
        randomNumber();
    };
}




btnBuy.addEventListener('click', function (e) {
    e.preventDefault();

    numCartelle(parseInt(buyCartelle.value))
})

function numCartelle(num) {
    for (let i = 0; i < num; i++) {
        const divCartella = document.createElement('div');
        divCartella.classList.add('cartella');


        const currentCartellaNumbers = [];
        while (currentCartellaNumbers.length < 15) {
            const num = Math.floor(Math.random() * 90) + 1;
            if (!currentCartellaNumbers.includes(num)) {
                currentCartellaNumbers.push(num);
            }
        }

        currentCartellaNumbers.forEach(num => {
            const divNum = document.createElement('div');
            divNum.classList.add('divNumeri');
            const h4Num = document.createElement('h4');
            h4Num.innerText = num;
            divCartella.appendChild(divNum);
            divNum.appendChild(h4Num);
        });
        cartelle.appendChild(divCartella);
    }
}




function equal() {
    const boh = document.querySelectorAll('.divNumeri');
    boh.forEach(item => {
        if (panariello.includes(parseInt(item.textContent))) {
            item.classList.add('divEstratti');
        }
    });
}