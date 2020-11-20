import java.util.ArrayList;

import org.joda.time.DateTime;

public class DriverClass {

    private static ArrayList<Course> courses = new ArrayList<Course>();
    private static ArrayList<Student> students = new ArrayList<Student>();

    public DriverClass() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Student student1 = new Student("Niamh",22,new DateTime(1998,12,31,0,0),1234567);
        Student student2 = new Student("Mary",21,new DateTime(1999,8,21,0,0),3456789);
        Student student3 = new Student("John",21,new DateTime(1999,9,20,0,0),5678901);
        Student student4 = new Student("Conor",30,new DateTime(1990,2,2,0,0),5678901);
       
