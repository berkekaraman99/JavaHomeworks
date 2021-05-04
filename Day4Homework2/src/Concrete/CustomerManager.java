package Concrete;

import Entities.Customer;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerManager;

public class CustomerManager implements ICustomerManager {
	private ICustomerCheckService customerCheckService;
	
	public CustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	public void add(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println(customer.getFirstName() + " adlı kullanıcı doğrulandı.");
			System.out.println(customer.getFirstName() + " adlı kullanıcı eklendi.");
		}
		else{
			System.out.println(customer.getFirstName() + " adlı kullanıcı doğrulanamadı.");
		}
		
	}
	
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " adlı kullanıcının bilgileri güncellendi.");
	}
	
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " adlı kullanıcı silindi.");
	}
	
}
