/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import Campus.*;

/**
 *
 * @author kal bugrara
 */
public class CampusMainExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * 0. Create Address object
         * 1. create campus object
         * 2. Create and add buildings
         * 3. Create and floors
         * 4. Create and add rooms
         * 5. Assign sprinkers.
         * 6. Write methods to determine is campus safe => are builinds safe etc.
         */

        

        // boolean condition1 = 20>15;
        // boolean condition2 = 10<15;
        // boolean notcondition1 = !condition1;

        int c = 10;

        if ((c==20) || (c>15)) {
            System.out.println("it's safe");
        }

        if (c<15)System.out.println("it's not safe! RUN!");

        else{
            System.out.println("check all sprinklers soon");
        }


         ArrayList<String> sprinklers = new ArrayList<String>();
         sprinklers.add("01");
         sprinklers.add("11");
         sprinklers.add("111");
         sprinklers.add("1111");
         sprinklers.add("11111");

         System.out.println("check all sprinklers in sequence");

         for (int s=0;s<=5;s++){
            System.out.println(s);
        }

        System.out.println("check all sprinklers'nember");
        for(String element:sprinklers){
            System.out.println(element);
        }
         
        Address campusAddress = new Address(911,"ABC","2012");
        Campus nuCampus = new Campus(campusAddress);

        Building aoeBuiding =nuCampus.addNewBuilding(1);
        Floor aoeFloor1=aoeBuiding.addNewFloor(1);
        Classroom aoe111=aoeFloor1.newRoom(111);
        Classroom aoe222=aoeFloor1.newRoom(222);
        Classroom aoe333=aoeFloor1.newRoom(333); 

        Sprinkler aoe111Sprinkler = new Sprinkler(null, null);
        aoe111.setSprinkler("S 001","S 110");
        aoe222.setSprinkler("S 002","S 220");
        aoe333.setSprinkler("S 003","S 330");

        Floor aoeFloor2=aoeBuiding.addNewFloor(2);
        Classroom aoe444=aoeFloor2.newRoom(333);
        Classroom aoe555=aoeFloor2.newRoom(444);
        Sprinkler aoe222Sprinkler = new Sprinkler(null, null);
        aoe444.setSprinkler("S 004","S 440");
        aoe555.setSprinkler("S 005","S 550");


        Building boeBuiding =nuCampus.addNewBuilding(2);
        boeBuiding.addNewFloor(1);
        boeBuiding.addNewFloor(2);
        Building coeBuiding =nuCampus.addNewBuilding(3);
        coeBuiding.addNewFloor(1);


        nuCampus.printIsCampusSafe();

        //  Address a1 = new Address(1,"ABC","2012");
        //  Campus campuAddress = new Campus(campuAddress);
        //  Building b1 = c1.addNewBuilding(10); // newBuilding

        //  Floor f1 = b1.addNewFloor(10); //
        //  Classroom cl1 = f1.newRoom(20);

        // //  Sprinkler s1 = new Sprinkler("678","876");
        // //  Sprinkler s2 = new Sprinkler("987","678");

        //  cl1.setSprinkler("111", "111");

        //  c1.printIsCampusSafe();
         
         }
                 

    }

