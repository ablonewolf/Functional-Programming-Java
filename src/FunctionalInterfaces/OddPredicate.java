package FunctionalInterfaces;

import java.util.function.Predicate;

public class OddPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        return number % 2 != 0;
    }
}
