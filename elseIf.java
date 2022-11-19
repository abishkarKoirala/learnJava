import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = Integer.valueOf(reader.nextLine());
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (number % 3 == 0) {
            System.out.println("fizz");
        } else if (number % 5 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println(number);
        }
    }
}
