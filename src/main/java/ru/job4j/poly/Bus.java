package ru.job4j.poly;

public class Bus implements Transport {
    private static final int SEAT_MAX = 30;
    private int seatBusy = 0;
    private boolean drive = false;

    @Override
    public void drive() {
        drive = true;
    }

    /**
     * Метод расчета занятых мест пассажирами
     * @param count количество пассажиров в автобусе
     */
    @Override
    public void passengers(int count) {
        if (count <= SEAT_MAX) {
            seatBusy = count;
        }
    }

    /**
     * Метод рассчитывающий стоимость бензина
     * @param liters количетсво залитого бензина в литрах
     * @return цена за заправку
     */
    @Override
    public float fill(int liters) {
        float price = liters * 45;
        return price;
    }
}
