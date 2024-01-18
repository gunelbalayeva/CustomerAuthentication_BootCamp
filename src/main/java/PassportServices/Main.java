package PassportServices;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager = new BaseCustomerManager() {
            @Override
            public boolean checkIfRealPerson(Customer customer) throws Exception {
                return false;
            }
        };
    }
}
