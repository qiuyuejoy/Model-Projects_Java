/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseCatalog;

/**
 *
 * @author kal bugrara
 */
public class Course {

    String number;
    String name;

    int credits;
    int price = 1500; // per credit hour

    public Course(String n, String numb, int ch) {
        name = n;
        number = numb;
        credits = ch;

    }

    public String getCOurseNumber() {
        return number;
    }

    public int getCoursePrice() {
        return price * credits; // 1500*4=6000

    }

    public int getCredits() {
        return credits;

    }
    public void printCourseInformation(){
        System.out.println( number + "-" + name + "-" + credits + "credit hours.");
    }
    

    public String getName() {
        return name;
    }

}