const hours = document.getElementById('hours');
const minutes = document.getElementById('minutes');
const seconds = document.getElementById('seconds');

let s = parseInt(sessionStorage.getItem("sec")) || 0;
let m = parseInt(sessionStorage.getItem("min")) || 0;
let h = parseInt(sessionStorage.getItem("hour")) || 0;

function day() {
    seconds.innerText = s < 10 ? `0${s}` : s;
    minutes.innerText = m < 10 ? `0${m}` : m;
    hours.innerText = h < 10 ? `0${h}` : h;
}

function second() {
    s++;
    if (s > 59) {
        s = 0;
        minute();
    }
    sessionStorage.setItem("sec", s);
    day();
}

function minute() {
    m++;
    if (m > 59) {
        m = 0;
        hour();
    }
    sessionStorage.setItem("min", m);
}

function hour() {
    h++;
    if (h > 23) {
        h = 0;
    }
    sessionStorage.setItem("hour", h);
}

day();
setInterval(second, 1000);



const form = document.getElementById('form')
const yourName = document.getElementById('yourName')
const btnInvia = document.getElementById('btnInvia')
const btnReset = document.getElementById('btnReset')
const listDisplay = document.getElementById('list')
const namesDisplay = document.getElementById('name')

const names = []

display()

form.addEventListener('submit', function (e) {
    e.preventDefault()
    pushNames()
    display()
    form.reset()
})

function pushNames() {
    names.pop()
    names.push(yourName.value)
    localStorage.setItem('names', names)
    console.log(names)
}

function display() {
    namesDisplay.innerText = ''
    const namesStorage = localStorage.getItem('names')
    namesDisplay.innerText = namesStorage
    listDisplay.appendChild(namesDisplay)
}


btnReset.addEventListener('click', function (e) {
    e.preventDefault()
    localStorage.clear()
    namesDisplay.innerText = ''
})