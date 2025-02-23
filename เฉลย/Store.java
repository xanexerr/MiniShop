import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Store {
        private List<Product> products = new ArrayList<>();
        private double totalRevenue = 0;

        public void addProduct(Product product) {
                products.add(product);
        }

        public void processOrder(Order order) {
                for (Map.Entry<Product, Integer> entry : order.getItems().entrySet()) {
                        entry.getKey().reduceStock(entry.getValue());
                }
                totalRevenue += order.getTotalAmount();
                System.out.println("Total Price : " + order.getTotalAmount() + " Baht\n");
        }

        public String getTotalRevenue() {
                return "\nTotal Sell : " + totalRevenue +" Baht.";
        }
}
