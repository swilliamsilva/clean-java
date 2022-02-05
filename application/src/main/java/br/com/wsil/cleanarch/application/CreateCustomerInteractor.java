package br.com.wsil.cleanarch.application;

import br.com.wsil.cleanarch.application.request.CreateCustomerRequest;
import br.com.wsil.cleanarch.application.response.CustomerResponse;

public interface CreateCustomerInteractor {

    CustomerResponse execute(CreateCustomerRequest request);

}
