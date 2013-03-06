package arithmeticTree.operators;

import Calculator.types.BooleanCalculator;
import Calculator.types.NumberCalculator;
import java.lang.reflect.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sintaxtrie.Token;
import sintaxtrie.Value;

public class BynaryOperator extends Operation {

    private Operator operator;
    protected Token leftChild;
    protected Token rightChild;

    public BynaryOperator(Operator operator, Token leftChild, Token rightChild) {
        this.operator = operator;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Token getLeftChild() {
        return leftChild;
    }

    public Operator getOperator() {
        return operator;
    }
    public String getOperatorSymbol(){
        return operator.getSymbol();
    }
    public Token getRightChild() {
        return rightChild;
    }

    
    public Object evaluate() {
        Object obj;
        
        return metodo.invoke(this, os);
    }
    }

  
