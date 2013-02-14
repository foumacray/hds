package arithmeticTree.operators.unary;

import comun.VariantNode.Variable;
import comun.valueNode.Constant;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;

public class CosinusTest {

    @Test
    public void CosNodeWithConstantNodeTest() {
        Node cos = new Cosinus(new Constant(90));
        assertEquals(-0.44807, cos.evaluate(), 0.01);
    }

    @Test
    public void CosNodeWithVariantNodeTest() {
        Node x = new Variable("x", 90);
        Node cos = new Cosinus(x);
        assertEquals(-0.44807, cos.evaluate(), 0.01);

        ((Variable) x).setValue(0);
        assertEquals(1, cos.evaluate(), 0);
    }
}
