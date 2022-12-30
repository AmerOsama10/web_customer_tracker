package com.luv2code.customertracker.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.customertracker.entity.Customer;


@Repository
public class CustomerDAOImpl implements CustomerDAO {
// need to inject session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Customer> get_Customers() {

		Session session = sessionFactory.getCurrentSession();
		String query = "from Customer";
		List<Customer> customers = session.createQuery(query,Customer.class).getResultList();
		return customers;

	}

}
