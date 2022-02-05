package br.com.wsil.cleanarch.application;

import br.com.wsil.cleanarch.application.response.CustomerResponse;

public interface FindCustomerInteractor {

    CustomerResponse execute(String id);

}
