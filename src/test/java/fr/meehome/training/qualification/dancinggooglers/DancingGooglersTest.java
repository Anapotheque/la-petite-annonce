package fr.meehome.training.qualification.dancinggooglers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DancingGooglersTest {

    @Test
    public void should_return_good_value_from_google_line_1() {
        assertEquals("3", DancingGooglers.traitement("3 1 5 15 13 11"));
    }

    @Test
    public void should_return_good_value_from_google_line_2() {
        assertEquals("2", DancingGooglers.traitement("3 0 8 23 22 21"));
    }

    @Test
    public void should_return_good_value_from_google_line_3() {
        assertEquals("1", DancingGooglers.traitement("2 1 1 8 0"));
    }

    @Test
    public void should_return_good_value_from_google_line_4() {
        assertEquals("3", DancingGooglers.traitement("6 2 8 29 20 8 18 18 21"));
    }

    @Test
    public void should_return_good_value_from_google_line_5() {
        assertEquals("1", DancingGooglers.traitement("2 2 6 13 15"));
    }

    @Test
    public void should_return_good_value_from_google_line_97() {
        assertEquals("1", DancingGooglers.traitement("2 1 6 14 14"));
    }

    @Test
    public void should_return_good_value_from_google_line_10() {
        assertEquals("2", DancingGooglers.traitement("3 1 3 18 26 1"));
    }

    @Test
    public void should_return_good_value_from_google_line_40() {
        assertEquals("0", DancingGooglers.traitement("2 2 6 12 11"));
    }

    @Test
    public void should_return_good_value_from_google_large_line_24() {
        assertEquals("8", DancingGooglers.traitement("22 6 10 8 26 14 26 30 27 27 16 10 11 12 26 1 7 16 7 10 29 26 9 2 26"));
    }

    @Test
    public void should_return_good_value_from_google_large_line_61() {
        assertEquals("53",
                        DancingGooglers.traitement("54 10 1 2 27 28 19 11 16 30 29 10 0 3 4 11 15 18 18 7 2 9 3 14 20 29 6 15 16 18 11 24 5 12 13 26 20 13 6 11 11 19 14 14 16 27 13 13 1 13 6 18 19 4 2 15 21"));
    }
}
