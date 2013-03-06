 
package Calculator.types;

import arithmeticTree.operators.OperatorAnotation;

public class BooleanCalculator {
    @OperatorAnotation("&&")
    public Boolean and(Boolean argument1,Boolean argument2){
return argument1&&argument2;
}    
@OperatorAnotation("||")
    public Boolean or(Boolean argument1,Boolean argument2){
return argument1||argument2;
}
@OperatorAnotation("!")
    public Boolean not(Boolean argument){
return !argument;
}
}
