/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.CustomerManagement;

import model.OrderManagement.Order;

/**
 *
 * @author kal bugrara
 */
public class CustomerSummary {
    Order subjectorder;
    int orderNumberTotal;
    int ordertotal;
    CustomerProfile customer;
    String customerName;
    int totalSales;
    int totalItemNum;
    int AvePerOrder;
    int AvePerItem;

    public CustomerSummary(CustomerProfile cp){
        customerName = cp.getPerson().getPersonId();
        ordertotal = cp.getTotalPrice();
        orderNumberTotal = cp.getTotalOrder();
        customer = cp;
        customerName = cp.getCustomerId();
        ordertotal = cp.getOrderList().size();
        totalSales = cp.getTotalSales();
        totalItemNum = cp.getTotalItemNum();
        AvePerOrder = cp.getAvePerOrder();
        AvePerItem = cp.getAvePerItem();
    }

    public Order getSubjectorder() {
        return subjectorder;
    }

    public int getOrderNumberTotal() {
        return orderNumberTotal;
    }

    public int getOrdertotal() {
        return ordertotal;
    }

    public CustomerProfile getCustomer() {
        return customer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public int getTotalItemNum() {
        return totalItemNum;
    }

    public int getAvePerOrder() {
        return AvePerOrder;
    }

    public int getAvePerItem() {
        return AvePerItem;
    }



    public void printCustomerSummary() {
        System.out.println( customerName + "\t|\t"+ "$" +totalSales+"\t|\t"+ ordertotal + "\t|\t" + totalItemNum + "\t|\t" + AvePerOrder + "\t|\t" + AvePerItem);
    }
    
    
}
