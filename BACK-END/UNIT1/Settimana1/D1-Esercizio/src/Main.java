import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 3, b = 5;

        System.out.println("ESERCIZIO 1: " + moltiplica(a, b));
        System.out.println("ESERCIZIO 2: " + concatena("ciao", 4));


        String[] array = {"uno", "due", "tre", "quattro", "cinque"};
        String[] nuovoArray = pushInArray(array, "EPICODE");

        System.out.println("ESERCIZIO 3:" );
        for (String elemento : nuovoArray) {
            System.out.println(elemento);
        }


        System.out.println("ESERCIZIO 4:" );
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ciao inserisci il tuo nome");
        String name = scanner.nextLine();

        System.out.println("Ciao inserisci il tuo cognome");
        String surname = scanner.nextLine();

        System.out.println("Ciao inserisci il tuo username");
        String username = scanner.nextLine();

        System.out.println("RISULTATO: " + concatena(name, surname, username));
        System.out.println("ESERCIZIO 4 REVERSE: " + concatena(username, surname, name));

        System.out.println("ESERCIZIO 5: " + perimetroRettangolo(12.52, 14.37));

        System.out.println("ESERCIZIO 6: " + pariDispari(5));



        System.out.println("Inserici il primo lato del triangolo");
        double lato1 = scanner.nextDouble();

        System.out.println("Inserici il secondo lato del triangolo");
        double lato2 = scanner.nextDouble();

        System.out.println("Inserici il terzo lato del triangolo");
        double lato3 = scanner.nextDouble();

        System.out.println("ESERCIZIO 7: " + perimetroTriangolo(lato1, lato2, lato3));
    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }


    public static String concatena(String s, int num) {
        return s + num;
    }


    public static String[] pushInArray(String[] arrayString, String s) {
        String[] newArray = new String[6];

        newArray[0] = arrayString[0];
        newArray[1] = arrayString[1];
        newArray[2] = s;
        newArray[3] = arrayString[2];
        newArray[4] = arrayString[3];
        newArray[5] = arrayString[4];

        return newArray;
    }

    public static String concatena(String name, String surname, String username) {
        return name + surname + username;
    }

    public static double perimetroRettangolo(double lato1, double lato2) {
        return (lato1 + lato2) * 2;
    }

    public static int pariDispari(int number) {
        if (number % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        double p = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(p * (p - lato1) * (p - lato2) * (p - lato3));
    }

}
