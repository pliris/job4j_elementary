package ru.job4j.converter;
/**
** Конвертер валют
 * @author Nikita
*/

public class Converter {
    /**
     * Method rubleToEuro.
     * @param value - количество рублей
     * @return rsl - количество евро
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }
    /**
     * Method rubleToDollar.
     * @param value - количество рублей
     * @return rsl - количество долларов
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 45;
        return rsl;
    }
     /**
     *Main
     *@param args - euro - итоговое количество евро
      * @param args - dollar - итоговое количество доллларов
      * @param args - in - количество рублей
      * @param args - expectedEuro - ожидаемое количество евро
      * @param args - expectedDollar - ожидвемое количество долларов
      * @param args - out - фактичееское количество валюты после вычислений
      * @param args - passedEuro - истинность совпадения ожидаемого с фактическим в евро
      * @param args - passedDollar - истинность совпадения ожидаемого с фактическим в долларах
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        int in = 140;
        int expectedEuro = 2;
        int expectedDollar = 3;
        int out = rubleToEuro(in);
        boolean passedEuro = expectedEuro == out;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        out = rubleToDollar(in);
        boolean passedDollar = expectedDollar == out;
        System.out.println("140 rubles are 3. Test result : " + passedDollar);
        System.out.println("140 rubles are " + euro + " euro. 140 rubles are " + dollar);
    }
}
