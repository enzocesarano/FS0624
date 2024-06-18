/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/

console.log("*** ESERCIZIO 1***")

let num1 = 8;
let num2 = 10;

if (num1 > num2){
  console.log(num1 + " è maggiore di " + num2);
} else if(num1 == num2) {
  console.log(num1 + " è uguale a " + num2);
} else {
  console.log(num1 + " è minore di " + num2);
}


/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/

console.log("*** ESERCIZIO 2***")

if(num1 != 5){
  console.log("not equal");
} else {
  console.log("equal");
}


/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: usa l'operatore modulo)
*/

console.log("*** ESERCIZIO 3***")

let num3 = 25;
num3 = num3 % 5;

if(num3 == 0){
  console.log("divisibile per 5");
} else {
  console.log("non divisibile per 5");
}


/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/

console.log("*** ESERCIZIO 4 - SOLUZIONE 1***")

let num4 = 15;
let num5 = 7;

if((num4 == 8 || num5 == 8) || ((num4 + num5) == 8) || (num4 - num5) == 8) {
  console.log("il valore di uno di essi è 8 o la loro addizione/sottrazione è uguale a 8");
} else {
  console.log("il valore di uno di essi NON è 8 o la loro addizione/sottrazione NON è uguale a 8");
}


console.log("*** ESERCIZIO 4 - SOLUZIONE 2***")

let num6 = 8;
let num7 = 7;

if(num6 == 8 || num7 == 8) {
  console.log("il valore di uno di essi è 8");
} else if ((num6 + num7) == 8 || (num4 - num5) == 8) {
  console.log("l'addizione o la sottrazione tra i due numeri è uguale a 8");
} else {
  console.log("il valore di uno di essi NON è 8 o la loro addizione/sottrazione NON è uguale a 8");
}

/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/

console.log("*** ESERCIZIO 4***")

let tel = 35;
let batt = 20;

let totalShoppingCart = tel + batt;

let checkout = totalShoppingCart;

if (totalShoppingCart > 50) {
  console.log("l'utente ha diritto alla spedizione gratuita" + ", il checkout è " + checkout + "€")
} else {
  checkout += 10;
  console.log("l'utente NON ha diritto alla spedizione gratuita"  + ", il checkout è " + checkout + "€");
}



/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/

console.log("*** ESERCIZIO 6***")

totalShoppingCart -= totalShoppingCart * 0.20;
checkout = totalShoppingCart;

if (totalShoppingCart > 50) {
  console.log("l'utente ha diritto alla spedizione gratuita" + ", il checkout è " + checkout + "€");
} else {
  checkout += 10;
  console.log("l'utente NON ha diritto alla spedizione gratuita"  + ", il checkout è " + checkout + "€");
}

/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/

console.log("*** ESERCIZIO 7***")

let num8 = 35;
let num9 = 28;
let num10 = 214;

if ((num8 >= num9) && (num9 >= num10)) {
  console.log(num8 + ", " + num9 + ", " + num10);
} else if ((num9 >= num10) && (num10 >= num8)) {
  console.log(num9 + ", " + num10 + ", " + num8);
} else if ((num10 >= num8) && (num8 >= num9)) {
  console.log(num10 + ", " + num8 + ", " + num9);
} else if ((num8 >= num10) && (num10 >= num9)) {
  console.log(num8 + ", " + num10 + ", " + num9);
} else if ((num9 >= num8) && (num8 >= num10)) {
  console.log(num9 + ", " + num8 + ", " + num10);
} else {
  console.log(num10 + ", " + num9 + ", " + num8);
}

/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

console.log("*** ESERCIZIO 8***")

let num11 = 7;

if (typeof num11 === "number") {
  console.log("è un numero");
} else {
  console.log("non è un numero");
}

/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

console.log("*** ESERCIZIO 9***")

let num12 = num11 % 2;

if (num12 === 0) {
  console.log("il numero è pari")
} else {
  console.log("il numero è dispari")
}

/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  let val = 7
  if (val < 10) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
*/

console.log("*** ESERCIZIO 10***")

let val = 4;
if (val < 5) {
    console.log("Meno di 5");
  } else if (val < 10) {
    console.log("Meno di 10");
  } else {
    console.log("Uguale a 10 o maggiore");
  }

/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/

const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}

console.log("*** ESERCIZIO 11***")

me.city = "Toronto";
console.log(me);



/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/

console.log("*** ESERCIZIO 12***")

delete me.lastName;
console.log(me)



/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

console.log("*** ESERCIZIO 13***")

delete me.skills.pop();
console.log(me)



/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/

console.log("*** ESERCIZIO 14***")

let arrayVuoto = [];
console.log(arrayVuoto)

arrayVuoto[0] = 1;
arrayVuoto[1] = 2;
arrayVuoto[2] = 3;
arrayVuoto[3] = 4;
arrayVuoto[4] = 5;
arrayVuoto[5] = 6;
arrayVuoto[6] = 7;
arrayVuoto[7] = 8;
arrayVuoto[8] = 9;
arrayVuoto[9] = 10;

console.log(arrayVuoto)



/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

console.log("*** ESERCIZIO 15***")

arrayVuoto.pop();
arrayVuoto.push(100);
console.log(arrayVuoto)
