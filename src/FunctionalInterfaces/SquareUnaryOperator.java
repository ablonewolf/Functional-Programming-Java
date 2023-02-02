package FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class SquareUnaryOperator implements UnaryOperator<Integer> {
    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}
