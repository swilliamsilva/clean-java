package br.com.wsil.cleanarch.application.impl;

import br.com.wsil.cleanarch.application.DeleteCustomerInteractor;
import br.com.wsil.cleanarch.domain.Customer;
import br.com.wsil.cleanarch.domain.exception.NotFoundException;
import br.com.wsil.cleanarch.domain.repository.CustomerRepository;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class DeleteCustomerInteractorImpl implements DeleteCustomerInteractor {

    private CustomerRepository customerRepository;

    @Inject
    public DeleteCustomerInteractorImpl(
        CustomerRepository customerRepository
    ) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void execute(String id) {
        Customer customer = customerRepository.find(id).orElseThrow(() -> new NotFoundException("customer", id));
        customerRepository.delete(customer);
    }

}
