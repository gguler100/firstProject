package gitgithubprojects;

import java.util.Scanner;

public class DigitsOfTheNumbers {
    //Write the code that finds the sum of the digits of a number received from the user.
    public static void main(String[] args) {
        calculateDigitsOfTheNumbers();
    }
    public static void calculateDigitsOfTheNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int num = input.nextInt();
        int sum = 0;

        do {
            sum += num % 10;
            num = num / 10;
        } while (num > 0);
        System.out.println("The sum of the digits of the number you entered: " + sum);
    }
}
