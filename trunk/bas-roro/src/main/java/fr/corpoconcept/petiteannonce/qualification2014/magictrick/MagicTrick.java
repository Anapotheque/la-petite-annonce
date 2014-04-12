package fr.corpoconcept.petiteannonce.qualification2014.magictrick;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MagicTrick {

    static final String FILE_OUTPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification2014/magicTrick/A-small-attempt.out";

    static final String FILE_INPUT_NAME = "src/main/resources/fr/corpoconcept/petiteannonce/qualification2014/magicTrick/A-small-attempt.in";

    static final String BAD_MAGICIAN = "Bad magician!";
    
    static final String VOLUNTEER_CHEATED = "Volunteer cheated!";
    
    /**
     * Methode de traitement du cas
     * 
     * @return String
     */
    protected static String traitement(Scanner scanner) {
        
        int answer1 = scanner.nextInt();
        scanner.nextLine();
        
        HashMap<Integer,List<Integer>> square1 = getSquare(scanner);
        scanner.nextLine();
        
        int answer2 = scanner.nextInt();
        scanner.nextLine();
        
        HashMap<Integer,List<Integer>> square2 = getSquare(scanner);
    	
        Integer result = null;
		int numberResult = 0;
        
        for(int i : square1.get(answer1)){
        	for(int j : square2.get(answer2)){
        		
        		if(i == j){
        			numberResult++;
        			result = i;
        		} 
        		
        		
        	}
        }
        
        if(numberResult == 0){
			return VOLUNTEER_CHEATED;
		} if(numberResult > 1){
			return BAD_MAGICIAN;
		} else {
			return String.valueOf(result);
		}
    }
    
    private static HashMap<Integer,List<Integer>> getSquare(Scanner scanner){
    	
    	HashMap<Integer,List<Integer>> square = new HashMap<Integer,List<Integer>>();
    	
    	List<Integer> list1 = new ArrayList<Integer>();
    	for(int i = 1; i<=4;i++){
    		list1.add(scanner.nextInt());
    	}
    	square.put(1, list1);
    	scanner.nextLine();
        
    	List<Integer> list2 = new ArrayList<Integer>();
    	for(int i = 1; i<=4;i++){
    		list2.add(scanner.nextInt());
    	}
    	square.put(2, list2);
        scanner.nextLine();
        
        List<Integer> list3 = new ArrayList<Integer>();
    	for(int i = 1; i<=4;i++){
    		list3.add(scanner.nextInt());
    	}
    	square.put(3, list3);
        scanner.nextLine();
        
        List<Integer> list4 = new ArrayList<Integer>();
    	for(int i = 1; i<=4;i++){
    		list4.add(scanner.nextInt());
    	}
    	square.put(4, list4);
        
        return square;
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
            String resultLine = "Case #" + i + ": " + traitement(scanner) + "\n";
            output.write(resultLine);
            System.out.print(resultLine);
        }

        // Fermeture des flux et transfert vers fichier de sortie
        output.flush();
        output.close();
        scanner.close();
    }
	
}
