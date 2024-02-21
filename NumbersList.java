import java.util.Scanner;

public class NumbersList {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Amount to input:");
        int n = num.nextInt();
        num.nextLine();

        System.out.println("Enter " + n + " numbers");

        for (int i = 0; i < n; i++) {
            int number = num.nextInt();
            System.out.println("Number " + (i + 1) + ": " + number);
        }

        num.close();
    }
}