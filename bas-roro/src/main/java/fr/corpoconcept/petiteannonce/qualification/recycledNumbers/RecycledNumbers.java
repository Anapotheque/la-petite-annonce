package fr.corpoconcept.petiteannonce.qualification.recycledNumbers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RecycledNumbers {

    static final String FILE_SMALL_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/recycledNumbers/C-small-practice.out";

    static final String FILE_SMALL_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/recycledNumbers/C-small-practice.in";

    static final String FILE_LARGE_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/recycledNumbers/C-large-practice.out";

    static final String FILE_LARGE_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/recycledNumbers/C-large-practice.in";

    /**
     * Methode de traitement du cas
     * 
     * @return String
     */
    protected static String traitement(String line) {

        Scanner scanner = new Scanner(line);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int y = 0;
        if (a >= 10) {

            for (int i = a; i <= b; i++) {

                String n = String.valueOf(i);
                int longueur = n.length();

                for (int j = 1; j < longueur; j++) {
                    int m = Integer.valueOf((String ) n.subSequence(j, longueur) + (String ) n.subSequence(0, j));
                    if (a <= Integer.valueOf(n) && Integer.valueOf(n) < m && m <= b) {
                        y++;
                    }
                }
            }
        }

        scanner.close();
        return String.valueOf(y);
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
