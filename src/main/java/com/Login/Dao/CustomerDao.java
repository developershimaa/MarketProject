/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Login.Dao;

import com.login.Pojos.CustomerService;

/**
 *
 * @author AbdAllh
 */
public interface CustomerDao {
    
    public void saveCustomer(CustomerService customerservice);
    public CustomerService loginCustomer(CustomerService customerservice);
}
