public class Main {
        public static void main(String[] args) {

                Store store = new Store();

                // สร้างสินค้า
                Product p1 = new Product("P001", "น้ำดื่ม", 10.0, 100);
                Product p2 = new Product("P002", "ขนมปัง", 25.0, 50);
                store.addProduct(p1);
                store.addProduct(p2);

                // สร้างลูกค้า
                Customer customer = new Customer("Xanexer", "098-xxx-xxxx");

                // ลูกค้าเพิ่มสินค้าลงตะกร้า
                Cart cart = new Cart();
                cart.addProduct(p1, 2); // น้ำดื่ม 2 ขวด
                cart.addProduct(p2, 1); // ขนมปัง 1 ชิ้น

                // สร้างคำสั่งซื้อ
                Order order = new Order(customer, cart);
                store.processOrder(order);

                // ##################################################
                // TODO:สร้าง Test Case สำหรับการทดสอบ เพิ่มอีก 3 product 1 ลูกค้า 1 คำสั่งซื้อ

                // ##################################################

                // แสดงยอดขายรวม
                System.out.println("ยอดขายทั้งหมดของร้าน: " + store.getTotalRevenue());

        }
}
