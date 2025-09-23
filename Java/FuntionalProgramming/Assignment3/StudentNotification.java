
import java.util.function.Consumer;
import java.util.*;

record Student(Integer id, String name, String course) {}

public class StudentNotification {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number of Students ");
		 int n=sc.nextInt();
		 
		 if(n <= 0) {
			 System.out.println("Invalid number of students");
			 return;
		 }
		 
		 Consumer<Student> notifyStudent = s -> 
		    System.out.println("Hello " + s.name() + "! Welcome to the " + s.course() + " course.");


     for (int i = 1; i <= n; i++) {
         System.out.println("\nEnter details for Student " + i + ":");

         System.out.print("Enter ID: ");
         int id = sc.nextInt();
         sc.nextLine(); 

         System.out.print("Enter Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Course: ");
         String course = sc.nextLine();

       
         Student student = new Student(id, name, course);

         
         notifyStudent.accept(student);
     }

     sc.close();
 }

}
