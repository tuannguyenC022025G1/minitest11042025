public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private static String storeName = "Kho Tổng";
    private static int totalProduct = 0;
    private static double totalInventoryValue = 0;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        totalProduct++;
        totalInventoryValue += getInventoryValue();
    }

    public void display() {
        System.out.printf("ID: %d; Tên: %s; Giá: %.2f; Số lượng: %d; Giá trị tồn kho: %.2f; Kho: %s\n",
                id, name, price, quantity, getInventoryValue(), storeName);

    }

    public double getInventoryValue() {
        return price * quantity;
    }

    public static double getAveragePrice() {
        return totalProduct == 0 ? 0 : totalInventoryValue / totalProduct;
    }

    public static String getStoreName() {
        return storeName;
    }

    public static void setStoreName(String name) {
        storeName = name;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public static int getTotalProduct() {
        return totalProduct;
    }

    public static double getTotalInventoryValue() {
        return totalInventoryValue;
    }
}
