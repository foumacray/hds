/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operationNode.unaryNodes;

import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class CosNode extends UnaryNode {
 public CosNode(Node child) {
        this.child = child;
    }
    @Override
    public double evaluate() {
      return Math.cos(child.evaluate());
    }
   
    
}
