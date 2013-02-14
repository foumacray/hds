package sintaxtrie;

public class Tree {

    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public double evaluate() {
        return root.evaluate();
    }
}
