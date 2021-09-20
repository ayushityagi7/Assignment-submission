import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        num1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter 2nd number:");
        num2 = scan.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of the two numbers is: " + sum);
    }
}
