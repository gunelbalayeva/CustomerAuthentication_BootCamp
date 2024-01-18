package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class SturbucksCustumerManager extends BaseCustomerManager {
    private ICustomerCheckService checkService;

    public SturbucksCustumerManager(ICustomerCheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if (checkService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
          System.out.println("not a valid person");
        }
    }

    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        return false;
    }
}
