/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kal bugrara
 */
public class SupplierDirectory {
    ArrayList<Supplier> suppliers;
    public SupplierDirectory(){
        suppliers = new ArrayList<>();
    }
    public Supplier newSupplier(String n){
        Supplier supplier = new Supplier(n);
        suppliers.add(supplier);
        return supplier;

    }
    public Supplier findSupplier(String id){
        
        for (Supplier supplier: suppliers){
            
            if(supplier.getName().equals(id)) return supplier;
        }
        return null;
        }
    public ArrayList<Supplier> getSuplierList(){
        return suppliers;
    }

    public Supplier pickRandomSupplier(){
        if (suppliers.size() == 0) return null;
        Random r = new Random();
        int randomIndex = r.nextInt(suppliers.size());
        while (suppliers.get(randomIndex).getProductCatalog().getProductList().size() == 0) {
            randomIndex = r.nextInt(suppliers.size());
        }
        // System.out.println("supplier size: " + suppliers.size() + "\n");
        return suppliers.get(randomIndex);
    }


    public void printShortInfo(){

        for (Supplier s: suppliers){
            s.printShortInfo();
        }
        System.out.println("Checking what's inside the supplier directory.");
        System.out.println("There are " + suppliers.size() + " suppliers.");
    }

    
}