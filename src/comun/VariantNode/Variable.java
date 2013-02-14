package comun.VariantNode;

import sintaxtrie.Node;

public class Variable implements Node {

    private String name;
    private double value;

    public Variable(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
