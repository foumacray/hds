/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package valueNode;

import sintaxtrie.Node;
import sintaxtrie.Node;

/**
 *
 * @author pedro
 */
public class NumberNode implements Node{
    double number;
    
    public NumberNode(int Number){
    number=Number;
    }
    @Override
    public double evaluate() {
       return number;
    }
  
    
}
