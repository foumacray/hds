package sintaxtrie;

import Calculator.types.BooleanCalculator;
import Types.Value;
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
        return operator.getOperator();
    }
    
   

    @Override
    public String toSring() {
        return getOperatorSymbol()+"("+ child.toSring()+")";
    }

    @Override
    public Value evaluate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
