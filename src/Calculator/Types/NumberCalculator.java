package Calculator.Types;

import Anotations.OperatorAnotation;
import Calculator.Calculator;
import sintaxtrie.nodes.valueTypes.DoubleValue;
import sintaxtrie.nodes.valueTypes.IntegerValue;
import sintaxtrie.nodes.valueTypes.Value;

public class NumberCalculator extends Calculator {

    @OperatorAnotation(symbol = "+")
    public Value add(DoubleValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() + arg1.getValue());
    }

    @OperatorAnotation(symbol = "+")
    public Value add(DoubleValue arg0, IntegerValue arg1) {
        return new DoubleValue(arg0.getValue() + arg1.getValue());
    }

    @OperatorAnotation(symbol = "+")
    public Value add(IntegerValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() + arg1.getValue());
    }

    @OperatorAnotation(symbol = "+")
    public Value add(IntegerValue arg0, IntegerValue arg1) {
        return new IntegerValue(arg0.getValue() + arg1.getValue());
    }

    @OperatorAnotation(symbol = "-")
    public Value substract(DoubleValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() - arg1.getValue());
    }

    @OperatorAnotation(symbol = "-")
    public Value substract(DoubleValue arg0, IntegerValue arg1) {
        return new DoubleValue(arg0.getValue() - arg1.getValue());
    }

    @OperatorAnotation(symbol = "-")
    public Value substract(IntegerValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() - arg1.getValue());
    }

    @OperatorAnotation(symbol = "-")
    public Value substract(IntegerValue arg0, IntegerValue arg1) {
        return new IntegerValue(arg0.getValue() - arg1.getValue());
    }

    @OperatorAnotation(symbol = "*")
    public Value product(DoubleValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() * arg1.getValue());
    }

    @OperatorAnotation(symbol = "*")
    public Value product(DoubleValue arg0, IntegerValue arg1) {
        return new DoubleValue(arg0.getValue() * arg1.getValue());
    }

    @OperatorAnotation(symbol = "*")
    public Value product(IntegerValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() * arg1.getValue());
    }

    @OperatorAnotation(symbol = "*")
    public Value product(IntegerValue arg0, IntegerValue arg1) {
        return new IntegerValue(arg0.getValue() * arg1.getValue());
    }

    @OperatorAnotation(symbol = "/")
    public Value div(DoubleValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() / arg1.getValue());
    }

    @OperatorAnotation(symbol = "/")
    public Value div(DoubleValue arg0, IntegerValue arg1) {
        return new DoubleValue(arg0.getValue() / arg1.getValue());
    }

    @OperatorAnotation(symbol = "/")
    public Value div(IntegerValue arg0, DoubleValue arg1) {
        return new DoubleValue(arg0.getValue() / arg1.getValue());
    }

    @OperatorAnotation(symbol = "/")
    public Value div(IntegerValue arg0, IntegerValue arg1) {
        return new IntegerValue(arg0.getValue() / arg1.getValue());
    }

    @OperatorAnotation(symbol = "s")
    public Value sin(IntegerValue arg0) {
        return new IntegerValue((int) Math.sin(arg0.getValue()));
    }

    @OperatorAnotation(symbol = "s")
    public Value sin(DoubleValue arg0) {
        return new DoubleValue(Math.sin(arg0.getValue()));
    }
}