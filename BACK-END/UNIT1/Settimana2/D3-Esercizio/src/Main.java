import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
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

        System.out.println("******************* ESERCIZIO 1 *******************");

        List<Product> listaFiltrataBooks = listProducts.stream().filter(product -> product.getCategory().equals("Books") && product.getPrice() > 100).toList();
        System.out.println(listaFiltrataBooks);


        System.out.println("******************* ESERCIZIO 2 *******************");

        List<Order> listaOrderBaby = listOrdini.stream().filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("Baby"))).toList();
        System.out.println(listaOrderBaby);


        System.out.println("******************* ESERCIZIO 3 *******************");

        List<Product> listaProdottiBoys = listProducts.stream().filter(product -> product.getCategory().equals("Boys")).map(product -> new Product(product.getId(), product.getName(), product.getCategory(), product.getPrice() * 0.9)).toList();
        System.out.println(listaProdottiBoys);


        System.out.println("******************* ESERCIZIO 4 *******************");

        LocalDate startDate = LocalDate.of(2021, 2, 1);
        LocalDate endDate = LocalDate.of(2021, 4, 1);

        List<Order> listaOrdiniClientiLv2 = listOrdini.stream().filter(order -> order.getCostumer().getTier() == 2 && (order.getOrderDate().isAfter(startDate) && order.getOrderDate().isBefore(endDate))).toList();
        List<Product> listaProdottiLv2 = listaOrdiniClientiLv2.stream().flatMap(order -> order.getProducts().stream()).toList();

        System.out.println(listaProdottiLv2);
    }
}