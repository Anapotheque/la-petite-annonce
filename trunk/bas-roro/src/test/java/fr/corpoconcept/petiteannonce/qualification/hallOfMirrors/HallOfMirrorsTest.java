package fr.corpoconcept.petiteannonce.qualification.hallOfMirrors;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class HallOfMirrorsTest {

    static final String FILE_SMALL_OUTPUT_NAME_EXPECTED = "src/test/resources/fr/corpoconcept/petiteannonce/qualification/hallOfMirrors/D-small-practice-expected.out";

    static final String FILE_SMALL_OUTPUT_NAME = "src/test/resources/fr/corpoconcept/petiteannonce/qualification/hallOfMirrors/D-small-practice.out";

    static final String FILE_SMALL_INPUT_NAME = "src/test/resources/fr/corpoconcept/petiteannonce/qualification/hallOfMirrors/D-small-practice.in";

    private int nombreCas;

    @Before
    public void init() throws FileNotFoundException, IOException {
        nombreCas = HallOfMirrors.computeByFile(FILE_SMALL_INPUT_NAME, FILE_SMALL_OUTPUT_NAME);
    }

    @Test
    public void should_return_good_value_from_google_line_1() throws FileNotFoundException {
        Scanner scannerTest = new Scanner(new File(FILE_SMALL_OUTPUT_NAME));
        Scanner scannerExpected = new Scanner(new File(FILE_SMALL_OUTPUT_NAME_EXPECTED));

        for (int i = 1; i <= nombreCas + 1; i++) {
            assertEquals(scannerExpected.nextLine(), scannerTest.nextLine());
        }

        scannerTest.close();
        scannerExpected.close();
    }
}
