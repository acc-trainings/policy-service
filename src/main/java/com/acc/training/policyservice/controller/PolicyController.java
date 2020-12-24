package com.acc.training.policyservice.controller;

import com.acc.training.policyservice.model.Policy;
import com.acc.training.policyservice.service.PolicyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    public PolicyController() {
    }

    @RequestMapping(path = "/{policyId}", method = RequestMethod.GET)
    public Policy getPolicy(@PathVariable("policyId") String policyId) {
        return policyService.getPolicyById(policyId);
    }

}
