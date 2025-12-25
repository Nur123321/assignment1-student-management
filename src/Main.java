<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Ali", "S001", "Computer Science");
        Student s2 = new Student("Nurdaulet", "S002", "Information Systems");
        Student s3 = new Student("Dias", "S003", "Software Engineering");
        Student s4 = new Student("Mahdi", "S004", "Cybersecurity");
        Student s5 = new Student("Jhangyat", "S005", "Data Science");

        s1.updateGPA(3.8);
        s1.addCredits(90);

        s2.updateGPA(3.2);
        s2.addCredits(75);

        s3.updateGPA(3.9);
        s3.addCredits(110);

        s4.updateGPA(2.9);
        s4.addCredits(60);

        s5.updateGPA(3.6);
        s5.addCredits(100);

        Student[] students = { s1, s2, s3, s4, s5 };

        System.out.println("=== Student Details ===");
        for (Student s : students) {
            System.out.println(s);
        }

        Course course = new Course("Object-Oriented Programming", "Dr. Smith", 5);

        for (int i = 0; i < students.length; i++) {
            course.addStudent(students[i], i);
        }

        System.out.println("\n=== Course Information ===");
        System.out.println(course);
        System.out.println("Average GPA: " + course.courseAverageGPA());
        System.out.println("Highest Credit Student: " + course.highestCreditStudent());

        System.out.println("\n=== Array Processing Results ===");
        System.out.println("Top GPA Student: " + getTopStudent(students));
        System.out.println("Number of Honors Students: " + countHonors(students));
        System.out.println("Total Credits Earned: " + totalCredits(students));
    }


    public static Student getTopStudent(Student[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Student top = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getGpa() > top.getGpa()) {
                top = arr[i];
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;

        for (Student s : arr) {
            if (s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int total = 0;

        for (Student s : arr) {
            total += s.getCredits();
        }
        return total;
    }
=======
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Hello GitHub!");
>>>>>>> 9aaefef (init)
}

// nurd