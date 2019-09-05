package pl.javastart.podatki;

import pl.javastart.podatki.service.TaxCounterService;

public class Application {
    public static void main(String[] args) {
        System.out.println(TaxCounterService.podatki(100000));
    }
}
