/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Login.services;

import com.login.Pojos.CustomerService;
import com.Login.Dao.*;

/**
 *
 * @author AbdAllh
 */
public class CustomerServiceServiceImpl implements CustomerServicesService {

    private CustomerDaoImpl customerdao;

    public void setCustomerDao(CustomerDaoImpl customerdao) {
        this.customerdao = customerdao;
    }

    @Override
    public void saveCustomerservice(CustomerService customerservice) {
        customerdao.saveCustomer(customerservice);
    }

    @Override
    public CustomerService loginCustomerService(CustomerService customerservice) {
     return customerdao.loginCustomer(customerservice);
        
    }

}
