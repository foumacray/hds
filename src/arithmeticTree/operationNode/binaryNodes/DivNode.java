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
public class DivNode extends BinaryNode{
    public DivNode(Node left,Node right) {
        this.leftChild=left;
        this.rightChild=right;
    }
    @Override
    public double evaluate() throws DivException {
        if (rightChild.evaluate()==0) throw new DivException(); 
         return leftChild.evaluate() / rightChild.evaluate();
    }

    public static class DivException extends RuntimeException {

        public DivException() {
            
        }
    }
}
