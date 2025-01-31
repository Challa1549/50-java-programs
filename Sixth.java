
import java.util.Scanner;

class Sixth {

    public static void main(String[] args) {
        System.out.println("The program to convert an year into weeks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of years: ");
        int year = sc.nextInt();
        double week = year * 52.1429;
        System.out.println("The number of weeks per year are : " + week + " Weeks");
    }
}
