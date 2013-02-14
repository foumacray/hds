package arithmeticTree.operators.binaryNodes;

import comun.VariantNode.Variable;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;

public class MinusTest {

    @Test
    public void MinusNodeTest() {
        Node x = new Variable("x", -2);
        Node y = new Variable("y", 1);
        Node minus = new Minus(x, y);
        assertEquals(-3, minus.evaluate(), 0);

        ((Variable) y).setValue(-2);
        assertEquals(0, minus.evaluate(), 0);

    }
}
