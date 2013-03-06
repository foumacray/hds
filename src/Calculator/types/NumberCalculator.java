
package Calculator.types;

import Calculator.DivException;
import arithmeticTree.operators.OperatorAnotation;

public class NumberCalculator {
    @OperatorAnotation("+")
    public Double add(Double number1, Double number2){
        return number1+number2;
    }
    @OperatorAnotation("+")
    public Integer add(Double number1, Integer number2){
        return (int)(number1+number2);
    }
    @OperatorAnotation("+")
    public Integer add(Integer number1, Double number2){
        return (int)(number1+number2);
    }
    @OperatorAnotation("+")
    public Integer add(Integer number1, Integer number2){
        return (int)(number1+number2);
    }
    @OperatorAnotation("-")
    public Double minus(Double number1, Double number2){
        return number1-number2;
    }
    @OperatorAnotation("-")
    public Integer minus(Double number1, Integer number2){
        return (int)(number1-number2);
    }
    @OperatorAnotation("-")
    public Integer minus(Integer number1, Double number2){
        return (int)(number1-number2);
    }
    @OperatorAnotation("-")
    public Integer minus(Integer number1, Integer number2){
        return (int)(number1-number2);
    }
    @OperatorAnotation("*")
     public Double multiplication(Double number1, Double number2){
        return number1*number2;
    }
    @OperatorAnotation("*")
    public Integer multiplication(Double number1, Integer number2){
        return (int)(number1*number2);
    }
    @OperatorAnotation("*")
    public Integer multiplication(Integer number1, Double number2){
        return (int)(number1*number2);
    }
    @OperatorAnotation("*")
    public Integer multiplication(Integer number1, Integer number2){
        return (int)(number1*number2);
    }
    @OperatorAnotation("/")
    public Double div(Double number1, Double number2) throws DivException{
        try{
        return number1/number2;
        }
        catch(Exception e){
           throw new DivException();
        }
    }
    @OperatorAnotation("/")
    public Double div(Double number1, Integer number2)throws DivException{
        try{
        return number1/number2;
        }
        catch(Exception e){
           throw new DivException();
        }
    }
    @OperatorAnotation("/")
    public Double div(Integer number1, Double number2)throws DivException{
        try{
        return number1/number2;
        }
        catch(Exception e){
           throw new DivException();
        }
    }
    @OperatorAnotation("/")
    public Double div(Integer number1, Integer number2)throws DivException{
          try{
        return ((double)number1/number2);
        }
        catch(Exception e){
           throw new DivException();
        }
        
    }
    @OperatorAnotation("sin")
    public Double sin(Double number){
        return Math.sin(number);
    }
    @OperatorAnotation("cos")
     public Double cos(Double number){
        return Math.cos(number);
    }
}
