package arithmeticTree.operators;

import Calculator.Calculator;
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

    
    public Object evaluate() throws RuntimeException{
        try {
            Object left = leftChild.evaluate();
            Object right = rightChild.evaluate();
            
            for(Method method : NumberCalculator.class.getDeclaredMethods()){
                if(method.isAnnotationPresent(OperatorAnotation.class)){
                    if(getSignature(operator,new Object[]{left,right}).equals(getMethodSignature(method))){
                        Calculator calculator=new NumberCalculator();
                         return method.invoke(calculator, new Object[]{leftChild,rightChild});
                    }
                }
            }
          
                  
                   
        } catch (Exception ex) {
            Logger.getLogger(BynaryOperator.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
    
    public String getSignature(Operator operator,Object[]objects){
        String signature=operator.getSymbol();
        for(Object object:objects){
            signature+=object.getClass().getSimpleName();
        }
        return signature;
    }
    
    public String getMethodSignature(Method method){
     String signature=method.getAnnotation(OperatorAnotation.class).value();
        for(Object object:method.getTypeParameters()){
            signature+=object;
        }
        return signature;
    }

    @Override
    public String toSring() {
      return leftChild.toSring()+getOperatorSymbol()+rightChild.toSring();
    }
    }

  

    
            