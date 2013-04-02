package comun.VariantNode;

import sintaxtrie.Token;
import Types.Value;

public class Variable extends Token {

    private String name;
    private Value number;

    public Variable(String name, Value value) {
        this.name = name;
        this.number = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return number;
    }

    public void setValue(Value value) {
        this.number = value;
    }

   

    @Override
    public String toSring() {
       return name;
    }

    @Override
    public Value evaluate() {
       return number;
    }
}
