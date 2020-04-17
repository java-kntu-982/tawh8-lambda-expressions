package ir.ac.kntu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SolutionTest {
    private Integer firstNumber;
    private Integer secondNumber;
    private static final LambdaExpressions INSTANCE = new LambdaExpressions();

    @BeforeAll
    public static void prepare() {
        LambdaExpressions.main(null);
    }

    @BeforeEach
    public void generateRandomNumbers() {
        firstNumber = (int) (Math.random() * 1000);
        secondNumber = (int) (Math.random() * 1000);
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(INSTANCE.getAdd().apply(firstNumber,
                secondNumber), firstNumber + secondNumber, "Add not " +
                "implemented correctly");
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(INSTANCE.getSubtract().apply(firstNumber,
                secondNumber), firstNumber - secondNumber, "Subtract not " +
                "implemented correctly");
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(INSTANCE.getMultiply().apply(firstNumber,
                secondNumber), firstNumber * secondNumber, "Multiply not " +
                "implemented correctly");
    }

    @Test
    public void testPower() {
        Assertions.assertEquals(INSTANCE.getPower().apply(firstNumber,
                secondNumber), (int) Math.pow(firstNumber, secondNumber),
                "Power not implemented correctly");
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(INSTANCE.getDivide().apply(firstNumber,
                secondNumber), firstNumber / secondNumber, "Divide not " +
                "implemented correctly");
    }
}