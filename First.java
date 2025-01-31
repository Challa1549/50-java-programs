
import java.util.Scanner;

class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        if (age > 60) {
            System.out.println("Person is a senior citizen"); 
        }else {
            System.out.println("Person is not a senior citizen");
        }
        sc.close();
    }
}
