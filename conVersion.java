import java.util.Scanner;

public class conVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String text = scanner.nextLine();
        System.out.println("write boolean ");
        Boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("write integer ");
        int msg = Integer.valueOf(scanner.nextLine());
        System.out.println("write double ");
        double message = Double.valueOf(scanner.nextLine());
        System.out.println("you wrote: " + value);
        System.out.println("you wrote: " + msg);
        System.out.println("you wrote: " + message);

    }
}
