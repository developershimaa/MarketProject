/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Login.services;
 import com.login.Pojos.CustomerService;
/**
 *
 * @author AbdAllh
 */
public interface CustomerServicesService {
    public void saveCustomerservice(CustomerService customerservice);
    public CustomerService loginCustomerService(CustomerService customerservice);
}
