import java.util.Scanner;

public class inputLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRead = 0;
        int sum = 0;
        while (true) {
            if (numRead == 3) {
                break;
            }
            System.out.println("Enter a number");
            sum = sum + Integer.valueOf(scanner.nextLine());
            numRead += 1;
        }
        System.out.println("the sum is: " + sum);
    }
}