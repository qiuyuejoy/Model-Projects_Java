/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class  StudentDirectory {

    Department department;
    ArrayList<StudentProfile> studentlist;

    public StudentDirectory(Department d) {

        department = d;
        studentlist = new ArrayList<>();

    }

    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }

    public void printStudentList(){
        System.out.println("Student List:");
        for (StudentProfile eachStudent:studentlist){
            eachStudent.printStudentInformation(); 

        }
    }

    public Person newPerson(String string) {
        return null;
    }   
    
}
