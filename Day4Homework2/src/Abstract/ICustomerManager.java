package Abstract;

import Entities.Customer;

public interface ICustomerManager {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
