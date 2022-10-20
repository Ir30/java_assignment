//1. To convert the input temperature value in Fahrenheit to Celsius.

import java.util.Scanner;

class Fahrenheit_to_Celsius
{
    static float convert_to_celcius (float t)
    {
        return (float) ((t-32)/1.8);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temprature in Fahrenheit: ");
        float temp = sc.nextFloat();
        System.out.println(temp+" Fahrenheit is "+convert_to_celcius(temp)+" celcius");

    }
}