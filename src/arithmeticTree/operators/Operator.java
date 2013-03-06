
 
package arithmeticTree.operators;


import Calculator.types.OperationType;
import java.lang.reflect.Field;
import java.util.HashMap;

public class Operator {
 private String symbol;
 private static HashMap<String, Operator> operatorMap;
 private OperationType isBinary;   
    private static final Operator add = new Operator("+",OperationType.Binary);
    private static final Operator minus = new Operator("-",OperationType.Binary);
    private static final Operator multiplication = new Operator("*",OperationType.Binary);
    private static final Operator division= new Operator("/",OperationType.Binary);
     private static final Operator sin = new Operator("sin",OperationType.Unary);
      private static final Operator cos = new Operator("cos",OperationType.Unary);

    public OperationType isIsBinary() {
        return isBinary;
    }
    
      public Operator(String symbol,OperationType isBinary) {
        this.symbol = symbol;
        this.isBinary=isBinary;
    }

    public String getSymbol() {
        return symbol;
    }
    public static Operator get(String symbol){
        return operatorMap.get(symbol);
    }
   
   
    static{
        operatorMap = new HashMap();
        for (Field field:Operator.class.getDeclaredFields()){
            if (field.getType()!=Operator.class){
                continue;
            }
            operatorMap.put(getOperator(field).getSymbol(),getOperator(field));
        }
    }
    private static Operator getOperator(Field field){
        try{
            return (Operator)field.get(null);
        }
        catch(Exception e){
            return null;
        }
    }
    
}
