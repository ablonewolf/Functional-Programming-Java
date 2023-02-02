package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberSupplier implements Supplier<List<Integer>> {
    private Random random;
    private Integer listSize;

    public RandomNumberSupplier(Integer listSize) {
        this.random = new Random();
        this.listSize = listSize;
    }

    @Override
    public List<Integer> get() {
        Integer counter = 0;
        List<Integer> randomNumbers = new ArrayList<>();
        while (counter < listSize) {
            randomNumbers.add(random.nextInt(101));
            counter++;
        }
        return randomNumbers;
    }
}
