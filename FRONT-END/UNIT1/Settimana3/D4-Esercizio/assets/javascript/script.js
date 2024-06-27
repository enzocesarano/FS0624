const tabellone = document.getElementById('tabellone');
const btnRandomNumber = document.getElementById('btnRandomNumber');


const totalTabellone = [];

function numTabellone() {
    for (let i = 1; i < 91; i++) {
        totalTabellone.push(i);
        const divNum = document.createElement('div');
        divNum.classList.add('divNumeri');
        divNum.setAttribute('id', `num${i}`);
        const h4Num = document.createElement('h4');
        h4Num.innerText = [i];
        tabellone.appendChild(divNum);
        divNum.appendChild(h4Num);
    };
}

numTabellone();




btnRandomNumber.addEventListener('click', function () {
    randomNumber();
    
})


const panariello = [];

function randomNumber() {
    let random1 = Math.floor(Math.random() * 89 + 1);

    if (!panariello.includes(random1)) {
        panariello.push(random1);
    } else {
        randomNumber();
    };
}


function equal() {
    if(panariello.includes(totalTabellone)){
        
    }
}