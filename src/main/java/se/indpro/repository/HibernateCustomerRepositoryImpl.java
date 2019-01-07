package se.indpro.repository;

import java.util.ArrayList;
import java.util.List;

import se.indpro.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see se.indpro.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Tousif");
		customer.setLastName("Iqbal");
		customers.add(customer);
		return customers;
	}
}
