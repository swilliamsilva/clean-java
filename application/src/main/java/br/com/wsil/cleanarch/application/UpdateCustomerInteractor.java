package br.com.wsil.cleanarch.application;

import br.com.wsil.cleanarch.application.request.UpdateCustomerRequest;
import br.com.wsil.cleanarch.application.response.CustomerResponse;

public interface UpdateCustomerInteractor {

    CustomerResponse execute(String id, UpdateCustomerRequest request);

}
