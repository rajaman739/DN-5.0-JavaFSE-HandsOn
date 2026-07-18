public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(105, "Keyboard", "Electronics"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Phone", "Electronics")
        };

        System.out.println("Linear Search");

        Product result1 = SearchAlgorithms.linearSearch(products, 102);

        if (result1 != null) {
            System.out.println(result1);
        }

        SearchAlgorithms.sortProducts(products);

        System.out.println("\nBinary Search");

        Product result2 = SearchAlgorithms.binarySearch(products, 102);

        if (result2 != null) {
            System.out.println(result2);
        }
    }
}