import java.util.Scanner;

public class MultiplyOp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());
        int product = first * second;
        System.out.println("the product of " + first + " and " + second + " is: " + product);
    }
}