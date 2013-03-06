
package Calculator.types;

import Calculator.DivException;
import arithmeticTree.operators.BynaryOperator;
import comun.valueNode.Constant;
import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtrie.Token;
import sintaxtrie.Value;

public class NumberCalculatorTest {
    @Test
    public void addIntIntTest() {
Value<Integer> val1 = new Value<Integer>(5);
Value<Integer> val2 = new Value<Integer>(3);
Token node2= new Constant(val1);
Token node3= new Constant(val2);
Token node1 = new BynaryOperator("add", node2,node3);
assertEquals(8, node1.evaluate());
    }
 public void addDoubleDoubleTest() {
Value<Double> val1 = new Value<Double>(5.);
Value<Double> val2 = new Value<Double>(3.);
Token node2= new Constant(val1);
Token node3= new Constant(val2);
Token node1 = new BynaryOperator("add", node2,node3);
assertEquals(8., node1.evaluate());
    }
  public void addIntDoubleTest() {
Value<Integer> val1 = new Value<Integer>(5);
Value<Double> val2 = new Value<Double>(3.);
Token node2= new Constant(val1);
Token node3= new Constant(val2);
Token node1 = new BynaryOperator("add", node2,node3);
assertEquals(8, node1.evaluate());
    }
   public void addDoubleIntTest() {
Value<Double> val1 = new Value<Double>(5.);
Value<Integer> val2 = new Value<Integer>(3);
Token node2= new Constant(val1);
Token node3= new Constant(val2);
Token node1 = new BynaryOperator("add", node2,node3);
assertEquals(8, node1.evaluate());
    }
   
     public void divIntIntTest() {
Value<Integer> val1 = new Value<Integer>(1);
Value<Integer> val2 = new Value<Integer>(2);
Token node2= new Constant(val1);
Token node3= new Constant(val2);
Token node1 = new BynaryOperator("div", node2,node3);
assertEquals(8, node1.evaluate());
    }
 public void divDoubleDoubleTest() {
Value<Double> val1 = new Value<Double>(5.);
Value<Double> val2 = new Value<Double>(3.);
Token node2= new Constant(val1);
Token node3= new Constant(val2);
Token node1 = new BynaryOperator("div", node2,node3);
assertEquals(8., node1.evaluate());
    }
  public void divIntDoubleTest() {
Value<Integer> val1 = new Value<Integer>(5);
Value<Double> val2 = new Value<Double>(3.);
Token node2= new Constant(val1);
Token node3= new Constant(val2);
Token node1 = new BynaryOperator("div", node2,node3);
assertEquals(8, node1.evaluate());
    }
   public void divDoubleIntTest() {
Value<Double> val1 = new Value<Double>(5.);
Value<Integer> val2 = new Value<Integer>(3);
Token node2= new Constant(val1);
Token node3= new Constant(val2);
Token node1 = new BynaryOperator("div", node2,node3);
assertEquals(8, node1.evaluate());
    }
    public void divSecondParameterIqual0() {
Value<Double> val1 = new Value<Double>(5.);
Value<Integer> val2 = new Value<Integer>(0);
Token node2= new Constant(val1);
Token node3= new Constant(val2);
Token node1 = new BynaryOperator("div", node2,node3);
try{
assertEquals(8, node1.evaluate());
fail();
System.out.printf("Doesn't occur the exception");
}
catch(Exception e){
    assertTrue(true);
}
    }
}
