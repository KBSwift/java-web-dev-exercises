package exercises;

import java.util.Scanner;

public class newHelloWorld {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = input.nextLine();
        input.close();

        System.out.println("Hello, " + userName + "!");
    }
}
