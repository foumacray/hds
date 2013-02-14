package arithmeticTree.operators.binaryNodes;

import comun.VariantNode.Variable;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;

public class MultiplicationTest {

    @Test
    public void TimesNodeTest() {

        Node x = new Variable("x", -2);
        Node y = new Variable("y", 1);
        Node times = new Multiplication(x, y);
        assertEquals(-2, times.evaluate(), 0);

        ((Variable) y).setValue(-2);
        assertEquals(4, times.evaluate(), 0);

    }
}
