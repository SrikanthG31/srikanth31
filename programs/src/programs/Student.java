package programs;


public class Student {

    // Instance variables
    int studentId;
    String studentName;
    int englishMarks;
    int teluguMarks;
    int hindiMarks;
    int totalMarks;
    double percentage;

    // Static variable
    static String collegeName = "ABC College";

    // Calculate total marks
    void calculateTotal() {
        totalMarks = englishMarks + teluguMarks + hindiMarks;
    }

    // Calculate percentage
    void calculatePercentage() {
        percentage = (totalMarks * 100.0) / 300;
    }

    // Display student details
    void displayStudent() {
        System.out.println("Student ID = " + studentId);
        System.out.println("Student Name = " + studentName);
        System.out.println("College Name = " + collegeName);
        System.out.println("English Marks = " + englishMarks);
        System.out.println("Telugu Marks = " + teluguMarks);
        System.out.println("Hindi Marks = " + hindiMarks);
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage = " + percentage);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        // First student
        Student s1 = new Student();

        s1.studentId = 101;
        s1.studentName = "Rahul";
        s1.englishMarks = 90;
        s1.teluguMarks = 92;
        s1.hindiMarks = 90;

        s1.calculateTotal();
        s1.calculatePercentage();
        s1.displayStudent();

        // Second student
        Student s2 = new Student();

        s2.studentId = 102;
        s2.studentName = "Priya";
        s2.englishMarks = 85;
        s2.teluguMarks = 88;
        s2.hindiMarks = 90;

        s2.calculateTotal();
        s2.calculatePercentage();
        s2.displayStudent();
    }
}