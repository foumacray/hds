package sintaxtrie.nodes.operation;

import Calculator.CalculatorsMethods;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import sintaxtrie.nodes.Token;
import sintaxtrie.nodes.valueTypes.Value;

public class UnaryOperator extends Operation {

    private Operator operation;
    private Token child;

    public UnaryOperator(Operator operation, Token child) {
        this.operation = operation;

        this.child = child;
    }

    @Override
    public Value evaluate() {

        Value right = child.evaluate();
        return execute(right);
    }

    private Value execute(Value child) {
        try {
            Method method = CalculatorsMethods.methodsMap.get(getSignature(child));
            return (Value) (method.invoke(method.getDeclaringClass().newInstance(), child));
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }

    }

    private String getSignature(Value child) {
        String signature = operation.getName() + child.getClass().getSimpleName();
        return signature;
    }

    @Override
    public String toSring() {
        return operation.getOperator() + "(" + child.toSring() + ")";
    }
}
