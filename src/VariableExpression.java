/**
 * Represents a variable in an expression.
 */
public final class VariableExpression implements Expression {
    private final String name;

    public VariableExpression(String name) {
        if (name == null)
            throw new IllegalArgumentException("name cannot be null");
        this.name = name;
        checkRep();
    }

    private void checkRep() {
        assert name != null;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof VariableExpression))
            return false;
        VariableExpression other = (VariableExpression) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
