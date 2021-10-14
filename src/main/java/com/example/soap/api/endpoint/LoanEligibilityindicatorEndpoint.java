package com.example.soap.api.endpoint;

import com.example.soap.api.loaneligibility.Acknowledgement;
import com.example.soap.api.loaneligibility.CustomerRequest;
import com.example.soap.api.service.LoanEligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LoanEligibilityindicatorEndpoint {
    private static final String NAMESPACE = "http://www.javatechie.com/spring/soap/api/loanEligibility";

    @Autowired
    private LoanEligibilityService service;

    @PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
    @ResponsePayload
    public Acknowledgement getLoanStatus(@RequestPayload CustomerRequest request) {
        return service.checkLoanEligibility(request);
    }
}
