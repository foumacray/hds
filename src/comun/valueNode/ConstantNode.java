/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comun.valueNode;

import sintaxtrie.Node;
import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class ConstantNode implements Node{
    double number;
    
    public ConstantNode(int Number){
    number=Number;
    }
    @Override
    public double evaluate() {
       return number;
    }
  
    
}
