package fr.corpoconcept.petiteannonce.qualification.dancingGooglers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DancingGooglers {

    static final String FILE_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/dancingGooglers/B-small-practice.out";

    static final String FILE_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification/dancingGooglers/B-small-practice.in";

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

            // On affecte les notes de base : somme / 3
            int[] tripplet = {moyenne, moyenne, moyenne };

            // On affecte les modulo aux notes
            if (modulo == 1) {
                tripplet[0] += 1;
            } else if (modulo == 2) {
                tripplet[0] += 1;
                tripplet[1] += 1;
            }

            // Incrementation si la note max est superieure au bareme de passage
            int noteMaxNonSurprenante = Math.max(Math.max(tripplet[0], tripplet[1]), tripplet[2]);
            if (noteMaxNonSurprenante >= bareme) {
                resultNonSurprenant++;
            }

            int[] trippletSurprenant = tripplet;
            if (modulo == 0) {
                if (somme > 2 && noteMaxNonSurprenante < 10) {
                    trippletSurprenant[0] += 1;
                    trippletSurprenant[2] -= 1;
                }
            } else if (modulo == 2) {
                if (surprisingNotes > 0 && noteMaxNonSurprenante < 9) {
                    trippletSurprenant[0] += 2;
                    trippletSurprenant[1] -= 1;
                }
            }

            // Incrementation si la note max est superieure au bareme de passage
            int noteMaxSurprenante = Math.max(Math.max(trippletSurprenant[0], trippletSurprenant[1]), trippletSurprenant[2]);
            if (noteMaxSurprenante >= bareme) {
                resultSurpenant++;
            }
        }

        scannerNumber.close();
        int result = resultNonSurprenant;

        if (surprisingNotes >= resultSurpenant) {
            result = +resultSurpenant;
        } else {
            result += surprisingNotes;
        }

        return "" + result;
    }

    /**
     * Methode d'execution classique
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // Ouverture du fichier d'entrees
        Scanner scanner = new Scanner(new File(FILE_INPUT_NAME));

        // Creation du fichier de sortie
        BufferedWriter output = new BufferedWriter(new FileWriter(FILE_OUTPUT_NAME, false));

        // On boucle sur le nombre de cas possible avec traitement du cas
        int n = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String resultLine = "Case #" + i + ": " + traitement(scanner.nextLine()) + "\n";
            output.write(resultLine);
            System.out.print(resultLine);
        }

        // Fermeture des flux et transfert vers fichier de sortie
        output.flush();
        output.close();
        scanner.close();
    }
}
