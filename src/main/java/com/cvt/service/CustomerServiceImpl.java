package com.cvt.service;

import com.cvt.dao.CustomerDaoImpl;
import com.cvt.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDaoImpl customerDao;

    @Transactional
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }

    @Transactional
    public void saveCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }

    @Transactional
    public Customer getCustomer(int id) {
        return customerDao.getCustomer(id);
    }

    @Transactional
    public void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);
    }
}
