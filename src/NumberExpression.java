/**
 * Represents a numeric literal in an expression.
 */
public final class NumberExpression implements Expression {
    private final double value;

    public NumberExpression(double value) {
        this.value = value;
        checkRep();
    }

    private void checkRep() {
        // no nulls, value is primitive
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof NumberExpression))
            return false;
        NumberExpression other = (NumberExpression) obj;
        return Double.compare(this.value, other.value) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(value);
    }
}
