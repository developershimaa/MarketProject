/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Login.Dao;

import com.login.Pojos.CustomerService;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author AbdAllh
 */
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    public SessionFactory sessionfactory;

    public void setSessionFactory(SessionFactory sessionfactory) {
        this.sessionfactory = sessionfactory;
    }

    @Override
    public void saveCustomer(CustomerService customerservice) {
        Session session = sessionfactory.openSession();
        Transaction tx = session.beginTransaction();
        if (customerservice != null) {
            try {
                session.save(customerservice);
                tx.commit();
                session.close();
            } catch (Exception e) {
                tx.rollback();
            }

        }
    }

    @Override
    public CustomerService loginCustomer(CustomerService customerservice) {
        Session session = sessionfactory.openSession();
        Transaction tx = session.beginTransaction();
        String hql = "from customerservice as c where c.customerserviceemail=? and c.customerservicepasswd=?";

        
            try {
                Query query = session.createQuery(hql);
                query.setParameter(0, customerservice.getCustomeremail());
                query.setParameter(1, customerservice.getCustomerpasswd());
                customerservice = (CustomerService) query.uniqueResult();
                tx.commit();
                session.close();
            } catch (Exception e) {
                tx.rollback();
                session.close();
                e.printStackTrace();
            }
       
    return customerservice;

}
}