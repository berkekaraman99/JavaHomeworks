import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerService;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer();
		customer.setFirstName("Ahmet Berke");
		customer.setLastName("Karaman");
		customer.setId(1);
		customer.setNationalityId("10001202174");
		customer.setDateOfBirth(LocalDate.of(1999, 11, 1));
		
		customerManager.Save(customer);
		
		//customerManager.Save(new Customer(1, "Ahmet Berke", "Karaman", LocalDate.of(1999, 11, 1), "10001202174"));
	}

}
