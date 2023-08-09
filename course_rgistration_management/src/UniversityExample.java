/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.print.attribute.standard.MediaSize.Engineering;
import College.College;
import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import Department.Department;
import Persona.Person;
import Persona.PersonDirectory;
import Persona.StudentDirectory;
import Persona.StudentProfile;
import Persona.Faculty.FacultyDirectory;
import Persona.Faculty.FacultyProfile;

/**
 *
 * @author kal bugrara
 */
public class UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

// 0.create one college
        College coe = new College("Northeastern University - College Of Engineering"); 
// 1.creating 3 departments
        Department infoDepartment = coe.newDepartment("INFO","MS in Information Systems");
        Department damgDepartment = coe.newDepartment("DAMG","MS in Data Engineering Degree");
        Department csyeDepartment = coe.newDepartment("CSYE","MS in Software Engineering System"); 
//pulling out the directories and catalogs from the department created above
//   mgenCatalog.getDepartment().printDepartmentInformation();

// 2. create 3 courses for each department
        CourseCatalog infoCatalog = infoDepartment.getCourseCatalog(); // 从departement中的attributes 中get coursecatalog
        infoCatalog.newCourse("Application Engineering","1100",4);
        infoCatalog.newCourse("Data Engineering with Python","1200",4);
        infoCatalog.newCourse("Web Development","1300",4);

        CourseCatalog damgCatalog =damgDepartment.getCourseCatalog();
        damgCatalog.newCourse("Data Management","2100",4);
        damgCatalog.newCourse("Data Two","2200",4);        
        damgCatalog.newCourse("Data Three","2300",4); 

        CourseCatalog csyeCatalog = csyeDepartment.getCourseCatalog();
        csyeCatalog.newCourse("Structure and Algorithms","3100",4);
        csyeCatalog.newCourse("Object Oriented Design","3200",4);        
        csyeCatalog.newCourse("Thesis","3300",4);

//3. adding 9 faculty for 9 courses
        PersonDirectory ipd = infoDepartment.getPersonDirectory(); 
        PersonDirectory dpd = damgDepartment.getPersonDirectory(); 
        PersonDirectory cpd = csyeDepartment.getPersonDirectory(); 

        Person archilPerson = ipd.newPerson("Archil");
        Person kalPerson = ipd.newPerson("Kal");
        Person joyPerson = ipd.newPerson("Joy");
        Person joelPerson = dpd.newPerson("Joel");
        Person joyePerson = dpd.newPerson("Joye");
        Person johnPerson = dpd.newPerson("John.");
        Person amyPerson = cpd.newPerson("Amy");
        Person kimPerson = cpd.newPerson("Kim");
        Person timPerson = cpd.newPerson("Tim");

        Person qPerson = ipd.newPerson("Q");
        Person wPerson = ipd.newPerson("W");
        Person ePerson = ipd.newPerson("E");
        Person rPerson = ipd.newPerson("R");
        Person tPerson = ipd.newPerson("T");
        Person yPerson = ipd.newPerson("Y");
        Person uPerson = ipd.newPerson("U");
        Person iPerson = ipd.newPerson("I");
        Person oPerson = ipd.newPerson("O");   
        Person pPerson = ipd.newPerson("P");  

        Person qqPerson = dpd.newPerson("QQ");
        Person wwPerson = dpd.newPerson("WW");
        Person eePerson = dpd.newPerson("EE");
        Person rrPerson = dpd.newPerson("RR");
        Person ttPerson = dpd.newPerson("TT");
        Person yyPerson = dpd.newPerson("YY");
        Person uuPerson = dpd.newPerson("UU");
        Person iiPerson = dpd.newPerson("II");
        Person ooPerson = dpd.newPerson("OO");   
        Person ppPerson = dpd.newPerson("PP");  

        Person qqqPerson = cpd.newPerson("QQQ");
        Person wwwPerson = cpd.newPerson("WWW");
        Person eeePerson = cpd.newPerson("EEE");
        Person rrrPerson = cpd.newPerson("RRR");
        Person tttPerson = cpd.newPerson("TTT");
        Person yyyPerson = cpd.newPerson("YYY");
        Person uuuPerson = cpd.newPerson("UUU");
        Person iiiPerson = cpd.newPerson("III");
        Person oooPerson = cpd.newPerson("OOO");   
        Person pppPerson = cpd.newPerson("PPP");  

        FacultyDirectory ifd = infoDepartment.getFacultydirectory();
        FacultyDirectory dfd = damgDepartment.getFacultydirectory();
        FacultyDirectory cfd = csyeDepartment.getFacultydirectory();

        FacultyProfile archilTA = ifd.newFacultyProfile(archilPerson);
        FacultyProfile profKal = ifd.newFacultyProfile(kalPerson);     
        FacultyProfile profJoy = ifd.newFacultyProfile(joyPerson);
        FacultyProfile profJoel = dfd.newFacultyProfile(joelPerson);
        FacultyProfile profJoye = dfd.newFacultyProfile(joyePerson);       
        FacultyProfile profJohn = dfd.newFacultyProfile(johnPerson);
        FacultyProfile profAmy = cfd.newFacultyProfile(amyPerson);      
        FacultyProfile profKim = cfd.newFacultyProfile(kimPerson);
        FacultyProfile profTim = cfd.newFacultyProfile(timPerson); 

        StudentDirectory isd = infoDepartment.getStudentDirectory();
        StudentDirectory dsd = damgDepartment.getStudentDirectory();
        StudentDirectory csd = csyeDepartment.getStudentDirectory();

        StudentProfile qStudent = isd.newStudentProfile(qPerson);
        StudentProfile wStudent = isd.newStudentProfile(wPerson);
        StudentProfile eStudent = isd.newStudentProfile(ePerson);
        StudentProfile rStudent = isd.newStudentProfile(rPerson);
        StudentProfile tStudent = isd.newStudentProfile(tPerson);
        StudentProfile yStudent = isd.newStudentProfile(yPerson);
        StudentProfile uStudent = isd.newStudentProfile(uPerson);
        StudentProfile iStudent = isd.newStudentProfile(iPerson);
        StudentProfile oStudent = isd.newStudentProfile(oPerson);
        StudentProfile pStudent = isd.newStudentProfile(pPerson);

        StudentProfile qqStudent = dsd.newStudentProfile(qqPerson);
        StudentProfile wwStudent = dsd.newStudentProfile(wwPerson);
        StudentProfile eeStudent = dsd.newStudentProfile(eePerson);
        StudentProfile rrStudent = dsd.newStudentProfile(rrPerson);
        StudentProfile ttStudent = dsd.newStudentProfile(ttPerson);
        StudentProfile yyStudent = dsd.newStudentProfile(yyPerson);
        StudentProfile uuStudent = dsd.newStudentProfile(uuPerson);
        StudentProfile iiStudent = dsd.newStudentProfile(iiPerson);
        StudentProfile ooStudent = dsd.newStudentProfile(ooPerson);
        StudentProfile ppStudent = dsd.newStudentProfile(ppPerson);

        StudentProfile qqqStudent = csd.newStudentProfile(qqqPerson);
        StudentProfile wwwStudent = csd.newStudentProfile(wwwPerson);
        StudentProfile eeeStudent = csd.newStudentProfile(eeePerson);
        StudentProfile rrrStudent = csd.newStudentProfile(rrrPerson);
        StudentProfile tttStudent = csd.newStudentProfile(tttPerson);
        StudentProfile yyyStudent = csd.newStudentProfile(yyyPerson);
        StudentProfile uuuStudent = csd.newStudentProfile(uuuPerson);
        StudentProfile iiiStudent = csd.newStudentProfile(iiiPerson);
        StudentProfile oooStudent = csd.newStudentProfile(oooPerson);
        StudentProfile pppStudent = csd.newStudentProfile(pppPerson);


