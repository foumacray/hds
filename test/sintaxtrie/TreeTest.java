package sintaxtrie;


import arithmeticTree.operators.binaryNodes.Multiplication;
import arithmeticTree.operators.binaryNodes.Plus;
import arithmeticTree.operators.unary.Cosinus;
import comun.VariantNode.Variable;
import comun.valueNode.Constant;
import org.junit.Test;
import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void TreeTest() {
        Node x = new Variable("x", 9);
        Node y = new Variable("y", 1);
        Node zero = new Constant(0);

        Node add = new Plus(x, y);
        Node add2 = new Plus(zero, zero);
        Node cos = new Cosinus(add2);
        Node times = new Multiplication(add, cos);
        Tree tree = new Tree(times);
        assertEquals(tree.getRoot().evaluate(), 10, 0);
    }
}
