import java.util.Scanner;

class Student {
    int rollno;
    String name;
    float marks;

    public static void main(String[] args) {
        Student ob = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student roll no: ");
        ob.rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        ob.name = sc.nextLine();
        System.out.print("Enter student marks: ");
        ob.marks = sc.nextFloat();
        sc.nextLine();

        System.out.println("Roll no: " + ob.rollno);
        System.out.println("Name: " + ob.name);
        System.out.println("Marks: " + ob.marks);
    }

    /*
     * void display() { Student ob = new Student(); Scanner sc = new
     * Scanner(System.in); System.out.println("Student Roll no : " + ob.rollno);
     * System.out.println("Student Name : " + name);
     * System.out.println("Student Marks : " + ob.marks); }
     */
}
