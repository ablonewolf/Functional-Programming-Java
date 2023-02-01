package FunctionalInterfaces;

import java.util.function.Function;

public class SquaredFunction implements Function<Integer,Integer> {
    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}
