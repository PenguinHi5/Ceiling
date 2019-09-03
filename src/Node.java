public class Node {

    public Node left;
    public Node right;
    public int number;

    public Node(int number)
    {
        this.number = number;
    }

    public Node(int number, Node left, Node right)
    {
        this.left = left;
        this.right = right;
        this.number = number;
    }

}
