
import java.util.ArrayList;
import java.util.List;

public class Customer {
        private String name;
        private String phone;
        private List<Order> orderHistory;

        public Customer(String name, String phone) {
                // ##################################################
                // TODO: Write Contructor

                // ##################################################
        }

        public void addOrder(Order order) {
                // #####################################
                // TODO: Add order to orderHistory

                // ##################################################
        }

        public List<Order> getOrderHistory() {
                return orderHistory;
        }

        public String getName() {
                return name;
        }

        public String getPhone() {
                return phone;
        }
}
