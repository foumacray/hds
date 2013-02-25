package arithmeticTree.operators;
import Calculator.types.NumberCalculator;
import java.lang.reflect.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sintaxtrie.Node;
import sintaxtrie.Value;

public class BynaryOperator implements Operator {
    private String name;
    protected Node leftChild;
    protected Node rightChild;

    public BynaryOperator(String name, Node leftChild, Node rightChild) {
        this.name = name;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
  
    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
    @Override
    public Object evaluate(){
        Object left = leftChild.evaluate();
        Object right = rightChild.evaluate();
        if ((left instanceof Double || left instanceof Integer) &&( 
            right instanceof Double || right instanceof Integer)) {
            try {
                NumberCalculator calculator = new NumberCalculator();   
                Class[] arrayTypes = {left.getClass(),right.getClass()};
                Method method = calculator.getClass().getMethod(name,arrayTypes);
                Object[]arrayValue = {left,right};
                return method.invoke(calculator, arrayValue);
            } catch (Exception ex) {
                Logger.getLogger(BynaryOperator.class.getName()).log(Level.SEVERE, null, ex);
            }     
    }
        return null;
    }
}
