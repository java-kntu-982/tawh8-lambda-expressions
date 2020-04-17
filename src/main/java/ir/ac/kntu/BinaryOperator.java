package ir.ac.kntu;

@FunctionalInterface
public interface BinaryOperator {
    // z = f(x,y)
    Integer apply(Integer firstOperand, Integer secondOperator);
}