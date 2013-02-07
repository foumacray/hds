/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticTree.operationNode.unaryNodes;

import arithmeticTree.operationNode.OperationNode;
import arithmeticTree.operationNode.OperationNode;
import sintaxtrie.Node;
import java.math.*;

/**
 *
 * @author pedro
 */
public abstract class UnaryNode implements OperationNode{
    Node child;
    
    public void addChild(Node node){
        child = node;
    }
}
