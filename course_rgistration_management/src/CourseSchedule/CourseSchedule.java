/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import java.util.ArrayList;
import Persona.Faculty.FacultyProfile;
import CourseSchedule.CourseOffer;
/**
 *
 * @author kal bugrara
 */
public class CourseSchedule {

    CourseCatalog coursecatalog;

    ArrayList<CourseOffer> schedule;
    String semester;

    public CourseSchedule(String s, CourseCatalog cc) {
        semester = s;
        coursecatalog = cc;
        schedule = new ArrayList<>();

    }

    public CourseOffer newCourseOffer(String n) {

        Course c = coursecatalog.getCourseByNumber(n);
        if (c == null){
            System.out.println("You are tring to create a course offer for a course that does not exist.Course number" +n);
            return null;
        }
        CourseOffer co = new CourseOffer(c);
        schedule.add(co);
        return co;
    }

    public void generateSeatForCourse(String courseNumber, int seatCount){
         CourseOffer c = getCourseOfferByNumber(courseNumber);
         if(c == null){
            System.out.println("You are tring to add seats to a course that wasn't found in the semester.Course number");
            return;
         }
        c.generateSeats(seatCount);
    }

    public void assignAsTeacher(String courseNumber, FacultyProfile facultyProfile){
        CourseOffer co = getCourseOfferByNumber(courseNumber);
        if(co == null){
           System.out.println("You are tring to add teachers to a course that wasn't found in the semester.Course number");
           return;
        }
        co.AssignAsTeacher(facultyProfile);
  
    }




    public CourseOffer getCourseOfferByNumber(String n) {

        for (CourseOffer co : schedule) {
 
            if (co.getCourseNumber().equals(n)) {
                return co;
            }
        }
        return null;

    }

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {
            sum = sum + co.getTotalCourseRevenues();
        }
        return sum;
    }

    public void printScheduleInformation(){
        if (schedule.size() == 0){
            System.out.println("No courses available for " + semester);
        } else {
        System.out.println(semester + " : "+ "These courses are available: ");
        for (CourseOffer eachCourseOffer: schedule){
            eachCourseOffer.printOfferInformation();
        }
    }
    }

    public void RegisterForAClass(String string, String string2, String string3) {
    }
}