//5.course schedue,faculty,avaliable seats(Spring 23 semester)
        CourseSchedule infoSpring2023 = infoDepartment.newCourseSchedule("Spring 2023 Semester");

        CourseSchedule damgSpring2023 = damgDepartment.newCourseSchedule("Spring 2023 Semester");

        CourseSchedule csyeSpring2023 = csyeDepartment.newCourseSchedule("Spring 2023 Semester");

        CourseOffer co1100 = infoSpring2023.newCourseOffer("1100");
        CourseOffer co1200 = infoSpring2023.newCourseOffer("1200");
        CourseOffer co1300 = infoSpring2023.newCourseOffer("1300");
        CourseOffer co2100 = damgSpring2023.newCourseOffer("2100");
        CourseOffer co2200 = damgSpring2023.newCourseOffer("2200");
        CourseOffer co2300 = damgSpring2023.newCourseOffer("2300");
        CourseOffer co3100 = csyeSpring2023.newCourseOffer("3100");
        CourseOffer co3200 = csyeSpring2023.newCourseOffer("3200");
        CourseOffer co3300 = csyeSpring2023.newCourseOffer("3300");

        
        infoSpring2023.generateSeatForCourse("1100", 15);
        infoSpring2023.generateSeatForCourse("1200", 20);
        infoSpring2023.generateSeatForCourse("1300", 30);
        damgSpring2023.generateSeatForCourse("2100",40);
        damgSpring2023.generateSeatForCourse("2200",15);
        damgSpring2023.generateSeatForCourse("2300",15);
        csyeSpring2023.generateSeatForCourse("3100",15);
        csyeSpring2023.generateSeatForCourse("3200",15);
        csyeSpring2023.generateSeatForCourse("3300",15);

        // co1100.generateSeats(5);
        // co1200.generateSeats(6);
        // co1300.generateSeats(7);
        // co2100.generateSeats(8);
        // co2200.generateSeats(9);
        // co2300.generateSeats(10);
        // co3100.generateSeats(1);
        // co3200.generateSeats(2);
        // co3300.generateSeats(3);

