package FunctionalInterfaces;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapElementsOfAList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("The squared element of the list " + numbers + " is : " + mapAndCreateList(numbers,new SquaredFunction()));
        System.out.println();
        System.out.println("The squared element of the list " + numbers + " is : " + mapAndCreateList(numbers, new CubedFunction()));
        System.out.println();
    }

    private static List<Integer> mapAndCreateList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers
                .stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }
}
