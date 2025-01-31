
import java.util.Scanner;

class Fourth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to calculate seconds for given day");
        System.out.println("Enter the number of day");
        int days = sc.nextInt();
        int seconds = days * 24 * 60 * 60;
        System.out.println("Seconds in a day is " + seconds);
        sc.close();
    }
}
