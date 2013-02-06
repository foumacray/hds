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
    @Override
    public double evaluate() {
       return number;
    }
  
    
}
