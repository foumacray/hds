/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxtrie;

import arithmeticTree.operationNode.OperationNode;

/**
 *
 * @author pedro
 */
public class Tree {
 private Node root;
 
 public Tree(){
     root = null;
 }

    public Tree(Node root) {
        this.root = root;
    }

 public void addRoot(Node node){
     root=node;
 }

    public Node getRoot() {
        return root;
    }
 
}
