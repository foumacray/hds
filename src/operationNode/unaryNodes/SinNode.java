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
public class SinNode extends UnaryNode {
 public SinNode(Node child) {
        this.child = child;
    }
    @Override
    public double evaluate() {
          return Math.sin(child.evaluate());
    }
    
}
