import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(1, "Laptop", 15000000, 10);
        products[1] = new Product(2, "Smartphone", 12000000, 5);
        products[2] = new Product(3, "Headphone", 500000, 30);
        products[3] = new Product(4, "Mouse", 300000, 50);
        products[4] = new Product(5, "Keyboard", 800000, 40);


        System.out.println("=== PRODUCTS LIST ===");
        for (Product p : products) {
            p.display();
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter product name: ");
        String searchName = sc.nextLine();

        boolean found = false;
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(searchName)) {
                System.out.println("product: ");
                p.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("product not found");
        }

        System.out.println("\n=== Products with price > 1,000,000 ===");
        for (Product p : products) {
            if (p.getInventoryValue() > 1000000) {
                p.display();
            }
        }


        Product maxQuantityProduct = products[0];
        for (Product p : products) {
            if (p.getQuantity() > maxQuantityProduct.getQuantity()) {
                maxQuantityProduct = p;
            }
        }
        System.out.println("\n=== Product with the highest inventory ===");
        maxQuantityProduct.display();


        System.out.println("\n=== Statistics ==="); //statistics = thong ke
        System.out.printf("Total products: %d\n", Product.getTotalProduct());
        System.out.printf("Overall inventory value: %.2f\n", Product.getTotalInventoryValue());
        System.out.printf("Average price: %.2f\n", Product.getAveragePrice());

        Product.setStoreName("Kho miền Nam");
        System.out.println("\nUpdated store name: " + Product.getStoreName());

        sc.close();
    }
}
