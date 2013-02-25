package comun.valueNode;

import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtrie.Node;
import sintaxtrie.Value;

public class ConstantTest {

    @Test
    public void ConstantNodeTest() {
        Value<Integer> val1= new Value<Integer>(9);
        Node value9 = new Constant(val1);
        assertEquals(value9.evaluate(), 9);
    }
}
