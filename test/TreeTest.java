/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import arithmeticTree.operationNode.binaryNodes.PlusNode;
import arithmeticTree.operationNode.binaryNodes.TimesNode;
import arithmeticTree.operationNode.unaryNodes.CosNode;
import comun.VariantNode.VariantNode;
import comun.valueNode.ConstantNode;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtrie.Node;
import sintaxtrie.Tree;
/**
 *
 * @author pedro
 */
public class TreeTest {
    @Test
    public void TreeTest() {
        Node x = new VariantNode("x", 9);
        Node y = new VariantNode("y", 1);
        Node zero = new ConstantNode(0);
        
        Node add = new PlusNode(x, y);
        Node add2 = new PlusNode(zero, zero);
        Node cos = new CosNode(add2);
        Node times = new TimesNode(add, cos);
        Tree tree = new Tree(times);
        assertEquals(tree.getRoot().evaluate(), 10,0);
    }
}
