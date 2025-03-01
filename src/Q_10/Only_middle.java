package Q_10;

import java.util.Scanner;

public class Only_middle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd-length word:");
        String input = scanner.nextLine();

        if (input.length() % 2 == 1) {
            int middleIndex = input.length() / 2;
            char middleChar = input.charAt(middleIndex);
            System.out.println(middleChar);
        } else {
            System.out.println("The input word does not have an odd length.");
        }
    }
}

