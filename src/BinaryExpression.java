/**
 * Represents a binary operation (e.g., +, -, *, /) between two expressions.
 */
public final class BinaryExpression implements Expression {
    private final Expression left;
    private final Expression right;
    private final String operator; // "+", "-", "*", "/"

    public BinaryExpression(Expression left, String operator, Expression right) {
        if (left == null || right == null || operator == null)
            throw new IllegalArgumentException("Arguments cannot be null");
        this.left = left;
        this.right = right;
        this.operator = operator;
        checkRep();
    }

    private void checkRep() {
        assert left != null && right != null && operator != null;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " " + operator + " " + right.toString() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BinaryExpression)) return false;
        BinaryExpression other = (BinaryExpression) obj;
        return this.operator.equals(other.operator) &&
               this.left.equals(other.left) &&
               this.right.equals(other.right);
    }

    @Override
    public int hashCode() {
        int result = operator.hashCode();
        result = 31 * result + left.hashCode();
        result = 31 * result + right.hashCode();
        return result;
    }
}
