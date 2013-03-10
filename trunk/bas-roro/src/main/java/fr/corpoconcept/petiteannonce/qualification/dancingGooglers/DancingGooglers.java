package fr.corpoconcept.petiteannonce.qualification.dancingGooglers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DancingGooglers {

    static final String FILE_SMALL_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/dancingGooglers/B-small-practice.out";

    static final String FILE_SMALL_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/dancingGooglers/B-small-practice.in";

    static final String FILE_LARGE_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/dancingGooglers/B-large-practice.out";

    static final String FILE_LARGE_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/dancingGooglers/B-large-practice.in";

    /**
     * Methode de traitement du cas
     * 
     * @return String
     */
    protected static String traitement(String line) {

        Scanner scannerNumber = new Scanner(line);
        int googlers = scannerNumber.nextInt();
        int surprisingNotes = scannerNumber.nextInt();
        int bareme = scannerNumber.nextInt();

        int resultNonSurprenant = 0;
        int resultSurpenant = 0;

        // On boucle sur chaque somme de note
        for (int i = 0; i < googlers; i++) {
            int somme = scannerNumber.nextInt();
            int moyenne = somme / 3;
            int modulo = somme % 3;

            int noteMaxNonSurprenante = moyenne;
            // On affecte les modulo aux notes
            if (modulo == 1) {
                noteMaxNonSurprenante += 1;
            } else if (modulo == 2) {
                noteMaxNonSurprenante += 1;
            }

            // Incrementation si la note max est superieure au bareme de passage
            if (noteMaxNonSurprenante >= bareme) {
                resultNonSurprenant++;
            }

            int noteMaxSurprenante = moyenne;
            if (modulo == 0) {
                if (somme > 2 && noteMaxNonSurprenante < 10) {
                    noteMaxSurprenante += 1;
                }
            } else if (modulo == 1) {
                if (somme > 2 && noteMaxNonSurprenante < 10) {
                    noteMaxSurprenante += 1;
                }
            } else if (modulo == 2) {
                if (noteMaxNonSurprenante < 9) {
                    noteMaxSurprenante += 2;
                }
            }

            // Incrementation si la note max est superieure au bareme de passage
            if (noteMaxSurprenante >= bareme) {
                resultSurpenant++;
            }
        }

        int result = resultNonSurprenant + surprisingNotes;
        if (result > resultSurpenant) {
            result = resultSurpenant;
        }

        scannerNumber.close();
        return "" + result;
    }

    /**
     * Methode d'execution classique
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // -----------------------------------------------------------------------------------
        // CAS SMALL
        // -----------------------------------------------------------------------------------
        Scanner scanner = new Scanner(new File(FILE_SMALL_INPUT_NAME));
        BufferedWriter output = new BufferedWriter(new FileWriter(FILE_SMALL_OUTPUT_NAME, false));

        // On boucle sur le nombre de cas possible avec traitement du cas
        int n = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String resultLine = "Case #" + i + ": " + traitement(scanner.nextLine()) + "\n";
            output.write(resultLine);
            System.out.print(resultLine);
        }

        output.flush();
        output.close();
        scanner.close();

        // -----------------------------------------------------------------------------------
        // CAS LARGE
        // -----------------------------------------------------------------------------------
        scanner = new Scanner(new File(FILE_LARGE_INPUT_NAME));
        output = new BufferedWriter(new FileWriter(FILE_LARGE_OUTPUT_NAME, false));

        // On boucle sur le nombre de cas possible avec traitement du cas
        n = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String resultLine = "Case #" + i + ": " + traitement(scanner.nextLine()) + "\n";
            output.write(resultLine);
            System.out.print(resultLine);
        }

        output.flush();
        output.close();
        scanner.close();
    }
}
