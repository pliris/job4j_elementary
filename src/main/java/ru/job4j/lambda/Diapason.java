package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;

import static java.lang.Double.valueOf;

public class Diapason {
    public static Double linearFunction(Double i, Double rsl) {
        ToDoubleBiFunction<Double, Double> function = new ToDoubleBiFunction<Double, Double>() {
            @Override
            public double applyAsDouble(Double i, Double rsl) {
                rsl = 2 * i + 1;
                return rsl;
            }
        };
        return rsl;
    }
    public static Double quadraticFunction(Double i, Double rsl) {
        ToDoubleBiFunction<Double, Double> function = new ToDoubleBiFunction<Double, Double>() {
            @Override
            public double applyAsDouble(Double i, Double rsl) {
                rsl = 3 *  Math.pow(i, 2) + 2 * i + 1;
                return rsl;
            }
        };
        return rsl;
    }
    public static Double exponentialFunction(Double i, Double rsl) {
        ToDoubleBiFunction<Double, Double> function = new ToDoubleBiFunction<Double, Double>() {
            @Override
            public double applyAsDouble(Double i, Double rsl) {
                rsl = Math.pow(3, i);
                return rsl;
            }
        };
        return rsl;
    }


    public static List<Double> diapason(int start, int end, Function<Double, Double> function) {
            List<Double> list = new ArrayList<>();
            int rsl = 1;
            Double i;
            for (i = Double.valueOf(start); i < end; i++) {
                list.add(function.apply(i));
            }
            return list;
        }
    }
