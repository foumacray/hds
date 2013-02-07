/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticTree.operationNode.binaryNodes;

import arithmeticTree.operationNode.OperationNode;
import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public abstract class BinaryNode implements OperationNode{
    Node leftChild;
    Node rightChild;
    public void addchild(Node LeftChild, Node RightChild){
        leftChild = LeftChild;
        rightChild = RightChild;
    }
}
