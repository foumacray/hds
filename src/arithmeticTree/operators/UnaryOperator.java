package arithmeticTree.operators;

import Calculator.types.BooleanCalculator;
import Calculator.types.NumberCalculator;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import sintaxtrie.Token;

public class UnaryOperator extends Operation {

    private Operator operator;
    protected Token child;
   

    public UnaryOperator(Operator operator, Token child) {
        this.operator = operator;
        this.child = child;
       
    }

    public Token getChild() {
        return child;
    }

    public Operator getOperator() {
        return operator;
    }
    public String getOperatorSymbol(){
        return operator.getSymbol();
    }
    
    public Object evaluate() {
        return null;
    }
}
