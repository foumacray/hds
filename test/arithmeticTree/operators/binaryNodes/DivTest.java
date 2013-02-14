package arithmeticTree.operators.binaryNodes;

import arithmeticTree.operators.binaryNodes.Div.DivException;
import comun.VariantNode.Variable;
import comun.valueNode.Constant;
import sintaxtrie.Node;
import static org.junit.Assert.*;
import org.junit.Test;

public class DivTest {

    @Test
    public void DivNodeTest() {
        Node x = new Constant(8);
        Node y = new Variable("Y", 2);
        Node div = new Div(x, y);
        assertEquals(div.evaluate(), 4, 0);

        ((Variable) y).setValue(0);
        try {
            double result = div.evaluate();
            fail("It doesnt produce the exception");
        } catch (DivException e) {
            assertTrue(true);
        }

    }
}
