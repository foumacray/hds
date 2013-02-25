/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator.types;

/**
 *
 * @author pedro
 */
public class NumberCalculator {
    public Double add(Double number1, Double number2){
        return number1+number2;
    }
    public Integer add(Double number1, Integer number2){
        return (int)(number1+number2);
    }
    public Integer add(Integer number1, Double number2){
        return (int)(number1+number2);
    }
    public Integer add(Integer number1, Integer number2){
        return (int)(number1+number2);
    }
    public Double minus(Double number1, Double number2){
        return number1-number2;
    }
    public Integer minus(Double number1, Integer number2){
        return (int)(number1-number2);
    }
    public Integer minus(Integer number1, Double number2){
        return (int)(number1-number2);
    }
    public Integer minus(Integer number1, Integer number2){
        return (int)(number1-number2);
    }
     public Double multiplication(Double number1, Double number2){
        return number1*number2;
    }
    public Integer multiplication(Double number1, Integer number2){
        return (int)(number1*number2);
    }
    public Integer multiplication(Integer number1, Double number2){
        return (int)(number1*number2);
    }
    public Integer multiplication(Integer number1, Integer number2){
        return (int)(number1*number2);
    }
    public Double div(Double number1, Double number2) throws RuntimeException{
        try{
        return number1/number2;
        }
        catch(Exception e){
            System.out.print("No se puede dividir entre 0");
        }
        return null;
    }
    public Double div(Double number1, Integer number2){
        return (number1/number2);
    }
    public Double div(Integer number1, Double number2){
        return (number1/number2);
    }
    public Double div(Integer number1, Integer number2){
        return ((double)number1/number2);
    }
}
