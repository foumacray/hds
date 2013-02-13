/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import comun.valueNode.ConstantNode;
import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class ConstantNodeTest {
    @Test
    public void ConstantNodeTest() {
        Node value9 = new ConstantNode(9);
        assertEquals(value9.evaluate(), 9, 0);
    }
}
