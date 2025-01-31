
import java.util.Scanner;

class Eleventh {

    public static void main(String[] args) {
        System.out.println("The program to calculate the ratios of two numbers ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers with a space : ");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        if (num_2 == 0) {
            System.out.println("Denominator can not be zero:");
        } else {
            System.out.println("The ratio between " + num_1 + " and " + num_2 + " is : ");
            rat(num_1, num_2);
            sc.close();
        }
    }

    public static double rat(double x, double y) {
        double z = x / y;
        System.out.print(z);
        return 0;
    }
}