//.6 Aassign faculty
       infoSpring2023.assignAsTeacher("1100",archilTA);
       infoSpring2023.assignAsTeacher("1200",profKal); 
       infoSpring2023.assignAsTeacher("1300",profJoy);
       damgSpring2023.assignAsTeacher("2100",profJoel); 
       damgSpring2023.assignAsTeacher("2200",profJoye);
       damgSpring2023.assignAsTeacher("2300",profJohn); 
       csyeSpring2023.assignAsTeacher("3100",profAmy);
       csyeSpring2023.assignAsTeacher("3200",profKim); 
       csyeSpring2023.assignAsTeacher("3300",profTim);


 // 7. register the students for classes
        infoDepartment.RegisterForAClass("Q","1100","Spring 2023 Semester");
        infoDepartment.RegisterForAClass("W","1100","Spring 2023 Semester");
        infoDepartment.RegisterForAClass("E","1100","Spring 2023 Semester");
        infoDepartment.RegisterForAClass("R","1100","Spring 2023 Semester");
        infoDepartment.RegisterForAClass("T","1200","Spring 2023 Semester");
        infoDepartment.RegisterForAClass("Y","1200","Spring 2023 Semester");
        infoDepartment.RegisterForAClass("U","1200","Spring 2023 Semester");
        infoDepartment.RegisterForAClass("I","1300","Spring 2023 Semester");
        infoDepartment.RegisterForAClass("O","1300","Spring 2023 Semester");
        infoDepartment.RegisterForAClass("P","1300","Spring 2023 Semester");
 
        damgDepartment.RegisterForAClass("QQ","2100","Spring 2023 Semester");
        damgDepartment.RegisterForAClass("WW","2100","Spring 2023 Semester");
        damgDepartment.RegisterForAClass("EE","2100","Spring 2023 Semester");
        damgDepartment.RegisterForAClass("RR","2100","Spring 2023 Semester");
        damgDepartment.RegisterForAClass("TT","2200","Spring 2023 Semester");
        damgDepartment.RegisterForAClass("YY","2200","Spring 2023 Semester");
        damgDepartment.RegisterForAClass("UU","2200","Spring 2023 Semester");
        damgDepartment.RegisterForAClass("II","2300","Spring 2023 Semester");
        damgDepartment.RegisterForAClass("OO","2300","Spring 2023 Semester");
        damgDepartment.RegisterForAClass("PP","2300","Spring 2023 Semester");
 

        csyeDepartment.RegisterForAClass("QQQ","3100","Spring 2023 Semester");
        csyeDepartment.RegisterForAClass("WWW","3100","Spring 2023 Semester");
        csyeDepartment.RegisterForAClass("EEE","3100","Spring 2023 Semester");
        csyeDepartment.RegisterForAClass("RRR","3200","Spring 2023 Semester");
        csyeDepartment.RegisterForAClass("TTT","3200","Spring 2023 Semester");
        csyeDepartment.RegisterForAClass("YYY","3200","Spring 2023 Semester");
        csyeDepartment.RegisterForAClass("UUU","3300","Spring 2023 Semester");
        csyeDepartment.RegisterForAClass("III","3300","Spring 2023 Semester");
        csyeDepartment.RegisterForAClass("OOO","3300","Spring 2023 Semester");
        csyeDepartment.RegisterForAClass("PPP","3300","Spring 2023 Semester");
 
        // coe.printCollegeInformation();
        infoDepartment.printDepartmentInformation();  
        damgDepartment.printDepartmentInformation();     
        csyeDepartment.printDepartmentInformation();  

//8.revenue
        System.out.println("----------Part 3 Revenue Calulation------------");
        int totalRevenue = infoDepartment.calculateRevenuesBySemester("Spring 2023 Semester");
        System.out.println("Total revenue1 =" + totalRevenue);

        int totalRevenue2 = coe.calculateRevenuesBySemester("Spring 2023 Semester");
        System.out.println("Total revenue2 =" + totalRevenue);



//         mgenDepartment.printDepartmentInformation();    

//         CourseCatalog someCourseCatalog = department.getCourseCatalog();
        
//         Course course = coursecatalog.newCourse("app eng", "info 5100", 4);
        
//         CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

//         CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
//         if (courseoffer==null)return;
//         courseoffer.generatSeats(10);
//         PersonDirectory pd = department.getPersonDirectory();
//         Person person = pd.newPerson("0112303");
//         StudentDirectory sd = department.getStudentDirectory();
//         StudentProfile student = sd.newStudentProfile(person);
//         CourseLoad courseload = student.newCourseLoad("Fall2020"); 
// //        
//         courseload.newSeatAssignment(courseoffer); //register student in class
        
//         int total = department.calculateRevenuesBySemester("Fall2020");
//         System.out.print("Total: " + total);

//     }

//     private static void getPersonDirectory() {
     }

}
