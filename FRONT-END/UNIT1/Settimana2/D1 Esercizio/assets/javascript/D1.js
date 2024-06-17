/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/* I principali datatype in JS sono i seguenti:
    1   Stringhe: tutto ciò che è scritto tra apici/virgolette è stringa. Vengono interpretate da JS come "testo" (esempio let testo = "ciao sono Vincenzo, ho 32 anni";). 
        Per testo intentediamo tutti i caratteri possibili cioè lettere maiuscole/minuscole, numeri, spazi e simboli;

    2   Numeri: tutti i numeri scritti senza apici/virgolette è numero. Vengono interpretate da JS come "numero" (esempio let numero = 30;). In questo caso 30 è diverso da "30" perchè
        è inteso come numero vero e proprio e non più come testo;
        
    3   Booleani: i booleani sono dati che permettono di verificare la vericità di una condizione è possono essere solo di due tipi, ossia vero o falso, scritto in inglese "true" o "false".*/

/* ESERCIZIO 2
 Crea una variable chiamata "myName" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

console.log("*** ESERCIZIO 2 ***");

const myName = "Vincenzo";
console.log(myName);

/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

console.log("*** ESERCIZIO 3 ***");

console.log(12+20);


let n1 = 12;
let n2 = 20;

n2 += n1;
console.log(n2);

/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

console.log("*** ESERCIZIO 4 ***");

let x = 12;
console.log(x);

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "myName" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

console.log("*** ESERCIZIO 5 ***");

console.log("const myName = Cesarano; SyntaxError: Identifier 'myName' has already been declared. Una constante può essere dichiarata una sola volta ");


/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

console.log("*** ESERCIZIO 6 ***");

x -= 4;
console.log(x);


/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

console.log("*** ESERCIZIO 6 ***");

let name1 = "john";
let name2 = "John";

verify = name1 == name2 ? "I due nomi sono uguali." : "I due nomi sono diversi";
console.log(verify);


let newName1 = name1.toLowerCase();
let newName2 = name2.toLowerCase();

verify2 = newName1 == newName2 ? "I due nomi sono uguali." : "I due nomi sono diversi";
console.log(verify2);