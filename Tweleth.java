/* 
import java.util.Scanner;

class Tweleth {

    public static void main(String[] args) {
        System.out.println("The function to convert celsius to fahrenheit ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the type of converion needed: ");
        System.out.println("1. Conversion Between Celsius and Kelvin " + '\n' + "2. Conversion Between Fahrenheit and Kelvin " + '\n' + "3.Conversion Between Celsius and Fahrenheit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Choose the type of conversion: ");
                System.out.println("1. Conversion from Celsius to Kelvin" + '\n' + "2. Conversion from Kelvin to Celsius ");
                int choices_1 = sc.nextInt();
                switch (choices_1) {
                    case 1:
                        System.out.println("Enter the temperature in Celsius: ");
                        double Cel = sc.nextDouble();
                        double Kel = Cel + 273.15;
                        System.out.println("The temperature in kelvin is : " + Kel);
                        break;
                    case 2:
                        System.out.println("Enter the temperature in kelvin: ");
                        double kel = sc.nextDouble();
                        double cel = kel - 273.15;
                        System.out.println("The temperature in celsius is : " + cel);
                        break;
                    default:
                        System.out.println("Enter an valid option !!!!");

                }
            case 2:
                System.out.println("Choose the type of conversion: ");
                System.out.println("1. Conversion from Fahrenheit and Kelvin" + '\n' + "2. Conversion from Kelvin to Fahrenheit ");
                int choices_2 = sc.nextInt();
                switch (choices_2) {
                    case 1:
                        System.out.println("Enter the temperature in Fahrenheit: ");
                        double Fah = sc.nextDouble();
                        double Kelv = (Fah - 32) * 5 / 9 + 273.15;
                        System.out.println("The temperature in kelvin is : " + Kelv);
                        break;
                    case 2:
                        System.out.println("Enter the temperature in kelvin: ");
                        double kelv = sc.nextDouble();
                        double fah = (kelv - 273.15) * 9 / 5 + 32;
                        System.out.println("The temperature in Fahrenheit is : " + fah);
                        break;
                    default:
                        System.out.println("Enter an valid option !!!!");
                        break;
                }
            case 3:
                System.out.println("Choose the type of conversion: ");
                System.out.println("1. Conversion from Celsius and Fahrenheit" + '\n' + "2. Conversion from Fahrenheit to Celsius ");
                int choices_3 = sc.nextInt();
                switch (choices_3) {
                    case 1:
                        System.out.println("Enter the temperature in Celsius: ");
                        double Cels = sc.nextDouble();
                        double Fahr = Cels * (9 / 5) + 32;
                        System.out.println("The temperature in Fahrenheit is : " + Fahr);
                        break;
                    case 2:
                        System.out.println("Enter the temperature in Fahrenheit: ");
                        double fahr = sc.nextDouble();
                        double cels = (fahr - 32) * (5 / 9);
                        System.out.println("The temperature in celsius is : " + cels);
                        break;
                    default:
                        System.out.println("Enter an valid option !!!!");
                        break;
                }
            default:
                System.out.println("Enter an valid option !!!!");
        }
        sc.close();
    }
 }
 */

import java.util.Scanner;

class Twelfth {

    public static void main(String[] args) {
        System.out.println("The function to convert temperatures between Celsius, Fahrenheit, and Kelvin.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the type of conversion needed: ");
        System.out.println("""
                 1. Conversion Between Celsius and Kelvin
                 2. Conversion Between Fahrenheit and Kelvin
                 3. Conversion Between Celsius and Fahrenheit
                 """);

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("""
                         Choose the type of conversion:
                         1. Conversion from Celsius to Kelvin
                         2. Conversion from Kelvin to Celsius
                         """);
                int choices_1 = sc.nextInt();
                switch (choices_1) {
                    case 1 -> {
                        System.out.println("Enter the temperature in Celsius: ");
                        double cel = sc.nextDouble();
                        double kel = cel + 273.15;
                        System.out.println("The temperature in Kelvin is: " + kel);
                    }
                    case 2 -> {
                        System.out.println("Enter the temperature in Kelvin: ");
                        double kel = sc.nextDouble();
                        double cel = kel - 273.15;
                        System.out.println("The temperature in Celsius is: " + cel);
                    }
                    default ->
                        System.out.println("Invalid option! Please enter a valid choice.");
                }
                sc.close();
                return;
            }
            case 2 -> {
                System.out.println("""
                         Choose the type of conversion:
                         1. Conversion from Fahrenheit to Kelvin
                         2. Conversion from Kelvin to Fahrenheit
                         """);
                int choices_2 = sc.nextInt();
                switch (choices_2) {
                    case 1 -> {
                        System.out.println("Enter the temperature in Fahrenheit: ");
                        double fah = sc.nextDouble();
                        double kel = (fah - 32) * 5 / 9 + 273.15;
                        System.out.println("The temperature in Kelvin is: " + kel);
                    }
                    case 2 -> {
                        System.out.println("Enter the temperature in Kelvin: ");
                        double kel = sc.nextDouble();
                        double fah = (kel - 273.15) * 9 / 5 + 32;
                        System.out.println("The temperature in Fahrenheit is: " + fah);
                    }
                    default ->
                        System.out.println("Invalid option! Please enter a valid choice.");
                }
                sc.close();
                return;
            }
            case 3 -> {
                System.out.println("""
                         Choose the type of conversion:
                         1. Conversion from Celsius to Fahrenheit
                         2. Conversion from Fahrenheit to Celsius
                         """);
                int choices_3 = sc.nextInt();
                switch (choices_3) {
                    case 1 -> {
                        System.out.println("Enter the temperature in Celsius: ");
                        double cel = sc.nextDouble();
                        double fah = (cel * 9 / 5) + 32;
                        System.out.println("The temperature in Fahrenheit is: " + fah);
                    }
                    case 2 -> {
                        System.out.println("Enter the temperature in Fahrenheit: ");
                        double fah = sc.nextDouble();
                        double cel = (fah - 32) * 5 / 9;
                        System.out.println("The temperature in Celsius is: " + cel);
                    }
                    default ->
                        System.out.println("Invalid option! Please enter a valid choice.");
                }
                sc.close();
                return;
            }
            default ->
                System.out.println("Invalid option! Please enter a valid choice.");
        }

        sc.close();
    }
}
