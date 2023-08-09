
package model.OrderManagement;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class MasterOrderReport {
    ArrayList<OrderSummary> ordersummarylist;
    
    public MasterOrderReport(){
        
        ordersummarylist = new ArrayList();
        
    }
    public void generateOrderReport(ArrayList<Order> orders){
        ArrayList<Order> orderlist = orders;
        OrderSummary ordersummary ;
        for(Order order: orderlist){
            ordersummary = new OrderSummary(order);
            ordersummarylist.add(ordersummary);
        }         
    }
    
    public OrderSummary getTopProfitableOrder(){ //most profitable order
        OrderSummary currenttoporder = null;
        
        for (OrderSummary os: ordersummarylist){
            if(currenttoporder == null)currenttoporder= os; // initial step 
            else 
                if(os.getOrderProfit()> currenttoporder.getOrderProfit()){
                currenttoporder = os; //we have a new higher total
            }
                }
        return currenttoporder;
    }

    
    public void printOrderReport(){
        System.out.println("Master Order Report");
        System.out.println("Below are customer id,number of items and salesvolume: ");
        for (OrderSummary os: ordersummarylist){
            int index = ordersummarylist.indexOf(os);
            System.out.print((index+1) + " ");
            os.printOrderSummary();
        }
    }
}

