package model.services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            // Se o item da lista comparado ao valor de max é maior que zero (positivo é verdadeiro).
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}