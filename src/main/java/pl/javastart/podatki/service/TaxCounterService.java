package pl.javastart.podatki.service;

public class TaxCounterService {

    public static int podatki(int money) {

        double x;
        if (money <= 85528) {
            x = money * 0.18 - 556.02;
        } else {
            x = 14839.02 + 0.32 * (money - 85528);
        }
        return (int) x;
    }
}
