package fr.corpoconcept.petiteannonce.qualification.recycledNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecycledNumbersTest {

    @Test
    public void should_return_good_value_from_google_line_1() {
        assertEquals("0", RecycledNumbers.traitement("1 9"));
    }

    @Test
    public void should_return_good_value_from_google_line_2() {
        assertEquals("3", RecycledNumbers.traitement("10 40"));
    }

    @Test
    public void should_return_good_value_from_google_line_3() {
        assertEquals("156", RecycledNumbers.traitement("100 500"));
    }

    @Test
    public void should_return_good_value_from_google_line_5() {
        assertEquals("287", RecycledNumbers.traitement("1111 2222"));
    }
}
