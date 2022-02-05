package br.com.wsil.cleanarch.infrastructure.service;

import br.com.wsil.cleanarch.domain.service.CustomerScoreService;
import br.com.wsil.cleanarch.infrastructure.service.client.CustomerScoreClient;
import br.com.wsil.cleanarch.infrastructure.service.client.request.CustomerScoreRequest;
import br.com.wsil.cleanarch.infrastructure.service.client.response.CustomerScoreResponse;
import br.com.wsil.cleanarch.infrastructure.service.client.response.CustomerScoreStatusEnum;
import javax.inject.Named;

@Named
public class CustomerScoreClientService implements CustomerScoreService {

    private CustomerScoreClient customerScoreClient;

    public CustomerScoreClientService(CustomerScoreClient customerScoreClient) {
        this.customerScoreClient = customerScoreClient;
    }

    @Override
    public Boolean isApproved(String cpf) {
        CustomerScoreResponse response = this.customerScoreClient.queryScore(new CustomerScoreRequest(cpf));
        if(response.getStatus() == CustomerScoreStatusEnum.APPROVED) {
            return true;
        } else {
            return false;
        }
    }

}
