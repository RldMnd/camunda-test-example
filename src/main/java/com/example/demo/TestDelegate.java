package com.example.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TestDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        int code = (int) (Math.random() * 10);
        String status = "Undefined";

        delegateExecution.setVariable("code", code);
        delegateExecution.setVariable("status", status);
    }
}
