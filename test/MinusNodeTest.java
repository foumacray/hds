/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import arithmeticTree.operationNode.binaryNodes.MinusNode;
import arithmeticTree.operationNode.binaryNodes.PlusNode;
import comun.VariantNode.VariantNode;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class MinusNodeTest {
    
    @Test
    public void MinusNodeTest() {
       Node x = new VariantNode("x", -2);
       Node y = new VariantNode("y", 1);
       Node minus = new MinusNode(x, y);
       assertEquals(-3, minus.evaluate(),0);
    
       ((VariantNode)y).setValue(-2);
       assertEquals(0, minus.evaluate(),0);
       
    }
}
