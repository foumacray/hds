package arithmeticTree.operators.unary;

import arithmeticTree.operators.UnaryOperator;
import sintaxtrie.Node;

public class Cosinus extends UnaryOperator {

    public Cosinus(Node child) {
        super(child);
    }

    @Override
    public double evaluate() {
        return Math.cos(getChild().evaluate());
    }
}
