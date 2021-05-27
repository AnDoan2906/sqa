package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Customer;

public interface CustomerService {
	List<Customer> getAllEmployees();
	void saveEmployee(Customer customer);
	Customer getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Customer> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
