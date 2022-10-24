package exercises;

import java.util.Scanner;

public class areaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Let's get the area of a rectangle!");
        System.out.println();
        System.out.print("Please provide a length: ");
        double length = input.nextDouble();
        System.out.print("Now, what width will you choose? ");
        double width = input.nextDouble();
        input.close();

        double area = length * width;
        System.out.println("Given a length of " + length + " and a width of " + width +
                ", the area of your rectangle is " + area);

    }

}
