import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ceiling {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int n = Integer.parseInt(inputArray[0]);
        int k = Integer.parseInt(inputArray[1]);
        String[] contents = new String[n];

        // Reads in all of the input
        for (int i = 0; i < n; i++)
        {
            input = scanner.nextLine();
            contents[i] = input;
        }
    }

    public static void runCeiling(int n, int k, String[] contents)
    {

    }
}
