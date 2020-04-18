package com.jlc.spring.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.LockMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class HibernateCustomerDAO implements CustomerDAO {

	@Autowired
	HibernateTemplate hibernateTemp;

	@Autowired
	HibernateTransactionManager txManager = null;

	public void addCustomer(CustomerTo cto) {
		Customer c = new Customer(cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity());
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		hibernateTemp.save(c);
		txManager.commit(ts);
	}

	public void deleteCustomer(int cid) {
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		Customer c = (Customer) hibernateTemp.load(Customer.class, cid);
		hibernateTemp.delete(c, LockMode.NONE);
		txManager.commit(ts);
	}

	public List<CustomerTo> getAllCustomers() {
		List<CustomerTo> ctoList = new ArrayList<CustomerTo>();
		String hql = "from Customer c";
		List<Customer> cl = (List<Customer>) hibernateTemp.find(hql);
		for (Customer customer : cl) {
			CustomerTo cto = new CustomerTo(customer.getCid(), customer.getCname(), customer.getEmail(),
					customer.getPhone(), customer.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}

	public void updateCustomer(CustomerTo cto) {
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		Customer c = (Customer) hibernateTemp.load(Customer.class, cto.getCid());
		c.setCid(cto.getCid());
		c.setCname(cto.getCname());
		c.setEmail(cto.getEmail());
		c.setPhone(cto.getPhone());
		c.setCity(cto.getCity());
		hibernateTemp.update(c, LockMode.NONE);
		txManager.commit(ts);
	}

	public CustomerTo getCustomerByCid(int cid) {
		Customer customer = (Customer) hibernateTemp.load(Customer.class, cid);
		CustomerTo cto = new CustomerTo(customer.getCid(), customer.getCname(), customer.getEmail(),
				customer.getPhone(), customer.getCity());
		return cto;

	}

}
