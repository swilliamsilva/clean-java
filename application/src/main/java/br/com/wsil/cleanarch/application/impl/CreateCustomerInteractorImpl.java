package br.com.wsil.cleanarch.application.impl;

import br.com.wsil.cleanarch.application.CreateCustomerInteractor;
import br.com.wsil.cleanarch.application.request.CreateCustomerRequest;
import br.com.wsil.cleanarch.application.response.CustomerResponse;
import br.com.wsil.cleanarch.domain.Customer;
import br.com.wsil.cleanarch.domain.exception.BusinessException;
import br.com.wsil.cleanarch.domain.repository.CustomerRepository;
import br.com.wsil.cleanarch.domain.service.CustomerScoreService;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CreateCustomerInteractorImpl implements CreateCustomerInteractor {

    private CustomerRepository customerRepository;
    private CustomerScoreService customerScoreService;

    @Inject
    public CreateCustomerInteractorImpl(
        CustomerRepository customerRepository,
        CustomerScoreService customerScoreService
    ) {
        this.customerRepository = customerRepository;
        this.customerScoreService = customerScoreService;
    }

    @Override
    public CustomerResponse execute(CreateCustomerRequest request) {
        Customer customer = request.toDomain();
        if (this.customerScoreService.isApproved(customer.getCpf())) {
            return CustomerResponse.from(customerRepository.create(customer));
        } else {
            throw new BusinessException("Your cpf is not approved");
        }
    }

}
