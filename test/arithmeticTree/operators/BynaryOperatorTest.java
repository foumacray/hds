
package arithmeticTree.operators;

import Calculator.types.OperationType;
import comun.valueNode.Constant;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Value;

public class BynaryOperatorTest {
    
    public void BynaryOperatorTest() {
        Constant node1 = new Constant(new Value(5));
        Constant node2 = new Constant(new Value(2));
        BynaryOperator plus= new BynaryOperator(Operator.get("+"),node1,node2);
        System.out.printf(plus.evaluate().toString());
    }
}
