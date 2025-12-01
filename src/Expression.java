/**
 * Expression is an immutable, recursive abstract data type representing
 * mathematical expressions as abstract syntax trees (AST).
 *
 * Abstraction Function:
 * AF(c) = mathematical expression represented by this AST node
 *
 * Representation Invariant:
 * - All fields are non-null
 * - BinaryExpression always has exactly two operands
 */
public interface Expression {
    /** Returns a string representation of this expression. */
    @Override
    String toString();

    /** Checks structural equality of this expression with another object. */
    @Override
    boolean equals(Object obj);

    /** Returns hash code consistent with equals. */
    @Override
    int hashCode();
}
