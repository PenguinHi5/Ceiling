/**
 * @author Preston Brown
 * CS 4150 Algorithms
 * Ceiling Function
 */
public class Node {

    public Node left;
    public Node right;
    public int number;

    /**
     * Creates a new node.
     *
     * @param number the number stored in the node
     */
    public Node(int number)
    {
        this.number = number;
    }

    /**
     * Creates a new node with specified child nodes.
     *
     * @param number the number stored in the node
     * @param left the left child node
     * @param right the right child node
     */
    public Node(int number, Node left, Node right)
    {
        this.left = left;
        this.right = right;
        this.number = number;
    }

}
