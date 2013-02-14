package comun.variantNode;

import comun.VariantNode.Variable;
import org.junit.Test;
import sintaxtrie.Node;
import static org.junit.Assert.*;

public class VariableTest {

    @Test
    public void VariantNodeTest() {
        Node variant = new Variable("X", 9);
        assertEquals(((Variable) variant).getName(), "X");
        assertEquals(((Variable) variant).evaluate(), 9, 0);

    }

    @Test
    public void changeValueTest() {
        Node variant = new Variable("X", 9);
        assertEquals(((Variable) variant).getName(), "X");
        assertEquals(((Variable) variant).evaluate(), 9, 0);
        ((Variable) variant).setValue(-1);
        assertEquals(((Variable) variant).evaluate(), -1, 0);

    }
}
