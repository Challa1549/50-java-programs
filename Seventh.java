
import java.util.Scanner;

class Seventh {

    public static void main(String[] args) {
        System.out.println("The program to calculate the age of a person ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year in YYYY ");
        int b_year = sc.nextInt();
        System.out.print("Enter your current year in YYYY ");
        int curr_year = sc.nextInt();
        int age = curr_year - b_year;
        System.out.print("Age of the person is: " + age);
        sc.close();
    }
}
