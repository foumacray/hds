/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comun.VariantNode;

import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class VariantNode implements Node {
    String name;
    double value;

    public VariantNode(String name, int Value) {
        this.name = name;
        this.value = Value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double Value) {
        this.value = Value;
    }
    @Override
    public double evaluate() {
       return value;
    }
    
}
