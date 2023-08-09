/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Business.Business;
import model.Business.ConfigureABusiness;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomersReport;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.MasterOrderReport;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;

/**
 *
 * @author kal bugrara
 */
public class RangePricingApplication {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    // 1. Populate the model +

    Business business = ConfigureABusiness.createABusinessAndLoadALotOfData("Xerox", 30, 20, 30, 30, 5);

   // 2. Maybe some interaction with the user (optional)

   // 3. Show some analytics (Summerizing, comparing, sorting, grouping data by some criteria)

    //business.printShortInfo();

    SupplierDirectory sd = business.getSupplierDirectory();
    Supplier randomSupplier = sd.pickRandomSupplier();
    ProductCatalog pd = randomSupplier.getProductCatalog();
    // ProductsReport myFirstReport = pd.generatProductPerformanceReport();
    // myFirstReport.printProductReport();

    // reach out to masterOrderList
    MasterOrderList mol = business.getMasterOrderList();
    MasterOrderReport orderReport = mol.generateMasterOrderReport();
    orderReport.printOrderReport();

    
    CustomerDirectory cd = business.getCustomerDirectory();
    CustomersReport mySecondReport =  cd.generatCustomerPerformanceReport();
    mySecondReport.printCustomerReport();



  
    

    




  }

  
}
