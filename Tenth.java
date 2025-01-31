
import java.util.Scanner;

class Tenth {

    public static void main(String[] args) {
        System.out.println("A program to calculate interest amount for loan amount, rate of interest and time period");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the loan amount: ");
        int loan = sc.nextInt();
        System.out.println("Enter the time period in years: ");
        int time = sc.nextInt();
        System.out.println("Enter the rate of Interest: ");
        float rates = sc.nextFloat();
        float final_1 = loan * time * rates;
        float final_2 = final_1 / 100;
        float amount = loan + final_2;
        System.out.println(final_2 + " is the final interest for " + loan + " loan amount for " + time + " year/s of time and " + rates + " of intrest");
        System.out.println("The final amount is: " + amount);
        sc.close();
    }
}
