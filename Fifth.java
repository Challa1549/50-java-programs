import java.util.Scanner;
class Fifth{
        public static void main(String[] args)
        {
            System.out.println("Program to convert week into minutes");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of weeks");
            int week = sc.nextInt();
            int x = week * 7 * 24 * 60;
            System.out.println("The minutes in a week are " + x);
        }
}