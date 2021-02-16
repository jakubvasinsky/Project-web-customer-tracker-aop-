package sk.kosickaakademia.vasinsky.projectWCTaop.service;

import java.util.List;

import sk.kosickaakademia.vasinsky.projectWCTaop.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	

}
