package br.com.wsil.cleanarch.application;

import br.com.wsil.cleanarch.application.response.CustomerResponse;
import br.com.wsil.cleanarch.application.response.PageResponse;
import br.com.wsil.cleanarch.domain.PageRequest;

public interface FindAllCustomersInteractor {

    PageResponse<CustomerResponse> execute(PageRequest pageRequest);

}
