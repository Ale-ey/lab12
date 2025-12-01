import static org.junit.Assert.*;
import org.junit.Test;

public class ExpressionTest {

    @Test
    public void testNumberExpression() {
        Expression n1 = new NumberExpression(5);
        Expression n2 = new NumberExpression(5.0);

        assertEquals(n1, n2);
        assertEquals(n1.hashCode(), n2.hashCode());
        assertEquals("5.0", n1.toString());
    }

    @Test
    public void testVariableExpression() {
        Expression x1 = new VariableExpression("x");
        Expression x2 = new VariableExpression("x");

        assertEquals(x1, x2);
        assertEquals(x1.hashCode(), x2.hashCode());
        assertEquals("x", x1.toString());
    }

    @Test
    public void testBinaryExpression() {
        Expression n1 = new NumberExpression(1);
        Expression n2 = new VariableExpression("x");
        Expression sum1 = new BinaryExpression(n1, "+", n2);
        Expression sum2 = new BinaryExpression(new NumberExpression(1), "+", new VariableExpression("x"));

        assertEquals(sum1, sum2);
        assertEquals(sum1.hashCode(), sum2.hashCode());
        assertEquals("(1.0 + x)", sum1.toString());
    }
}
