package arithmeticTree.operators;

import sintaxtrie.Node;

public abstract class BynaryOperator implements Operator {

    protected Node leftChild;
    protected Node rightChild;

    public BynaryOperator(Node LeftChild, Node RightChild) {
        leftChild = LeftChild;
        rightChild = RightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
}
