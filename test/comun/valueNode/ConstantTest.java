package comun.valueNode;

import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtrie.Node;

public class ConstantTest {

    @Test
    public void ConstantNodeTest() {
        Node value9 = new Constant(9);
        assertEquals(value9.evaluate(), 9, 0);
    }
}
