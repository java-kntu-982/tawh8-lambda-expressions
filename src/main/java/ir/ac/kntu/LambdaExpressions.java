package ir.ac.kntu;

/**
 * @author yourname
 */
public class LambdaExpressions {
    private BinaryOperator add, subtract, multiply, divide, power;


    // This is an instance block - used when arguments are not required
    // but constructors are usually preferred!

    {
        // TODO: Complete these higher-order functions to do accordingly

//        add = ;
//        subtract = ;
//        multiply = ;
//        divide = ;

        power = (a, b) -> (int) Math.pow(a, b);
    }

    public static void main(String... args) {
        LambdaExpressions instance = new LambdaExpressions();

        // Test these functions here:


        System.out.println("2^3 = " + instance.getPower().apply(2, 3));

        // These are Known as Function Pointers in C/C++ and Delegates in C# !
    }

    public BinaryOperator getAdd() {
        return add;
    }

    public BinaryOperator getSubtract() {
        return subtract;
    }

    public BinaryOperator getMultiply() {
        return multiply;
    }

    public BinaryOperator getDivide() {
        return divide;
    }

    public BinaryOperator getPower() {
        return power;
    }
}