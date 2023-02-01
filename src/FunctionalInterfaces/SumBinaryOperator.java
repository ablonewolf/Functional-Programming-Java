package FunctionalInterfaces;

import java.util.function.BinaryOperator;

public class SumBinaryOperator implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer number1, Integer number2) {
        return number1 + number2;
    }
}
