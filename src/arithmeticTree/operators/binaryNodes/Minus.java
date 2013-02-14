package arithmeticTree.operators.binaryNodes;

import arithmeticTree.operators.BynaryOperator;
import sintaxtrie.Node;

public class Minus extends BynaryOperator {

    public Minus(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return leftChild.evaluate() - rightChild.evaluate();
    }
}
