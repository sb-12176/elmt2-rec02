import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        int userInt;
        double userDouble;
        char userChar;
        String userString;
        String skip;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();

        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();

        System.out.println("Enter character:");
        skip = scnr.next();
        userChar = skip.charAt(0);

        System.out.println("Enter string:");
        scnr.nextLine();
        userString = scnr.nextLine();

        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);
        System.out.println(userDouble + " cast to an integer is " + (int)userDouble);


        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}