
package sintaxtrie;

import Types.Value;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestOfGenerateString {
    @Test
    public void  TestOfGenerateStringOneRoofBinary() {
        Value<Double> val1 = new Value<Double>(5.);
        Value<Integer> val2 = new Value<Integer>(3);
        Token node2= new Constant(val1);
        Token node3= new Constant(val2);
        Token node1 = new BynaryOperator(Operator.get("+"), node2,node3);
        assertEquals("5.0+3",node1.toSring());  
    }
    @Test
      public void  TestOfGenerateStrinTwoRoofBinary() {
        Value<Double> val1 = new Value<Double>(5.);
        Value<Integer> val2 = new Value<Integer>(3);
        Token node2= new Constant(val1);
        Token node3= new Constant(val2);
        Token node1 = new BynaryOperator(Operator.get("+"), node2,node3);
        
        Value<Double> val3 = new Value<Double>(0.);
        Value<Integer> val4 = new Value<Integer>(1);
        Token node4= new Constant(val3);
        Token node5= new Constant(val4);
        Token node6 = new BynaryOperator(Operator.get("*"), node4,node5);
        Token node7 = new BynaryOperator(Operator.get("/"), node1,node6);
        assertEquals("5.0+3/0.0*1",node7.toSring());  
    }
    @Test
       public void  TestOfGenerateStrinTwoRoofUnary() {
        Value<Double> val1 = new Value<Double>(5.);
        Value<Integer> val2 = new Value<Integer>(3);
        Token node2= new Constant(val1);
        Token node3= new Constant(val2);
        Token node1 = new BynaryOperator(Operator.get("+"), node2,node3);
        
        Value<Double> val3 = new Value<Double>(0.);
        Value<Integer> val4 = new Value<Integer>(1);
        Token node4= new Constant(val3);
        Token node6 = new UnaryOperator(Operator.get("sin"), node4);
        Token node7 = new BynaryOperator(Operator.get("/"), node1,node6);
        assertEquals("5.0+3/sin(0.0)",node7.toSring());  
    }
    @Test
         public void  TestOfGenerateStrinComplexUnary() {
        Value<Double> val1 = new Value<Double>(5.);
        Value<Integer> val2 = new Value<Integer>(3);
        Token node2= new Constant(val1);
        Token node3= new Constant(val2);
        Token node1 = new BynaryOperator(Operator.get("+"), node2,node3);
        Token node6 = new UnaryOperator(Operator.get("cos"), node1);
        assertEquals("cos(5.0+3)",node6.toSring());  
    }
}
