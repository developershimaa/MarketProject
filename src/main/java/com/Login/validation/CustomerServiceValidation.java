/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Login.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.login.Pojos.CustomerService;
/**
 *
 * @author AbdAllh
 */
public class CustomerServiceValidation implements Validator {

    @Override
    public boolean supports(Class<?> argo) {
        return CustomerService.class.equals(argo);
    }

    @Override
    public void validate(Object o, Errors errors) {
    }
    
}
