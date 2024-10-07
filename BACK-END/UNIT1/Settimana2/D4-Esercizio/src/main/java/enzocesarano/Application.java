package enzocesarano;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        Product actionFigure = new Product(1, "Action Figure", "Boys", 19.99);
        Product adventureNovel = new Product(2, "Adventure Novel", "Books", 12.99);
        Product babyStroller = new Product(3, "Baby Stroller", "Baby", 249.99);
        Product shirt = new Product(4, "T-shirt", "Boys", 15.99);
        Product pictureBook = new Product(5, "Picture Book", "Books", 119.99);
        Product toyCar = new Product(6, "Toy Car", "Boys", 29.99);
        Product babyBottle = new Product(7, "Baby Bottle", "Baby", 7.50);
        Product educationalToy = new Product(8, "Educational Toy", "Baby", 34.99);
        Product youngFantasyBook = new Product(9, "Young Fantasy Book", "Books", 180.99);
        Product backpackBoy = new Product(10, "Boys' Backpack", "Boys", 24.99);

        ArrayList<Product> listProducts = new ArrayList<>(Arrays.asList(
                actionFigure,
                adventureNovel,
                babyStroller,
                shirt,
                pictureBook,
                toyCar,
                babyBottle,
                educationalToy,
                youngFantasyBook,
                backpackBoy
        ));

        Customer marioRossi = new Customer(1001, "Mario Rossi", 1);
        Customer giuliaBianchi = new Customer(1002, "Giulia Bianchi", 2);
        Customer lucaVerdi = new Customer(1003, "Luca Verdi", 2);
        Customer francescaNeri = new Customer(1004, "Francesca Neri", 3);

        ArrayList<Customer> listaClienti = new ArrayList<>(Arrays.asList(
                marioRossi,
                giuliaBianchi,
                lucaVerdi,
                francescaNeri
        ));

        Order mario = new Order(1, "In elaborazione", LocalDate.of(2021, 2, 2), LocalDate.of(2021, 2, 10),
                Arrays.asList(actionFigure, adventureNovel, toyCar, backpackBoy), marioRossi);
        Order giulia = new Order(2, "Spedito", LocalDate.of(2021, 3, 20), LocalDate.of(2021, 3, 25),
                Arrays.asList(babyStroller, babyBottle, educationalToy), giuliaBianchi);
        Order luca = new Order(3, "Consegnato", LocalDate.of(2021, 3, 22), LocalDate.of(2021, 3, 28),
                Arrays.asList(shirt, pictureBook, youngFantasyBook, adventureNovel), lucaVerdi);
        Order francesca = new Order(4, "In elaborazione", LocalDate.of(2023, 9, 10), LocalDate.of(2023, 9, 15),
                Arrays.asList(toyCar, backpackBoy, pictureBook, babyStroller, educationalToy), francescaNeri);

        ArrayList<Order> listOrdini = new ArrayList<>(Arrays.asList(
                mario,
                giulia,
                luca,
                francesca
        ));

        System.out.println("\n******************* ESERCIZIO 1 *******************\n");
        Map<String, List<Order>> ordiniPerCliente = listOrdini.stream().collect(Collectors.groupingBy(order -> order.getCustomer().getName(), TreeMap::new, Collectors.toList()));
        ordiniPerCliente.forEach((nomeCliente, ordini) -> System.out.println("Cliente: " + nomeCliente + ", " + ordini));

        System.out.println("\n******************* ESERCIZIO 2 *******************\n");
        Map<String, Double> totalePerCliente = listOrdini.stream().collect(Collectors.groupingBy(order -> order.getCustomer().getName(), Collectors.summingDouble(order -> order.getProducts().stream().mapToDouble(Product::getPrice).sum())));
        totalePerCliente.forEach((nomeCliente, totaleOrdini) -> System.out.println("Cliente: " + nomeCliente + ", " + totaleOrdini + "€"));

        System.out.println("\n******************* ESERCIZIO 3 *******************\n");
        List<Product> prodottiPerPrezzo = listProducts.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).limit(3).toList();
        prodottiPerPrezzo.forEach((prodotto) -> System.out.println("Prodotti in ordine di prezzo: " + prodotto.getName() + ", " + prodotto.getPrice() + "€"));

        System.out.println("\n******************* ESERCIZIO 4 *******************\n");
        Double mediaOrdini = listOrdini.stream().collect(Collectors.averagingDouble(order -> order.getProducts().stream().mapToDouble(Product::getPrice).sum()));
        System.out.println("La media totale degli ordini: " + mediaOrdini + "€");

        System.out.println("\n******************* ESERCIZIO 5 *******************\n");
        Map<String, Double> totalePerCategoria = listProducts.stream().collect(Collectors.groupingBy(Product::getCategory, TreeMap::new, Collectors.summingDouble(Product::getPrice)));
        totalePerCategoria.forEach((category, totalePrezzi) -> System.out.println("Category: " + category + ", " + totalePrezzi + "€"));
    }
}
