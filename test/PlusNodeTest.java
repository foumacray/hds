/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import arithmeticTree.operationNode.binaryNodes.PlusNode;
import comun.VariantNode.VariantNode;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class PlusNodeTest {
    @Test
    public void PlusNodeTest() {
       Node x = new VariantNode("x", -2);
       Node y = new VariantNode("y", 1);
       Node add = new PlusNode(x, y);
       assertEquals(-1, add.evaluate(),0);
    
       ((VariantNode)y).setValue(2);
       assertEquals(0, add.evaluate(),0);
       
    }
}
