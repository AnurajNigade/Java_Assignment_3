import java.util.Scanner;

class Marks {
    private static int nextRollNo = 1;

    private int rollNo;
    private String name;
    private int physicsMarks;
    private int chemistryMarks;
    private int mathematicsMarks;
    int average;

    public Marks(String name, int physicsMarks, int chemistryMarks, int mathematicsMarks) {
        this.rollNo = nextRollNo++;
        this.name = name;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathematicsMarks = mathematicsMarks;
        average=(physicsMarks+chemistryMarks+mathematicsMarks)/3;
    }

    public int getTotalMarks() {
        return physicsMarks + chemistryMarks + mathematicsMarks;
    }



    @Override
    public String toString() {
        return "Roll No: " + rollNo +
               ", Name: " + name +
               ", Physics Marks: " + physicsMarks +
               ", Chemistry Marks: " + chemistryMarks +
               ", Mathematics Marks: " + mathematicsMarks +
               ",Average mark of student is: "+average+
               ", Total Marks: " + getTotalMarks();
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        Marks[] students = new Marks[numStudents];

        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Physics marks: ");
            int physicsMarks = scanner.nextInt();
            System.out.print("Enter Chemistry marks: ");
            int chemistryMarks = scanner.nextInt();
            System.out.print("Enter Mathematics marks: ");
            int mathematicsMarks = scanner.nextInt();

            students[i] = new Marks(name, physicsMarks, chemistryMarks, mathematicsMarks);
        }

        System.out.println("\nStudent Details:");
        for (Marks student : students) {
            System.out.println(student.toString());
        }


        scanner.close();
    }
}
