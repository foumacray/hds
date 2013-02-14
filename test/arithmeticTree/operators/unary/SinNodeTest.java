package arithmeticTree.operators.unary;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import comun.VariantNode.Variable;
import comun.valueNode.Constant;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;

public class SinNodeTest {

    @Test
    public void SinNodeWithConstantNodeTest() {
        Node sin = new Sinus(new Constant(90));
        assertEquals(0.894, sin.evaluate(), 0.01);
    }

    @Test
    public void SinNodeWithVariantNodeTest() {
        Node x = new Variable("x", 90);
        Node sin = new Sinus(x);
        assertEquals(0.894, sin.evaluate(), 0.01);

        ((Variable) x).setValue(0);
        assertEquals(0, sin.evaluate(), 0);
    }
}
