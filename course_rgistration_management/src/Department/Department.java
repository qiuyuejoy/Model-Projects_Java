/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Department;

import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import Degree.Degree;
import Employer.EmployerDirectory;
import Persona.Faculty.FacultyDirectory;
import Persona.PersonDirectory;
import Persona.StudentDirectory;
import Persona.StudentProfile;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class  Department {

//below are attributes,department has name,buddle things together

    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    EmployerDirectory employerdirectory;
    Degree degree;

    HashMap<String, CourseSchedule> mastercoursecatalog;

//constructor 

    public Department(String name, String degreeName) {

        this.name=name; 

        mastercoursecatalog = new HashMap<>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); // pass the department object so it stays linked to it
        persondirectory = new PersonDirectory();
        facultydirectory = new FacultyDirectory(this);
        degree = new Degree(degreeName);

    }

    public void addCoreCourse(Course c) {
        degree.addCoreCourse(c);
    }

    public void addElectiveCourse(Course c) {
        degree.addElectiveCourse(c);
    }

// get !!!!

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentdirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {
        return mastercoursecatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {
        return coursecatalog;

    }

    public Course newCourse(String n, String nm, int cr) {
        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {
        
        // Getting course scheduel for the given semester

        CourseSchedule css = mastercoursecatalog.get(semester);
         
        // check if there was a course shcedule for the given semester.

        if(css == null){
            System.out.println("Revenue for"+ name +":0,since there is no course schedule for "+semester);
            System.out.println("There is no course scheduel for" + semester);

            return 0; 
        }
        int revenue = css.calculateTotalRevenues();
        //System.out.println("Revenue for"+ name +"during"+semester+":"+revenue);
        return revenue;

    }

    public void RegisterForAClass(String studentid, String cn, String semester) {

    
        StudentProfile sp = studentdirectory.findStudent(studentid);
        if (sp == null){
            System.out.println("Student with id" + studentid + "was not found.");
            return;
        }
        System.out.println("Student"+ studentid + "was found.");
        
        CourseLoad cl = sp.getCurrentCourseLoad();
        if(cl == null) {
            System.out.println("This is first time student is registering... creating new section in transcript.");
            cl = sp.newCourseLoad(semester);
        }

        CourseSchedule cs = mastercoursecatalog.get(semester);
        if (cs == null){
            System.out.println("This is no schedule for" + semester +". Please ad a course scheule first.");
            return;
        }

        CourseOffer co = cs.getCourseOfferByNumber(cn);
        if (co == null){
            System.out.println("This is no such course in" + semester +".");
            return;
        }
        co.assignEmptySeat(cl);

        }

    
    // SeatAssignment sa = co.assignEmptySeat(cl);{
    //     if(sa==null)
    //     System.out.println("unfortunately,there were no empty seats.");
    //     return;
    // }
    //     System.out.println("Congrats, you are registered for"+co.getCourseName);



    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }

    public void printDepartmentInformation(){

        System.out.println("Department:" + name);
        degree.printDegreeInformation();

        System.out.println("---------------------------------------------------");
        coursecatalog.printCourseList();

        System.out.println("---------------------------------------------------");
        printMasterCourseCatalog();

        System.out.println("---------------------------------------------------"); 
        studentdirectory.printStudentList();       
    }
// hashmap should be printed out

    private void printMasterCourseCatalog(){
        System.out.println("List of Semester:");
        for(String semester: mastercoursecatalog.keySet()){
            CourseSchedule courseScheduleForSemester = mastercoursecatalog.get(semester);
            courseScheduleForSemester.printScheduleInformation();
            
            // System.out.println(semester);
            // mastercoursecatalog.get(semester).printScheduleInformation();
        }
    }

    public void RegisterForAClass(StudentProfile qStudent, String cn, String semester) {
    }


}
