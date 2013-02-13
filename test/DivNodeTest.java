/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import arithmeticTree.operationNode.binaryNodes.DivNode;
import arithmeticTree.operationNode.binaryNodes.DivNode.DivException;
import comun.VariantNode.VariantNode;
import comun.valueNode.ConstantNode;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class DivNodeTest {
    @Test
    public void DivNodeTest() {
        Node x = new ConstantNode(8);
        Node y = new VariantNode("Y", 2);
        Node div = new DivNode(x, y);
        assertEquals(div.evaluate(), 4, 0);
        
        ((VariantNode)y).setValue(0);
        try{
        double result = div.evaluate();
        fail("It doesnt produce the exception");
        }
        catch(DivException e){
        assertTrue(true);
        }
        
    }
}
