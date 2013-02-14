package arithmeticTree.operators.binaryNodes;

import arithmeticTree.operators.BynaryOperator;
import sintaxtrie.Node;

public class Plus extends BynaryOperator {

    public Plus(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return leftChild.evaluate() + rightChild.evaluate();
    }
}
