/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CustomerManagement;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CustomersReport {
    ArrayList<CustomerSummary> customerlist;
    /*  • Customer’s name
        • Total sales of that specific customer.
        • Number of orders of that customer
     */
    public CustomersReport(){
        customerlist = new ArrayList<CustomerSummary>();
    }

    public void addCustomerSummary(CustomerSummary cs){
        customerlist.add(cs);
    }

    public void printCustomerReport() {
        System.out.println("\nCustomer Report: \n");
        System.out.println("🆔\t💰totalSales\t🍀ordertotal\t🔢orderNumTotal\t🔥AvePerOrder\t🌧AvePerItem");
        for (CustomerSummary cs: customerlist){
            int index = customerlist.indexOf(cs);
            System.out.print((index+1) + " ");
            cs.printCustomerSummary();
        }
    }
}
