package sintaxtrie;

import sintaxtrie.nodes.operation.Operator;
import sintaxtrie.nodes.operation.BynaryOperator;
import sintaxtrie.nodes.operation.UnaryOperator;
import sintaxtrie.nodes.Constant;
import sintaxtrie.nodes.Token;
import sintaxtrie.nodes.valueTypes.DoubleValue;
import sintaxtrie.nodes.valueTypes.IntegerValue;
import sintaxtrie.nodes.valueTypes.Value;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOfGenerateString {

    @Test
    public void TestOfGenerateStringOneRoofBinary() {
        Token node2 = new Constant(new DoubleValue(5.));
        Token node3 = new Constant(new IntegerValue(3));
        Token node1 = new BynaryOperator(Operator.add, node2, node3);
        assertEquals("5.0+3", node1.toSring());
    }

    @Test
    public void TestOfGenerateStrinTwoRoofBinary() {

        Token node2 = new Constant(new DoubleValue(5.));
        Token node3 = new Constant(new IntegerValue(3));
        Token node1 = new BynaryOperator(Operator.add, node2, node3);
        Token node4 = new Constant(new DoubleValue(0.));
        Token node5 = new Constant(new IntegerValue(1));
        Token node6 = new BynaryOperator(Operator.product, node4, node5);
        Token node7 = new BynaryOperator(Operator.div, node1, node6);
        assertEquals("5.0+3/0.0*1", node7.toSring());
    }

    @Test
    public void TestOfGenerateStrinTwoRoofUnary() {
        Value<Double> val1 = new Value<Double>(5.);
        Value<Integer> val2 = new Value<Integer>(3);
        Token node2 = new Constant(val1);
        Token node3 = new Constant(val2);
        Token node1 = new BynaryOperator(Operator.add, node2, node3);

        Value<Double> val3 = new Value<Double>(0.);
        Value<Integer> val4 = new Value<Integer>(1);
        Token node4 = new Constant(val3);
        Token node6 = new UnaryOperator(Operator.sin, node4);
        Token node7 = new BynaryOperator(Operator.div, node1, node6);
        assertEquals("5.0+3/s(0.0)", node7.toSring());
    }
}
