package fr.meehome.training.qualification.hallofmirrors;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HallOfMirrors {

    static final String FILE_SMALL_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/hallofmirrors/D-small-practice.out";

    static final String FILE_SMALL_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/hallofmirrors/D-small-practice.in";

    static final String FILE_LARGE_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/hallofmirrors/D-large-practice.out";

    static final String FILE_LARGE_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/hallofmirrors/D-large-practice.in";

    /**
     * Methode permetant de traiter un fichier en entrée et de fournir un
     * fichier de sortie
     * 
     * @param inputFile
     * @param outputFile
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    protected static int computeByFile(String inputFile, String outputFile) throws FileNotFoundException, IOException {

        Scanner scanner = new Scanner(new File(inputFile));
        BufferedWriter output = new BufferedWriter(new FileWriter(outputFile, false));

        // On boucle sur le nombre de cas possible avec traitement du cas
        int n = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String resultLine = "Case #" + i + ": " + new Hall(scanner).getReflet() + "\n";
            output.write(resultLine);
            System.out.print(resultLine);
        }

        output.flush();
        output.close();
        scanner.close();
        return n;
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
}
