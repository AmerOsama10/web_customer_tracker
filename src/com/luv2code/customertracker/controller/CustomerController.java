package com.luv2code.customertracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.customertracker.dao.CustomerDAO;
import com.luv2code.customertracker.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	//inject dao into the controller
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		//get customers from dao
		List<Customer> customers=customerDAO.get_Customers();
		
		// add customer to our model
		model.addAttribute("customers",customers);
		return "list-customers";
	}
}
