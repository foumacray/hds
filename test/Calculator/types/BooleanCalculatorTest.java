package Calculator.types;

import arithmeticTree.operators.BynaryOperator;
import arithmeticTree.operators.UnaryOperator;
import comun.valueNode.Constant;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Token;
import sintaxtrie.Value;

public class BooleanCalculatorTest {

    @Test
    public void andTest() {
        Value<Boolean> val1 = new Value<Boolean>(true);
        Value<Boolean> val2 = new Value<Boolean>(false);
        Token node2 = new Constant(val1);
        Token node3 = new Constant(val2);
        Token node1 = new BynaryOperator("and", node2, node3);
        assertFalse((Boolean)node1.evaluate());
    }
    @Test
    public void orTest(){
        
        Value<Boolean> val1 = new Value<Boolean>(true);
        Value<Boolean> val2 = new Value<Boolean>(false);
        Token node2 = new Constant(val1);
        Token node3 = new Constant(val2);
        Token node1 = new BynaryOperator("or", node2, node3);    
        assertTrue((Boolean)node1.evaluate());
    }
    public void not(){
        
        Value<Boolean> val2 = new Value<Boolean>(false);
        Token node3 = new Constant(val2);
        Token node1 = new UnaryOperator("not", node3);    
        assertTrue((Boolean)node1.evaluate());
    }
}
