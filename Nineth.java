
/*import java.util.Scanner;

class Nineth {

    public static void main(String[] args) {
        System.out.println("The program to calculate the height in centimeters: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the input form of your height : ");
        System.out.println("1. Meter" + '\n' + "2. Feets");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter height in meters : ");
                float Meter = sc.nextFloat();
                float centi = Meter * 100;
                System.out.println("The height in centimeters is " + centi);
                break;
            case 2:
                System.out.println("Enter the height in feet : ");
                float feet = sc.nextFloat();
                System.out.println("Enter the height in inches : ");
                float inch = sc.nextFloat();
                double centis = feet * 30.48 + inch * 2.54;
                System.out.println("The height is " + centis + " centimeters");
                break;
            default:
                System.out.println("Invalid choice");

        }
        sc.close();
    }
}
 */
import java.util.Scanner;

class Nineth {

    public static void main(String[] args) {
        System.out.println("The program to calculate the height in centimeters: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the input form of your height : ");
        System.out.println("1. Meters\n2. Feets and inches");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Enter height in meters : ");
                float meter = sc.nextFloat();
                float centi = meter * 100;
                System.out.println("The height in centimeters is " + centi);
            }
            case 2 -> {
                System.out.println("Enter the height in feets : ");
                float feet = sc.nextFloat();
                System.out.println("Enter the height in inches : ");
                float inch = sc.nextFloat();
                double centis = feet * 30.48 + inch * 2.54;
                System.out.println("The height is " + centis + " centimeters");
            }
            default ->
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
