/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import arithmeticTree.operationNode.unaryNodes.SinNode;
import comun.VariantNode.VariantNode;
import comun.valueNode.ConstantNode;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class SinNodeTest {
    @Test
    public void SinNodeWithConstantNodeTest() {
        Node sin= new SinNode(new ConstantNode(90));
        assertEquals(0.894, sin.evaluate(),0.01);
    }
    @Test
    public void SinNodeWithVariantNodeTest() {
        Node x= new VariantNode("x", 90);
        Node sin= new SinNode(x);
        assertEquals(0.894, sin.evaluate(),0.01);
        
        ((VariantNode)x).setValue(0);
        assertEquals(0, sin.evaluate(),0);
    }
}
