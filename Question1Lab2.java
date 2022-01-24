import java.util.*;

public class Question1Lab2
{
    public static void main(String arg[])
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double pi = 3.14159;
        double area = radius * radius * pi;

        System.out.println("The area for the circle of radius " + radius);
        System.out.println("is " + area);
        input.close();
    }
}