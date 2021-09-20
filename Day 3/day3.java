import java.util.Scanner;

class Cab {
    int fare;
    int d;

    Cab() {
        fare = 30;
    }
}

class RideCab {
    public static void main(String[] args) {
        Cab ob = new Cab();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the distance travelled by the user: ");
        ob.d = scan.nextInt();

        ob.fare += 10 * ob.d;
        System.out.println("Total fare is: Rs." + ob.fare);
    }
}
