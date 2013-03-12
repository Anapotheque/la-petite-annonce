package fr.corpoconcept.petiteannonce.qualification.hallOfMirrors;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HallOfMirrors {

    static final String FILE_SMALL_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/hallOfMirrors/D-small-practice.out";

    static final String FILE_SMALL_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/hallOfMirrors/D-small-practice.in";

    static final String FILE_LARGE_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/hallOfMirrors/D-large-practice.out";

    static final String FILE_LARGE_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/hallOfMirrors/D-large-practice.in";

    /**
     * Methode de traitement du cas
     * 
     * @return String
     */
    protected static String traitement(Character[][] matrice, Integer d) {
        return "";
    }

    /**
     * Methode d'execution classique
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // CAS SMALL
        computeByFile(FILE_SMALL_INPUT_NAME, FILE_SMALL_OUTPUT_NAME);

        // CAS LARGE
        computeByFile(FILE_LARGE_INPUT_NAME, FILE_LARGE_OUTPUT_NAME);
    }

    protected static int computeByFile(String inputFile, String outputFile) throws FileNotFoundException, IOException {

        Scanner scanner = new Scanner(new File(inputFile));
        BufferedWriter output = new BufferedWriter(new FileWriter(outputFile, false));

        // On boucle sur le nombre de cas possible avec traitement du cas
        int n = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= n; i++) {

            String line = scanner.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(line, " ");

            Integer x = Integer.valueOf(stringTokenizer.nextToken());
            Integer y = Integer.valueOf(stringTokenizer.nextToken());
            Integer d = Integer.valueOf(stringTokenizer.nextToken());

            Character[][] matrice = new Character[x][y];
            for (int j = 0; j <= x; j++) {
                String lineMatrice = scanner.nextLine();
                for (int k = 0; k <= y; k++) {
                    matrice[j][k] = lineMatrice.charAt(k);
                }
            }

            String resultLine = "Case #" + i + ": " + traitement(matrice, d) + "\n";
            output.write(resultLine);
            System.out.print(resultLine);
        }

        output.flush();
        output.close();
        scanner.close();
        return n;
    }
}
