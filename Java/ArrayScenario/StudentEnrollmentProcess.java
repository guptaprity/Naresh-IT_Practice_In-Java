import java.util.Scanner;

record Course(int id, String name, double fee) {}

record Offer(String offerText) {}

record EducationInstitute(Course[] courses, Offer[] offers) {

    public void enrollStudentInCourse(int courseId, String studentName) {
        boolean found = false;
        for (Course c : courses) {
            if (c.id() == courseId) {
                System.out.println(studentName + " enrolled in: " + c.name());
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Course with ID " + courseId + " not found.");
        }
    }
}

record Student(String name, EducationInstitute institute) {

    public void viewCoursesAndFees() {
        for (Course c : institute.courses()) {
            System.out.println(c.id() + " : " + c.name() + " : " + c.fee());
        }
    }

    public void viewOffers() {
        for (Offer o : institute.offers()) {
            System.out.println(o.offerText());
        }
    }

    public void enrollInCourse(int courseId) {
        institute.enrollStudentInCourse(courseId, name);
    }
}


public class StudentEnrollmentProcess {
    public static void main(String[] args) {

        Course[] courseArr = {
                new Course(1, "Java", 35000.0),
                new Course(2, ".Net", 30000.0),
                new Course(3, "Python", 32000.0)
        };

        Offer[] offerArr = {
                new Offer("Special discount: Get 20% off on all courses!"),
                new Offer("Limited time offer: Enroll in any two courses and get one course free!")
        };

        EducationInstitute institute = new EducationInstitute(courseArr, offerArr);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String sname = sc.nextLine();

        Student st = new Student(sname, institute);

        st.viewCoursesAndFees();
        st.viewOffers();

        System.out.print("Enter course ID to enroll: ");
        int id = sc.nextInt();

        st.enrollInCourse(id);

        sc.close();
    }
}
