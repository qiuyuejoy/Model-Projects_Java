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
import java.util.ArrayList;
public class Campus {
    
    Address address;
    ArrayList<Building> buildings;

    public Campus(Address a){
    
        address = a;
        buildings = new ArrayList<Building>();        
    
    }
    public Building addNewBuilding(int number){
        Building b = new Building(number, this.address);
        buildings.add(b);
        return b;               
    }

    // check every building is safe
    // variable named "isSafe" is initialized to true
    // for loop go through buildings
    //  "isBuildingSafe()" method is called,if the result is false (meaning the building is not safe), the "isSafe" variable is set to false.

    public Boolean isCampusSafe() {

        boolean isSafe = true;
        for (Building b: buildings) {
             if (b.isBuildingSafe() == false) isSafe = false;
    }
        return isSafe;
    }

    public void printIsCampusSafe(){

        if (isCampusSafe()== true) 
        System.out.println("this campus is safe!");

        else 
        System.out.println("warning! this campus is unsafe!");
    }

}
