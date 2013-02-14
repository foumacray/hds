package arithmeticTree.operators.binaryNodes;

import arithmeticTree.operators.BynaryOperator;
import sintaxtrie.Node;

public class Div extends BynaryOperator {

    public Div(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() throws DivException {
        if (rightChild.evaluate() == 0) {
            throw new DivException();
        }
        return leftChild.evaluate() / rightChild.evaluate();
    }

    public static class DivException extends RuntimeException {

        public DivException() {
        }
    }
}
