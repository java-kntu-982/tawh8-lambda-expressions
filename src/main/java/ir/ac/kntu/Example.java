package ir.ac.kntu;

//This class is just an example and can be deleted!
public class Example {
    public static void main(String[] args) {
        //Anonymous Innerclass sample
        Function sqrt = new Function() {
            @Override
            public Double apply(Double input) {
                return Math.sqrt(input);
            }
        };
        //Note That the lines below acts just like the one above
        Function sqrt1 = input -> Math.sqrt(input);//lambda expressions syntax
        Function sqrt2 = Math::sqrt;//method reference - will be discussed later

        System.out.println(sqrt.apply(4.0));
        System.out.println(sqrt1.apply(4.0));
        System.out.println(sqrt2.apply(4.0));

        System.out.println("--------------------------------");
        //another example
        //https://en.wikipedia.org/wiki/Gaussian_function
        Function gaussian = input ->
                Math.pow(Math.E, -1 * Math.pow(input, 2) / 2);
        System.out.println(gaussian.apply(0.0));
        System.out.println(gaussian.apply(Double.MAX_VALUE));
        System.out.println(gaussian.apply(-1 * Double.MAX_VALUE));
        //2.0 == 2d => 2 as a Double
        //FoG = F(G(X))
        System.out.println("--------------------------------");
        Function squareRootOfGaussian = sqrt.compose(gaussian);
        System.out.println(gaussian.apply(2d));
        System.out.println(squareRootOfGaussian.apply(2.0d));
        System.out.println(sqrt.apply(gaussian.apply(2.0d)));

    }
}

@FunctionalInterface
interface Function {
    Double apply(Double input);

    //fog = F(G(x))
    default Function compose(Function function) {
        return x -> apply(function.apply(x));
    }
    //Can be used for composing two functions
}