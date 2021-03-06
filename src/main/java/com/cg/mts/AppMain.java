package com.cg.mts;

import com.cg.mts.util.Util;
import com.cg.mts.entities.Customer;
import com.cg.mts.service.CustomerService;
import com.cg.mts.service.ICustomerService;

import java.util.List;


public class AppMain {

    public static void main(String[] args) {

        AppMain appMain = new AppMain();
        appMain.execute();

        Util util = Util.getInstance();
        util.close();
    }

    public void execute() {

        Customer customer = new Customer("Customer", "123", "123456", "abc");
        Customer customer1 = new Customer("Customer1", "123", "123456", "abc");
        Customer customer2 = new Customer("Customer2", "123", "123456", "abc");


        ICustomerService customerService = new CustomerService();
        Customer c = customerService.insertCustomer(customer);
        Customer c1 = customerService.insertCustomer(customer1);
        Customer c2 = customerService.insertCustomer(customer2);


        System.out.println("New customer has" + c.getUsername());
        System.out.println("New customer with id 1 as: " + customerService.viewCustomer(1).getUsername());

//        List<Customer> list = customerService.viewCustomers();
//
//        for (Customer list1 : list)
//            System.out.println("The whole customer list is:" + list1.getUsername());
        //System.out.println("New customer deleted is " + customerService.deleteCustomer(c).getUsername());


    }
}
