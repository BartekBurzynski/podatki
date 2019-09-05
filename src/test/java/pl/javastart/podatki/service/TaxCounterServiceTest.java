package pl.javastart.podatki.service;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class TaxCounterServiceTest {

    @Test
    public void for100000_shouldReturn19470() {
        //given
        TaxCounterService test = new TaxCounterService();
        int x = 100000;
        //when
        int calc = test.podatki(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(19470));
    }

    @Test
    public void for85528_shouldReturn14839() {
        //given
        TaxCounterService test = new TaxCounterService();
        int x = 85528;
        //when
        int calc = test.podatki(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(14839));
    }

    @Test
    public void for85529_shouldReturn14839() {
        //given
        TaxCounterService test = new TaxCounterService();
        int x = 85529;
        //when
        int calc = test.podatki(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(14839));
    }

    @Test
    public void for10_shouldReturn0() {
        //given
        TaxCounterService test = new TaxCounterService();
        int x = 10;
        //when
        int calc = test.podatki(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(0));
    }
}
