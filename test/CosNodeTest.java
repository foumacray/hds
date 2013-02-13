/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import arithmeticTree.operationNode.unaryNodes.CosNode;
import comun.VariantNode.VariantNode;
import comun.valueNode.ConstantNode;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class CosNodeTest {
      @Test
    public void CosNodeWithConstantNodeTest() {
        Node cos= new CosNode(new ConstantNode(90));
        assertEquals(-0.44807, cos.evaluate(),0.01);
    }
    @Test
    public void CosNodeWithVariantNodeTest() {
        Node x= new VariantNode("x", 90);
        Node cos= new CosNode(x);
        assertEquals(-0.44807, cos.evaluate(),0.01);
        
        ((VariantNode)x).setValue(0);
        assertEquals(1, cos.evaluate(),0);
    }
}
