package Calculator.types;

import sintaxtrie.nodes.valueTypes.IntegerValue;
import sintaxtrie.nodes.operation.BynaryOperator;
import sintaxtrie.nodes.operation.Operator;
import sintaxtrie.nodes.Constant;
import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtrie.nodes.Token;
import static org.mockito.Mockito.*;
import sintaxtrie.nodes.operation.UnaryOperator;
import sintaxtrie.nodes.valueTypes.DoubleValue;

public class NumberCalculatorTest {

    @Test
    public void testAddDoubleDouble() {

        Constant mock1 = mock(Constant.class);
        when(mock1.evaluate()).thenReturn(new DoubleValue(5.));
        Constant mock2 = mock(Constant.class);
        when(mock2.evaluate()).thenReturn(new DoubleValue(3.));


        Token token = new BynaryOperator(Operator.add, mock1, mock2);

        assertEquals(8.0, (Double) token.evaluate().getValue(), 0.001);
    }

    @Test
    public void testAddDoubleInteger() {

        Constant mock1 = mock(Constant.class);
        when(mock1.evaluate()).thenReturn(new DoubleValue(5.));
        Constant mock2 = mock(Constant.class);
        when(mock2.evaluate()).thenReturn(new IntegerValue(3));


        Token token = new BynaryOperator(Operator.add, mock1, mock2);

        assertEquals(8.0, (Double) token.evaluate().getValue(), 0.001);
    }

    @Test
    public void testAddIntegerDouble() {

        Constant mock1 = mock(Constant.class);
        when(mock1.evaluate()).thenReturn(new IntegerValue(5));
        Constant mock2 = mock(Constant.class);
        when(mock2.evaluate()).thenReturn(new DoubleValue(3.));


        Token token = new BynaryOperator(Operator.add, mock1, mock2);

        assertEquals(8.0, (Double) token.evaluate().getValue(), 0.001);
    }

    @Test
    public void testAddIntegerInteger() {

        Constant mock1 = mock(Constant.class);
        when(mock1.evaluate()).thenReturn(new IntegerValue(5));
        Constant mock2 = mock(Constant.class);
        when(mock2.evaluate()).thenReturn(new IntegerValue(3));


        Token token = new BynaryOperator(Operator.add, mock1, mock2);

        assertEquals(8, token.evaluate().getValue());
    }

    @Test
    public void testsinInteger() {

        Constant mock1 = mock(Constant.class);
        when(mock1.evaluate()).thenReturn(new IntegerValue(0));



        Token token = new UnaryOperator(Operator.sin, mock1);

        assertEquals(0, token.evaluate().getValue());
    }
}
