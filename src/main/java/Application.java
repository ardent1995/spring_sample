import se.indpro.service.CustomerService;
import se.indpro.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
