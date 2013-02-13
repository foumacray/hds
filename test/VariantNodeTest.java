/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import comun.VariantNode.VariantNode;
import org.junit.Test;
import sintaxtrie.Node;
import static org.junit.Assert.*;
/**
 *
 * @author pedro
 */
public class VariantNodeTest {
    @Test
    public void VariantNodeTest() {
        Node variant = new VariantNode("X", 9);
        assertEquals(((VariantNode)variant).getName(), "X");
        assertEquals(((VariantNode)variant).evaluate(), 9,0);
        
    }
    @Test
    public void changeValueTest() {
        Node variant = new VariantNode("X", 9);
        assertEquals(((VariantNode)variant).getName(), "X");
        assertEquals(((VariantNode)variant).evaluate(), 9,0);
        ((VariantNode)variant).setValue(-1);
        assertEquals(((VariantNode)variant).evaluate(), -1,0);
        
    }
}
