public class Main {
        public static void main(String[] args) {
                Store store = new Store();

                // สร้างสินค้า
                Product p1 = new Product("P001", "Nam Sing", 10.0, 100);
                Product p2 = new Product("P002", "Cat Loaf", 25.0, 50);
                Product p3 = new Product("P003","Yasrifun",12.0,1);
                

                // สร้างลูกค้า
                Customer customer = new Customer("XANEXER", "082-972-1671");
                store.addProduct(p1);
                store.addProduct(p2);
                store.addProduct(p3);
                // ลูกค้าเพิ่มสินค้าลงตะกร้า
                Cart cart = new Cart();
                System.out.println(customer.CustomerInfo());
                cart.addProduct(p1, 2); // น้ำดื่ม 2 ขวด
                cart.addProduct(p2, 50); // ขนมปัง 1 ชิ้น

                // สร้างคำสั่งซื้อ
                Order order = new Order(customer, cart);
                store.processOrder(order);
                cart.clearCart();
                
                
                Customer c2 = new Customer("Sand","099-999-9999");
                System.out.println(c2.CustomerInfo());
                cart.addProduct(p2, 1);
                cart.addProduct(p3, 1);
                // แสดงยอดขายรวม
                
                order = new Order(customer, cart);
                store.processOrder(order);
                cart.clearCart();
                System.out.println(store.getTotalRevenue());
        }
}
