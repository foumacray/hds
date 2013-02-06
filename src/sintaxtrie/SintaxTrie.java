/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxtrie;

import operationNode.binaryNodes.PlusNode;
import operationNode.binaryNodes.TimesNode;
import operationNode.unaryNodes.CosNode;
import operationNode.unaryNodes.UnaryNode;
import valueNode.NumberNode;

/**
 *
 * @author pedro
 */
public class SintaxTrie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tree miarbol = new Tree();
       Node numero = new NumberNode(2);
       Node numero1 = new NumberNode(3);
       Node numero2 = new NumberNode(5);
       Node times = new TimesNode(numero1,numero2);
       Node plus = new PlusNode(numero,times);
       miarbol.addRoot(plus);
       System.out.print(miarbol.getRoot().evaluate());
    }
}
