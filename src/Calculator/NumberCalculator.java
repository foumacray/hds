
package Calculator;

import Anotations.OperatorAnotation;
import Types.DoubleValue;
import Types.IntegerValue;
import Types.Value;


public class NumberCalculator extends Calculator {
    
    @OperatorAnotation(symbol="+")
    public Value add(DoubleValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() + arg1.getValue());
    }

    @OperatorAnotation(symbol="+")
    public Value add(DoubleValue arg0, IntegerValue arg1) {
        return new DoubleValue(arg0.getValue() + arg1.getValue());
    }
   
    @OperatorAnotation(symbol="+")
    public Value add(IntegerValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() + arg1.getValue());
    }
    
    @OperatorAnotation(symbol="+")
    public Value add(IntegerValue arg0, IntegerValue arg1) {
        return new IntegerValue(arg0.getValue() + arg1.getValue());
    }
    
    @OperatorAnotation(symbol="-")
    public Value substract(DoubleValue arg0, DoubleValue arg1){
        return new DoubleValue(arg0.getValue() - arg1.getValue());
    }
    
    @OperatorAnotation(symbol="-")
    public Value substract(DoubleValue arg0, IntegerValue arg1){
        return new DoubleValue(arg0.getValue() - arg1.getValue());
    }
    
    @OperatorAnotation(symbol="-")
    public Value substract(IntegerValue arg0, DoubleValue arg1){
        return new DoubleValue (arg0.getValue() - arg1.getValue());
    }
    
    @OperatorAnotation(symbol="-")
    public Value substract(IntegerValue arg0, IntegerValue arg1){
        return new IntegerValue(arg0.getValue() - arg1.getValue());
    }
    
    @OperatorAnotation(symbol="*")
    public Value product(DoubleValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() * arg1.getValue());
    }
    
    @OperatorAnotation(symbol="*")
    public Value product(DoubleValue arg0, IntegerValue arg1) {
        return new DoubleValue(arg0.getValue() * arg1.getValue());
    }
    
    @OperatorAnotation(symbol="*")
    public Value product(IntegerValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() * arg1.getValue());
    }
    
    @OperatorAnotation(symbol="*")
    public Value product(IntegerValue arg0, IntegerValue arg1) {
        return new IntegerValue(arg0.getValue() * arg1.getValue());
    }
}