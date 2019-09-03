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

        System.out.println(runCeiling(contents));
    }

    /**
     * Runs the ceiling algorithm and returns the number of different tree shapes.
     *
     * @param contents all of the binary trees
     * @return the number of uniquely shaped ceiling designs
     */
    public static int runCeiling(String[] contents)
    {
        HashSet<String> treeShapeSet = new HashSet<>();

        for (String nums : contents)
        {
            BinaryTree tree = new BinaryTree();
            for (String numString : nums.split(" "))
            {
                int num = Integer.parseInt(numString);
                tree.add(num);
            }
            treeShapeSet.add(tree.getTreeShapeString());
        }

        return treeShapeSet.size();
    }
}
