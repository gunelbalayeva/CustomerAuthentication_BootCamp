package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {


    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        return false;
    }
}
