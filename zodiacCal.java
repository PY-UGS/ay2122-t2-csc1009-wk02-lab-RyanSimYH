package Lab2;

import java.util.Scanner;

public class zodiacCal {
    public static void main(String[] args)
    {
        String zodiac[] = new String[] {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.println(zodiac[(year%12)]);


    }
}
