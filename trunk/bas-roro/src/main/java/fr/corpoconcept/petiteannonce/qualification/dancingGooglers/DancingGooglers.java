package fr.corpoconcept.petiteannonce.qualification.dancingGooglers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DancingGooglers {

    static final String FILE_INPUT_NAME = "/fr/corpoconcept/petiteannonce/qualification/speakingInTongues/A-small-practice.in";

    static final String FILE_OUTPUT_NAME = "/src/main/resources/qualification/speakingInTongues/A-small-practice.out";

    static Scanner scanner;

    static FileWriter fw;

    static BufferedWriter output;

    /**
     * Methode de traitement du cas
     * 
     * @return String
     */
    private static String traitement() {
        /*
         * Scanner scannerNumber = new Scanner(scanner.nextLine()); int googlers
         * = scannerNumber.nextInt(); int suprisingScores =
         * scannerNumber.nextInt(); int p = scannerNumber.nextInt();
         * List<Integer> n = new ArrayList<Integer>(); for(int i = 0; i <=
         * googlers ; i ++){ n.add(scannerNumber.nextInt()); }
         */
        return scanner.nextLine();
    }

    /**
     * Methode d'execution classique
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // Ouverture du fichier d'entrées
        scanner = new Scanner(new File(FILE_INPUT_NAME));

        // Creation du fichier de sortie
        output = new BufferedWriter(new FileWriter(FILE_OUTPUT_NAME, false));

        // On boucle sur le nombre de cas possible avec traitement du cas
        for (int i = 1; i <= new Scanner(scanner.nextLine()).nextInt(); i++) {
            String resultLine = "Case #" + i + ": " + traitement() + "\n";
            output.write(resultLine);
            System.out.print(resultLine);
        }

        // transfert des données au fichier et fermeture du fichier
        output.flush();
        output.close();
    }
}
