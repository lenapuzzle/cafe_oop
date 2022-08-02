import java.util.ArrayList;


public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.50;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.50;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.10;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 5.00;


        Order order1 = new Order();
        order1.name = "Cindhury";
        order1.total = 3.50;
        order1.isReady = true;

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 4.50;
        order2.isReady = false;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 2.10;
        order3.isReady = true;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 5.00;
        order4.isReady = false;

    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.isReady);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.isReady);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.isReady);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.isReady);
    }
}