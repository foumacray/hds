/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxtrie;

import comun.VariantNode.VariantNode;
import arithmeticTree.operationNode.binaryNodes.PlusNode;
import arithmeticTree.operationNode.binaryNodes.TimesNode;
import arithmeticTree.operationNode.unaryNodes.CosNode;
import arithmeticTree.operationNode.unaryNodes.UnaryNode;
import comun.valueNode.ConstantNode;

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
       Node numero = new ConstantNode(2);
       Node numero1 = new ConstantNode(3);
       Node numero2 = new ConstantNode(5);
       Node times = new TimesNode(numero1,numero2);
       Node plus = new PlusNode(numero,times);
       miarbol.addRoot(plus);
       System.out.print(miarbol.getRoot().evaluate()+" ");
       
       Node variante =  new VariantNode("x", 5);
       Node cos =new CosNode(variante);
       miarbol.addRoot(cos);
        System.out.print(miarbol.getRoot().evaluate());
       ((VariantNode)variante).setValue(1);
        System.out.print(miarbol.getRoot().evaluate());
    }
}
