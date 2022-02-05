package br.com.wsil.cleanarch.domain.repository;

import br.com.wsil.cleanarch.domain.Customer;
import br.com.wsil.cleanarch.domain.Page;
import br.com.wsil.cleanarch.domain.PageRequest;

import java.util.Optional;

public interface CustomerRepository {

    Customer create(Customer customer);

    Customer update(Customer customer);

    Optional<Customer> find(String id);

    Page<Customer> find(PageRequest page);

    void delete(Customer customer);

}
