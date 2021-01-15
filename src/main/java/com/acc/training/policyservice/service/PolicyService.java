package com.acc.training.policyservice.service;

import com.acc.training.policyservice.model.Customer;
import com.acc.training.policyservice.model.Policy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PolicyService {

    @Autowired
    private WebClient customerWebClient;

    private Logger logger = LoggerFactory.getLogger(PolicyService.class);

    public PolicyService() {
    }

    public Policy getPolicyById(String id) {
        logger.info("id: " + id);
        Customer customer = customerWebClient.get().uri("/customer/" + id).retrieve().bodyToMono(Customer.class)
                .block();
        logger.info("customer retrieved : " + customer);
        return new Policy("2001", "Auto", customer, "New Business");
    }

}
