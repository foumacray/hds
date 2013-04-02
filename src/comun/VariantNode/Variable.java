package comun.VariantNode;

import sintaxtrie.Token;
import sintaxtrie.Value;

public class Variable implements Token {

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
    public Object evaluate() {
        return number.getObjeto();
    }

    @Override
    public String toSring() {
       return name;
    }
}
