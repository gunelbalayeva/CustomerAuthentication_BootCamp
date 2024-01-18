package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService, ICustomerCheckService {


    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("saves to do:" + customer.getFirstName());
    }
}
