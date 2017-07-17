package fr.meehome.training.qualification.hallofmirrors;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class HallTest {

    static final String FILE_SMALL_INPUT_NAME_1 = "src/test/resources/fr/corpoconcept/petiteannonce/qualification/hallofmirrors/D-small-practice-1.in";

    static final String FILE_SMALL_INPUT_NAME_2 = "src/test/resources/fr/corpoconcept/petiteannonce/qualification/hallofmirrors/D-small-practice-2.in";

    static final String FILE_SMALL_INPUT_NAME_3 = "src/test/resources/fr/corpoconcept/petiteannonce/qualification/hallofmirrors/D-small-practice-3.in";

    static final String FILE_SMALL_INPUT_NAME_4 = "src/test/resources/fr/corpoconcept/petiteannonce/qualification/hallofmirrors/D-small-practice-4.in";

    static final String FILE_SMALL_INPUT_NAME_5 = "src/test/resources/fr/corpoconcept/petiteannonce/qualification/hallofmirrors/D-small-practice-5.in";

    static final String FILE_SMALL_INPUT_NAME_6 = "src/test/resources/fr/corpoconcept/petiteannonce/qualification/hallofmirrors/D-small-practice-6.in";

    @Test
    public void should_return_good_value_from_google_line_1() throws FileNotFoundException {
        System.out.println(FILE_SMALL_INPUT_NAME_1);
        Scanner scanner = new Scanner(new File(FILE_SMALL_INPUT_NAME_1));
        Hall hall = new Hall(scanner);
        assertEquals("4", hall.getReflet());
        System.out.println("");
    }

    @Test
    public void should_return_good_value_from_google_line_2() throws FileNotFoundException {
        System.out.println(FILE_SMALL_INPUT_NAME_2);
        Scanner scanner = new Scanner(new File(FILE_SMALL_INPUT_NAME_2));
        Hall hall = new Hall(scanner);
        assertEquals("8", hall.getReflet());
        System.out.println("");
    }

    @Test
    public void should_return_good_value_from_google_line_3() throws FileNotFoundException {
        System.out.println(FILE_SMALL_INPUT_NAME_3);
        Scanner scanner = new Scanner(new File(FILE_SMALL_INPUT_NAME_3));
        Hall hall = new Hall(scanner);
        assertEquals("68", hall.getReflet());
        System.out.println("");
    }

    @Test
    public void should_return_good_value_from_google_line_4() throws FileNotFoundException {
        System.out.println(FILE_SMALL_INPUT_NAME_4);
        Scanner scanner = new Scanner(new File(FILE_SMALL_INPUT_NAME_4));
        Hall hall = new Hall(scanner);
        assertEquals("0", hall.getReflet());
        System.out.println("");
    }

    @Test
    public void should_return_good_value_from_google_line_5() throws FileNotFoundException {
        System.out.println(FILE_SMALL_INPUT_NAME_5);
        Scanner scanner = new Scanner(new File(FILE_SMALL_INPUT_NAME_5));
        Hall hall = new Hall(scanner);
        assertEquals("2", hall.getReflet());
        System.out.println("");
    }

    @Test
    public void should_return_good_value_from_google_line_6() throws FileNotFoundException {
        System.out.println(FILE_SMALL_INPUT_NAME_6);
        Scanner scanner = new Scanner(new File(FILE_SMALL_INPUT_NAME_6));
        Hall hall = new Hall(scanner);
        assertEquals("28", hall.getReflet());
        System.out.println("");
    }
}
