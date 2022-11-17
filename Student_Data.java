import java.util.Scanner;

public class Student_Data {
    void getData() {
        System.out.println("**********Student's Detail**********");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's name : ");
        String name = sc.nextLine();
        System.out.println("Enter student's branch : ");
        String branch = sc.nextLine();
        System.out.println("Enter student's roll no. : ");
        int rollno = sc.nextInt();
        System.out.println("Enter student's maths marks : ");
        int maths = sc.nextInt();
        System.out.println("Enter student's physics marks : ");
        int physics = sc.nextInt();
        System.out.println("Enter student's chemistry marks : ");
        int chemistry = sc.nextInt();

        System.out.println("**********Showing Student's Detail*********");
        System.out.print("Student's name is : ");
        System.out.println(name);
        System.out.print("Student's branch is : ");
        System.out.println(branch);
        System.out.print("Student roll no. is : ");
        System.out.println(rollno);
        System.out.print("Student maths marks is : ");
        System.out.println(maths);
        System.out.print("Student physics marks is : ");
        System.out.println(physics);
        System.out.print("Student chemistry marks is : ");
        System.out.println(chemistry);

        System.out.println("**********Showing Student's result**********");
        double result = (double) (maths + physics + chemistry) / 3;
        System.out.print("Student's result is : ");
        System.out.println(result + "%");
    }

    public static void main(String[] args) {
        Student_Data s = new Student_Data();
        s.getData();
    }
}