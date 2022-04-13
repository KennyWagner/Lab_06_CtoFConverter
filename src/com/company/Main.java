package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double fTemp;
        double cTemp;

        System.out.println("Enter a temperature in Celsius: ");
        if (in.hasNextDouble())
        {
            cTemp = in.nextDouble();
            fTemp = (cTemp * 9 / 5 + 32);
            System.out.println(cTemp + " degrees celsius is " + fTemp + " degrees fahrenheit");
            if (fTemp >= 212)
            {
                System.out.println("At this temperature water is boiling.");
            }
            else if (fTemp <= 32)
            {
                System.out.println("At this temperature water is freezing.");
            }
            else
            {
                System.out.println("At this temperature water is liquid.");
            }
        }
        else
        {
            System.out.println("Invalid input please enter a number");
        }


    }
}
