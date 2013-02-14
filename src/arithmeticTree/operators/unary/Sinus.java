package arithmeticTree.operators.unary;

import arithmeticTree.operators.UnaryOperator;
import sintaxtrie.Node;

public class Sinus extends UnaryOperator {

    public Sinus(Node child) {
        super(child);
    }

    @Override
    public double evaluate() {
        return Math.sin(getChild().evaluate());
    }
}
