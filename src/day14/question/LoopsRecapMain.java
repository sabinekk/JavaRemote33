package day14.question;

public class LoopsRecapMain {

    public static void main(String[] args) {

        Product milk = new Product("Milk");
        Product bread = new Product("Bread");
        Product orange = new Product("Orange");

        Product[] cart = new Product[3]; // lenght/size is 3
        cart[0] = milk;
        cart[1] = bread;
        cart[2] = orange;

        System.out.println("Printing items using for loop:");
        for (int index = 0; index < cart.length; index++) {
            System.out.println(index + " . " + cart[index].name);
            //execute some more logic here if needed
            for (Product product : cart) {
                System.out.println(product.name);

            }
        }

    }

}
