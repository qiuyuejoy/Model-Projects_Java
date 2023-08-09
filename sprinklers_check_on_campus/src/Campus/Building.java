/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Campus;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Building {
    int number;
    ArrayList<Floor> floors;
    Address address;


    public Building(int n, Address ad) {
        number = n;
        address = ad;
        floors = new ArrayList<Floor>();
    }

    public Floor addNewFloor(int n) {
        Floor f = new Floor(n, this); // reference back to building;
        floors.add(f);
        return f;
        // f is the new instance of floor

    }

        // Building is safe if all floors are safe

    public Boolean isBuildingSafe() {

        boolean isSafe = true;
        for (Floor f: floors) {
            if (f.isFloorSafe() == false) isSafe = false;
    }
        return isSafe;
    }
    String isMoreThan15(int x){
        if(x>15)return"sprinklers are more than 15";
        else return"sprinklers are less than or eaqul to 15";
    }
}
