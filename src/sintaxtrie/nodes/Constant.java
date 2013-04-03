package sintaxtrie.nodes;

import sintaxtrie.nodes.valueTypes.Value;

public class Constant extends Token {

    Value number;

    public Constant(Value number) {
        this.number = number;
    }

    public String toSring() {
        return evaluate().getValue().toString();
    }

    public Value evaluate() {
        return number;
    }
}
