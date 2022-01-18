package Lab2;

import java.util.Scanner;

public class findingArea {
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        float radius = input.nextFloat();
        double area = PI*(radius * radius);
        System.out.println("The area for the circle of radius "+radius+" is "+area);

    }
}
