import java.util.Scanner;

public class NumbersList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = 0;
        while (limit <= 0) {
            System.out.println("Enter the number of elements you want to input (positive integer):");
            limit = scanner.nextInt();
        }

        int[] numbers = new int[limit];

        for (int i = 0; i < limit; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nYour entered numbers are:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
