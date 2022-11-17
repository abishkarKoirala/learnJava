package JVT;

import java.util.Scanner;
// import whole java utility --> import java.util.*;

public class input {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("your fav person: ");
        if (userInput.hasNextLine()) {
            String nameEntered = userInput.nextLine();
            System.out.println("You typed " + nameEntered);
        }
    }
}
