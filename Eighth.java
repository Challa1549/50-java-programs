
import java.util.Scanner;

class Eighth {

    public static void main(String[] args) {
        System.out.println("The program to print the name of a person 10 times");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                System.out.println("Your name " + i + " time is " + name);
            } else {
                System.out.println("Your name " + i + " times is " + name);
            }
            sc.close();
        }
    }

}
