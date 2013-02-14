package comun.valueNode;

import sintaxtrie.Node;

public class Constant implements Node {

    double number;

    public Constant(int Number) {
        number = Number;
    }

    @Override
    public double evaluate() {
        return number;
    }
}
