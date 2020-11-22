//Written By Darcie Howley
//importing libraries required
import java.util.ArrayList;
import org.joda.time.DateTime;

public class DriverClass {
    //setting up arrays
    private static ArrayList<CourseProgramme> course = new ArrayList<CourseProgramme>();
    private static ArrayList<Student> students = new ArrayList<Student>();
    private static ArrayList<Module> modules = new ArrayList<Module>();

    public DriverClass() {

    }

    public static void main(String[] args) {
        //setting up instances for student
        Student student1 = new Student("Darcie", new DateTime(1998,3,5,0,0));
        Student student2 = new Student("Vladan", new DateTime(2000,3,21,0,0));
        Student student3 = new Student("Stephen", new DateTime(1998,6,16,0,0));
        Student student4 = new Student("Nev", new DateTime(1998,7,21,0,0));

        //adding student instances to student array
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        //setting up module instances
        Module module1 = new Module("Machine Learning", "CT4101");
        Module module2 = new Module("Software Engineering III", "CT417");
        Module module3 = new Module("Digital Signals Processing", "EE445");
        Module module4 = new Module("System on Chip Design I", "EE451");
        Module module5 = new Module("Telecommuniction Software Applications", "EE453");

        //adding module student instances to array
        modules.add(module1);
        modules.add(module2);
        modules.add(module3);
        modules.add(module4);

        //setting up module instances
        CourseProgramme course1 = new CourseProgramme("Electronic & Computer Engineering", new DateTime(2020,6,25,0,0,0), new DateTime(2021,5,25,0,0,0));
        CourseProgramme course2 = new CourseProgramme("Computer Science", new DateTime(2020,6,25,0,0,0), new DateTime(2021,5,25,0,0,0));

        //adding courses instances to course array
        course.add(course1);
        course.add(course2);

        //setting modules in relation to students
        module1.setStudents(students);
        module2.setStudents(students);
        module3.setStudents(students);
        module4.setStudents(students);
        module5.setStudents(students);

        //setting courses in relation to modules
        course1.setModules(modules);
        course2.setModules(modules);

        printOut(); //calling print out function
    }

//function of printing out all info required
    public static void printOut() {
        for (CourseProgramme c: course) {
            ArrayList<Module> cModules = c.getModules();
            System.out.println("\n****\n"+c.toString() + "\nModules in this course:");
            for (Module m : cModules) {
                System.out.println("\n"+m + "\n\tStudents enrolled in module:\n\t"+m.getStudents());
            }
        }
        System.out.println("\n\nStudents information:");
        for (Student s: students) {
            System.out.println(
                    s.getInfo() );
        }
        System.out.println("\n\nModules information:");
        for (Module m: modules) {
            System.out.println(
                    m.getInfo() );
        }
        System.out.println("\n\nCourses information:");
        for (CourseProgramme c: course) {
            System.out.println(
                    c.getInfo() );
        }
    }
}
