/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato.
*/

console.log("*** ESERCIZIO 1 ***")

function area(l1, l2) {
    let risultato = l1 * l2;
    console.log(risultato);
}

area(3, 5);



/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

console.log("*** ESERCIZIO 2 ***")

function crazySum(num1, num2) {
    if (num1 === num2) {
        return (num1 + num2) * 3;
    } else {
        return num1 + num2;
    }
}

console.log(crazySum(4, 4))

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

console.log("*** ESERCIZIO 3 ***")

function crazyDiff(num) {
    if (num > 19) {
        return (num - 19) * 3;
    } else {
        console.log(Math.abs(num - 19));
        return Math.abs(num - 19) * 3;
    }
}

console.log(crazyDiff(17));

/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

console.log("*** ESERCIZIO 4 ***")

function boundary(numIntero) {
    if ((numIntero > 20 && numIntero <= 100) || numIntero === 400) {
        return true;
    } else {
        return false;
    }
}

console.log(boundary(350));


/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

console.log("*** ESERCIZIO 5 ***")

function epify(string) {
    if (string.indexOf('EPICODE') === 0) {
        return string;
    } else {
        let newString = 'EPICODE'
        return string = newString.concat(string);
    }
}

console.log(epify(', FOR EVER EPICODE!'))

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

console.log("*** ESERCIZIO 6 ***")

function check3and7(nPositive) {
    if ((nPositive % 3 === 0) || (nPositive % 7 === 0)) {
        console.log('Il numero fornito è un multiplo di 3 o di 7')
    } else {
        console.log('Il numero fornito NON è un multiplo di 3 o di 7')
    }
}

check3and7(16);

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

console.log("*** ESERCIZIO 7 ***")

function reverseString(string) {
    /* return string.split('').reverse().join(''); */
    let inverso = string.split('');
    inverso.reverse();
    inverso = inverso.join('');
    return string = inverso;
}

console.log(reverseString('EPICODE'))

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/

console.log("*** ESERCIZIO 8 ***")

function upperFirst(string) {
    let firstLetter = string.split(' ');
    
    for (let i = 0; i < firstLetter.length; i++) {
            firstLetter[i] = firstLetter[i].charAt(0).toUpperCase() + firstLetter[i].slice(1);
    }
    
    return firstLetter.join(' ');
}

console.log(upperFirst('ciao, mi chiamo vincenzo'))


/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

console.log("*** ESERCIZIO 9 ***")

function cutString(string) {
    return string.slice(1, -1);
}

console.log(cutString('Ciao, mi chiamo Vincenzo'));

/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

console.log("*** ESERCIZIO 10 ***")

function giveMeRandom(casual) {
    let random1 = [];

    for (let i = 0; i < casual; i++) {
        let random2 = (Math.floor(Math.random() * 11));
        if (!random1.includes(random2)) {
            random1.push(random2);
        } else {
            i--;
        }
    }

    return random1;
}

console.log(giveMeRandom(9))