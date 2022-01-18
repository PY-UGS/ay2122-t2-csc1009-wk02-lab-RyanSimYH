package Lab2;

import java.util.Scanner;

public class meanCal {
    public static void main(String[] args)
    {
        float num[] = new float[3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        input.useDelimiter("\\s|\\n");
        for(int i =0; i<=2;i++)
        {
            num[i]= input.nextFloat();
        }
        float mean = (num[0]+num[1]+num[2])/3;
        String result = String.format("The average of %.1f %.1f %.1f is %.1f",num[0],num[1],num[2],mean);
        System.out.print(result);
    }
}
