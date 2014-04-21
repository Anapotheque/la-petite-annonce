package fr.corpoconcept.petiteannonce.qualification2014.cookieclicker;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Scanner;

import fr.corpoconcept.petiteannonce.qualification.utils.AbstractWriter;

public class CookieClicker extends AbstractWriter {

    static final String FILE_SAMPLE_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification2014/cookieclicker/sample.in";

    static final String FILE_SMALL_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification2014/cookieclicker/B-small-attempt5.in";

    static final String FILE_LARGE_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification2014/cookieclicker/B-large.in";

    private static double costCookieFarm = 0.0;

    private static double extraIncome = 0.0;

    private static double numberCookieToWin = 0.0;

    private static NumberFormat formatter = new DecimalFormat("#0.0000000");

    private static HashMap<Integer, Double> result = new HashMap<Integer, Double>();

    /**
     * Methode de traitement du cas
     * 
     * @return String
     */
    @Override
    protected String traitement(String line) {
        Scanner scanner = new Scanner(line);

        // C
        costCookieFarm = Double.valueOf(scanner.next());

        // F
        extraIncome = Double.valueOf(scanner.next());

        // X
        numberCookieToWin = Double.valueOf(scanner.next());

        result.clear();
        boucleFarm();

        scanner.close();
        return String.valueOf(format(getRecord()));
    }

    private static double format(double value) {
        return Double.valueOf(formatter.format(value).replace(",", "."));
    }

    private static void boucleFarm() {
        double total = 0.0;
        result.put(0, calculTimingForWin(0));
        int nombreFarm = 1;
        while (true) {
            double timingForBuyFarm = calculTimingForBuyFarm(nombreFarm - 1);
            total = timingForBuyFarm + calculTimingForWin(nombreFarm);
            if (format(getRecord()) >= format(total)) {
                result.put(nombreFarm, total);
            } else {
                break;
            }
            nombreFarm++;
        }
    }

    private static double getRecord() {
        double record = 0.0000000;
        for (double time : result.values()) {
            if (record == 0.0 || record > time) {
                record = time;
            }
        }
        return record;
    }

    private static double calculTimingForWin(int numberOfFarm) {
        return numberCookieToWin / (numberOfFarm * extraIncome + 2.0);
    }

    private static double calculTimingForBuyFarm(int numberOfFarm) {
        double timing = 0.0;
        for (int i = 0; i <= numberOfFarm; i++) {
            timing += costCookieFarm / (i * extraIncome + 2.0);
        }
        return timing;
    }

    /**
     * Methode d'execution classique
     * 
     * @param args
     * @throws IOException
     */
    public void main(String[] args) throws IOException {

        CookieClicker cookieClicker = new CookieClicker();

        // CAS SAMPLE
        cookieClicker.computeByFile(FILE_SAMPLE_INPUT_NAME);

        // CAS SMALL
        cookieClicker.computeByFile(FILE_SMALL_INPUT_NAME);

        // CAS LARGE
        cookieClicker.computeByFile(FILE_LARGE_INPUT_NAME);
    }
}
