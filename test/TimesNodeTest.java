/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import arithmeticTree.operationNode.binaryNodes.PlusNode;
import arithmeticTree.operationNode.binaryNodes.TimesNode;
import comun.VariantNode.VariantNode;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class TimesNodeTest {
    @Test
    public void TimesNodeTest() {
 
       Node x = new VariantNode("x", -2);
       Node y = new VariantNode("y", 1);
       Node times = new TimesNode(x, y);
       assertEquals(-2, times.evaluate(),0);
    
       ((VariantNode)y).setValue(-2);
       assertEquals(4, times.evaluate(),0);
       
    }
}
