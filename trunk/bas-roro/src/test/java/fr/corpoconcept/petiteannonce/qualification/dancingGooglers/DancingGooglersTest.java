package fr.corpoconcept.petiteannonce.qualification.dancingGooglers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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

}
