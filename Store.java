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
                // ##################################################
                // todo: ประมวลผลคำสั่งซื้อ
                // 1. หายอดรวมของคำสั่งซื้อ
                // 2. ลดจำนวนสินค้าในคลัง
                // 3. บันทึกยอดขาย
                // ##################################################
        }

        public double getTotalRevenue() {
                return totalRevenue;
        }
}
