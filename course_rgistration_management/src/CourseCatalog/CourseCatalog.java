/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseCatalog;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseCatalog {
    Department department;

    String lastupdated;
    ArrayList<Course> courselist; 

    public CourseCatalog(Department d){
        courselist = new ArrayList<Course>();
        department = d;
    }
    
    public ArrayList<Course> getCourseList(){
        return courselist;
    }
    
    public Course newCourse(String n, String nm, int cr){
        Course c = new Course(n, nm, cr);
        courselist.add(c);
        return c;
    }
    
    public Course getCourseByNumber(String n){
        
        for( Course c: courselist){
            
            if(c.getCOurseNumber().equals(n)) return c;
        }
        return null;
    }
    public Department getDepartment() {
        return department;
    }
    public void printCourseList(){
        System.out.println("Course Catalog:");
        for (Course eachCourse: courselist){
            eachCourse.printCourseInformation();
        }
    }




}