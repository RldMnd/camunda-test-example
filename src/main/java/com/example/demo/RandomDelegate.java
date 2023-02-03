package com.example.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class RandomDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        int value = Integer.parseInt((delegateExecution.getVariable("value").toString()));
        value+=20;
        delegateExecution.setVariable("value", value);
    }
}
