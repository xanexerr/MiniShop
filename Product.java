
public class Product {
        private String pid;
        private String pname;
        private double price;
        private int stock;

        public Product(String pid, String pname, double price, int stock) {
                this.pid = pid;
                this.pname = pname;
                this.price = price;
                this.stock = stock;
        }

        public void reduceStock(int quantity) {
                // ##################################################
                // TODO: ลดจำนวนสินค้าในคลัง
                // ถ้าจำนวนสินค้าในคลังน้อยกว่าจำนวนที่ลูกค้าสั่ง แสดงข้อความ "Out of stock"

                // ##################################################
        }

        public String getId() {
                return pid;
        }

        public int getStock() {
                return stock;
        }

        public double getPrice() {
                return price;
        }

        public String getName() {
                return pname;
        }
}
