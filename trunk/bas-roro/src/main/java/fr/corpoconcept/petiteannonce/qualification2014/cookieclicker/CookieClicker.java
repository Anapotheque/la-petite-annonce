package fr.corpoconcept.petiteannonce.qualification2014.cookieclicker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class CookieClicker {

	static final String FILE_SAMPLE_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification2014/cookieclicker/sample.out";
	
	static final String FILE_SAMPLE_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification2014/cookieclicker/sample.in";
	
	static final String FILE_SMALL_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification2014/cookieclicker/B-small-attempt.out";

    static final String FILE_SMALL_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification2014/cookieclicker/B-small-attempt5.in";

    static final String FILE_LARGE_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification2014/cookieclicker/B-large.out";

    static final String FILE_LARGE_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification2014/cookieclicker/B-large.in";

    private static double costCookieFarm = 0.0;
    private static double extraIncome = 0.0;
    private static double numberCookieToWin = 0.0;
    
    private static NumberFormat formatter = new DecimalFormat("#0.0000000");  
    
    private static HashMap<Integer,Double> result = new HashMap<Integer,Double>();
    
    /**
     * Methode de traitement du cas
     * 
     * @return String
     */
    protected static String traitement(String line) {
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
    
    private static double format(double value){
    	return Double.valueOf(formatter.format(value).replace(",", "."));
    }
    
    private static void boucleFarm(){
		double total = 0.0;
		result.put(0, calculTimingForWin(0));
		int nombreFarm=1;
    	while(true){
    		double timingForBuyFarm = calculTimingForBuyFarm(nombreFarm-1);
    		total = timingForBuyFarm + calculTimingForWin(nombreFarm);
    		if(format(getRecord()) >= format(total)){
    			result.put(nombreFarm, total);
    		}else{
    			break;
    		}
    		nombreFarm++;
    	}
    }
    
    private static double getRecord(){
    	double record = 0.0000000;
    	for(double time : result.values()){
    		if(record == 0.0 || record > time){
    			record = time;
    		}
    	}
    	return record;
    }
    
    private static double calculTimingForWin(int numberOfFarm){
    	return numberCookieToWin / ( numberOfFarm * extraIncome + 2.0 );
    }
    
    private static double calculTimingForBuyFarm(int numberOfFarm){
    	double timing = 0.0;
    	for(int i = 0; i <= numberOfFarm; i++){
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
    public static void main(String[] args) throws IOException {

    	java.util.Date uDate = new java.util.Date (System.currentTimeMillis ()); //Relever l'heure avant le debut du progamme (en milliseconde) 
    	
    	// -----------------------------------------------------------------------------------
        // CAS SAMPLE
        // -----------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(new File(FILE_SAMPLE_INPUT_NAME));
//        BufferedWriter output = new BufferedWriter(new FileWriter(FILE_SAMPLE_OUTPUT_NAME, false));
//
//        // On boucle sur le nombre de cas possible avec traitement du cas
//        int n = Integer.valueOf(scanner.nextLine());
//        for (int i = 1; i <= n; i++) {
//            String resultLine = "Case #" + i + ": " + traitement(scanner.nextLine()) + "\n";
//            output.write(resultLine);
//            System.out.print(resultLine);
//        }
//
//        output.flush();
//        output.close();
//        scanner.close();
    	
    	// -----------------------------------------------------------------------------------
        // CAS SMALL
        // -----------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(new File(FILE_SMALL_INPUT_NAME));
//        BufferedWriter output = new BufferedWriter(new FileWriter(FILE_SMALL_OUTPUT_NAME, false));

        // On boucle sur le nombre de cas possible avec traitement du cas
//        int n = Integer.valueOf(scanner.nextLine());
//        for (int i = 1; i <= n; i++) {
//            String resultLine = "Case #" + i + ": " + traitement(scanner.nextLine()) + "\n";
//            output.write(resultLine);
//            System.out.print(resultLine);
//        }
//
//        output.flush();
//        output.close();
//        scanner.close();

        // -----------------------------------------------------------------------------------
        // CAS LARGE
        // -----------------------------------------------------------------------------------
        Scanner scanner = new Scanner(new File(FILE_LARGE_INPUT_NAME));
       BufferedWriter output = new BufferedWriter(new FileWriter(FILE_LARGE_OUTPUT_NAME, false));

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
        
        Date dateFin = new Date (System.currentTimeMillis()); //Relever l'heure a la fin du progamme (en milliseconde) 
        Date duree = new Date (System.currentTimeMillis()); //Pour calculer la différence
        duree.setTime (dateFin.getTime () - uDate.getTime ());  //Calcul de la différence
        long secondes = duree.getTime () / 1000;
        long min = secondes / 60;
        long heures = min / 60;
        long mili = duree.getTime () % 1000;
        secondes %= 60;
        System.out.println ("Durée du traitement : " + heures + " h " + min + " min " + secondes + " sec " + mili + " milli");
    }
}
