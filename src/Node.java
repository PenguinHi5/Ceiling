public class Node {

    private Node _left;
    private Node _right;

    public Node() { }

    public Node(Node left, Node right)
    {
        _left = left;
        _right = right;
    }

    public void setLeft(Node node)
    {
        _left = node;
    }

    public void setRight(Node node)
    {
        _right = node;
    }

    public Node getLeft()
    {
        return _left;
    }

    public Node getRight()
    {
        return _right;
    }

}
