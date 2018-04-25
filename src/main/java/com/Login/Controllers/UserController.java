/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Login.Controllers;

import com.Login.services.CustomerServicesService;
import com.Login.validation.CustomerServiceValidation;
import com.login.Pojos.CustomerService;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author AbdAllh
 */
@Controller
public class UserController {

    @Autowired
    private CustomerServicesService customerserviceservice;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showform(ModelMap model) {
        model.put("customerdata", new CustomerService());
        return "register.jsp";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String saveform(ModelMap model, @ModelAttribute("customerdata") @Valid CustomerService customerService, BindingResult br, HttpSession session) {

        CustomerServiceValidation customerservicevalidation = new CustomerServiceValidation();
        customerservicevalidation.validate(customerService, br);
        if (br.hasErrors()) {
            return "register.jsp";
        } else {
            customerserviceservice.saveCustomerservice(customerService);
            session.setAttribute("customerservicedata", customerService);
            return "success.jsp";

        }

    }

    //login
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showlogin(ModelMap model, HttpSession session) {
        if (session.getAttribute("customerservicedata") == null) {
            model.put("customerdata", new CustomerService());
            return "login.jsp";
        } else {
            return "success.jsp";
        }
    }

    public String doLogin(ModelMap model, @ModelAttribute("customerdata") CustomerService customerService, HttpSession session) {
        if (customerService.getCustomeremail() != null && customerService.getCustomerpasswd() != null && session.getAttribute("customerservicedata") == null) {
            customerService =customerserviceservice.loginCustomerService(customerService);
            if(customerService!=null)
            {
            session.setAttribute("customerservicedata", customerService);
            return "success.jsp";
            }
            else{
            model.put("faild","loginfaild");
            return"login.jsp";
            }
        }
        return "success.jsp";
    }
}
