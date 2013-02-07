/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticTree.operationNode.binaryNodes;

import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class PlusNode extends BinaryNode{
public PlusNode(Node left,Node right) {
        this.leftChild=left;
        this.rightChild=right;
    }
    @Override
    public double evaluate() {
       return leftChild.evaluate()+rightChild.evaluate();
    }
    
}
