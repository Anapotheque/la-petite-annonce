package fr.corpoconcept.petiteannonce.qualification2014.cookieclicker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CookieClickerTest {

    CookieClicker cookieClicker = new CookieClicker();

    @Test
    public void should_return_good_value_from_google_line_1() {
        assertEquals("1.0000000", cookieClicker.traitement("30.0 1.0 2.0"));
    }

    @Test
    public void should_return_good_value_from_google_line_2() {
        assertEquals("39.1666667", cookieClicker.traitement("30.0 2.0 100.0"));
    }

    @Test
    public void should_return_good_value_from_google_line_3() {
        assertEquals("63.9680013", cookieClicker.traitement("30.50000 3.14159 1999.19990"));
    }

    @Test
    public void should_return_good_value_from_google_line_4() {
        assertEquals("526.1904762", cookieClicker.traitement("500.0 4.0 2000.0"));
    }
}
