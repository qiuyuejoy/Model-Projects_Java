/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Campus;

/**
 *
 * @author kal bugrara
 */
public class Address {

    int number;
    String street;
    String zipcode;


    public Address(int n, String s, String i) {
        number = n;
        street = s;
        zipcode = i;
    
    }

    public String getAddressInfo(){
        return number+"" +street +""+ zipcode;
    }


}
