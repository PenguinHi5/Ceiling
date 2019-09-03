/**
 * @author Preston Brown
 * CS 4150 Algorithms
 * Ceiling Function
 */
public class BinaryTree {

    private Node _root;

    public BinaryTree()
    {

    }

    /**
     * Adds the number to the tree.
     *
     * @param num the num being added
     */
    public void add(int num)
    {
        if (_root == null)
        {
            _root = new Node(num);
        }
        else if (_root.number == num)
        {
            return;
        }
        else
        {
            if (num < _root.number)
            {
                add(_root, num);
            }
            else
            {
                add(_root, num);
            }
        }
    }

    private boolean add(Node node, int num)
    {
        if (node == null)
        {
            return true;
        }
        else if (num < node.number)
        {
            if (add(node.left, num))
            {
                node.left = new Node(num);
            }
        }
        else if (num > node.number)
        {
            if (add(node.right, num))
            {
                node.right = new Node(num);
            }
        }
        return false;
    }

    /**
     * Returns a string representing the shape of the binary tree. If there is no root node, null is returned.
     *
     * @return the string representation of the binary tree
     */
    public String getTreeShapeString()
    {
        if (_root != null)
        {
            StringBuilder tree = new StringBuilder("C");
            getTreeShapeString(tree, _root);
            return tree.toString();
        }
        return "";
    }

    /**
     * Returns a string representing the shape of the binary tree. If there is no root node, null is returned.
     *
     * @return the string representation of the binary tree
     */
    private void getTreeShapeString(StringBuilder tree, Node node)
    {
        if (node == null)
        {
            tree.append("N");
            return;
        }

        if (node.left != null)
        {
            tree.append("L");
        }
        getTreeShapeString(tree, node.left);

        if (node.right != null)
        {
            tree.append("R");
        }
        getTreeShapeString(tree, node.right);
    }

    /**
     * Sets the root on the binary tree.
     *
     * @param root the new root of the tree
     */
    public void setRoot(Node root)
    {
        _root = root;
    }
}
