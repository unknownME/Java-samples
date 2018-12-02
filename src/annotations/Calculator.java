package annotations;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Custom class, describes simple calculator
 *
 * @author Kryvobok Volodymyr
 * @version 1.0
 * @since 02.12.2018
 */

public class Calculator {

    /**
     * This is the main method which allows to execute custom calculator
     * @param input arguments
     * @throws NoSuchMethodException - if we can't create reflection class
     */
    @CalcAnnotations(number1 = 11, number2 = 22)
    public static void main(String[] args) throws NoSuchMethodException {

        Class<Calculator> mainClass = Calculator.class;
        Class<String[]> aString = String[].class;
        Method method = mainClass.getMethod("main", aString);
        CalcAnnotations annotation = method.getAnnotation(CalcAnnotations.class);

        Scanner op = new Scanner(System.in);

        System.out.println("Please Enter The Operation");
        String operation = op.next();

        if (operation.equals("+")) {
            System.out.println("Your Answer is " + addition(annotation.number1(), annotation.number2()));
        } else if (operation.equals("-")) {
            System.out.println("Your Answer is " + subtraction(annotation.number1(), annotation.number2()));
        } else if (operation.equals("*")) {
            System.out.println("Your Answer is " + multiplication(annotation.number1(), annotation.number2()));
        } else if (operation.equals("/")) {
            System.out.println("Your Answer is " + division(annotation.number1(), annotation.number2()));
        }
        op.close();
    }

    /**
     * This method allow to add two numbers, which are getted from annotation
     * @param x - first operand (from annotation)
     * @param y - second operand (from annotation)
     * @return result of additing of two numbers
     */
    public static int addition(int x, int y) {
        return x + y;
    }

    /**
     * This method allow to substract two numbers, which are getted from annotation
     * @param x - first operand (from annotation)
     * @param y - second operand (from annotation)
     * @return result of subtraction of two numbers
     */
    public static int subtraction(int x, int y) {
        return x - y;
    }

    /**
     * This method allow to multiply two numbers, which are getted from annotation
     * @param x - first operand (from annotation)
     * @param y - second operand (from annotation)
     * @return result of multiplication of two numbers
     */
    public static int multiplication(int x, int y) {
        return x * y;
    }

    /**
     * This method allow to divide two numbers, which are getted from annotation
     * @param x - first operand (from annotation)
     * @param y - second operand (from annotation)
     * @return result of division of two numbers
     */
    public static int division(int x, int y) {
        return x / y;
    }

}
