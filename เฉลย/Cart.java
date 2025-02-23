
import java.util.HashMap;
import java.util.Map;

public class Cart {
        Map<Product, Integer> items = new HashMap<>();

        public void addProduct(Product product, int quantity) {
                if (product.getStock() >= quantity) {
                        items.put(product, items.getOrDefault(product, 0) + quantity);
                        System.out.println(product.getName()+" has been Added. "+ quantity + " Unit");
                } else {
                		System.out.println(product.getName()+" Out of stock!");
                }
        }

        public double calculateTotal() {
                double total = 0;
                for (Map.Entry<Product, Integer> entry : items.entrySet()) {
                        total += entry.getKey().getPrice() * entry.getValue();
                }
                return total;
        }

        public void clearCart() {
                items.clear();
        }
}
