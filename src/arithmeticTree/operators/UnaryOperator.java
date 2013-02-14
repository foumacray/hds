package arithmeticTree.operators;

import sintaxtrie.Node;

public abstract class UnaryOperator implements Operator {

    protected Node child;

    public UnaryOperator(Node child) {
        this.child = child;
    }

    public Node getChild() {
        return child;
    }

    public void setChild(Node node) {
        child = node;
    }
}
