
import java.util.Scanner;

class Third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to convert litres to millilitres");
        System.out.println("Enter the liters of milk: ");
        float liters = sc.nextFloat();
        float Milli = liters * 1000;
        System.out.println("The milk is " + Milli + " milliliters");
        sc.close();
    }
}
