package BSIT2ndSem.methodsandclasses;

public class MathClasses {

    public static void main(String[] args) {

        double firstValue = 20;
        double secondValue = 4;

        System.out.println("Max Num of x and y is: " + Math.max(firstValue, secondValue));

        System.out.println("Square root of y is: " + Math.sqrt(secondValue));

        System.out.println("Power of x and y is: " + Math.pow(firstValue, secondValue));

        System.out.println("Log of x is: " + Math.log(firstValue));

        System.out.println("Log of y is: " + Math.log(secondValue));

        System.out.println("Log10 of x is: " + Math.log10(firstValue));

        System.out.println("Log10 of y is: " + Math.log10(secondValue));

        System.out.println("Log1p of x is: " + Math.log1p(firstValue));

        System.out.println("Exp of x is: " + Math.exp(firstValue));

        System.out.println("Expm1 of x is: " + Math.expm1(firstValue));
    }
}
