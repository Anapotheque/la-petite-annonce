package fr.corpoconcept.petiteannonce.qualification.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public abstract class AbstractWriter {

    protected abstract String traitement(String line);

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
    protected void computeByFile(String inputFile) throws FileNotFoundException, IOException {

        String outputFile = inputFile.substring(0, inputFile.length() - 2) + "out";

        // Relever l'heure avant le debut du progamme (en milliseconde)
        java.util.Date uDate = new java.util.Date(System.currentTimeMillis());

        Scanner scanner = new Scanner(new File(inputFile));
        BufferedWriter output = new BufferedWriter(new FileWriter(outputFile, false));

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

        Date dateFin = new Date(System.currentTimeMillis()); // Relever l'heure
                                                             // a la fin du
                                                             // progamme (en
                                                             // milliseconde)
        Date duree = new Date(System.currentTimeMillis()); // Pour calculer la
                                                           // différence
        duree.setTime(dateFin.getTime() - uDate.getTime()); // Calcul de la
                                                            // différence
        long secondes = duree.getTime() / 1000;
        long min = secondes / 60;
        long heures = min / 60;
        long mili = duree.getTime() % 1000;
        secondes %= 60;
        System.out.println("Durée du traitement : " + heures + " h " + min + " min " + secondes + " sec " + mili + " milli");
    }
}
