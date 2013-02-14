package arithmeticTree.operators.binaryNodes;

import comun.VariantNode.Variable;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;

public class PlusTest {

    @Test
    public void PlusNodeTest() {
        Node x = new Variable("x", -2);
        Node y = new Variable("y", 1);
        Node add = new Plus(x, y);
        assertEquals(-1, add.evaluate(), 0);

        ((Variable) y).setValue(2);
        assertEquals(0, add.evaluate(), 0);

    }
}
