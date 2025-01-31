import java.util.Scanner;
class Second
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM FOR CALCULATING AREA OF RECTANGLE");
        System.out.println("Enter the length of the  rectangle: ");
        int a = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();  
        int area = a * b;
        System.out.println("Area of the rectangle is: "+area);
    }
}