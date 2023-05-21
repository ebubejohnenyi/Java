package PersonalExercise;

import java.util.Scanner;

public class CalculateAreaOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;
        double result;
        System.out.print("Enter the area of a circle: ");
        radius = input.nextInt();
        result = (radius * radius) * Math.PI;
        System.out.println("The area of a circle is: " + result);
    }
}
