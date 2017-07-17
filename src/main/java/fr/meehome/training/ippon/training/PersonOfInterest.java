package fr.meehome.training.ippon.training;


import java.util.ArrayList;
import java.util.List;

public class PersonOfInterest {

    private static final String SEPARATOR = "\n";
    private static final int NB_DAYS = 30;
    private static List<String> telephones = new ArrayList<>();
    private static List<String> secuNumbers = new ArrayList<>();

    public String predictCrimes() {

        StringBuilder stringBuilder = new StringBuilder();

        int i = 0 ;
        while (i < NB_DAYS) {

            stringBuilder.append(getSSNumber());
            stringBuilder.append(SEPARATOR);
            stringBuilder.append(getCallingNumber());
            stringBuilder.append(SEPARATOR);
            stringBuilder.append(SEPARATOR);
            i++;
        }

        System.out.print(stringBuilder.toString());

        return stringBuilder.toString();
    }

    private String getSSNumber(){
        String ssNumber = "Crime predicted: " +
                random(100,999) + "-" +
                random(100,999) + "-" +
                random(100,999);

        if(telephones.contains(ssNumber)){
            getSSNumber();
        }

        telephones.add(ssNumber);
        return ssNumber;
    }

    private String getCallingNumber(){
        String number = "Calling: 1-" +
                random(100,999) +
                "-555-" +
                random(1000,9999);

        if(secuNumbers.contains(number)){
            getSSNumber();
        }

        secuNumbers.add(number);
        return number;
    }

    private int random(int lower, int higher){
        return (int)(Math.random() * (higher-lower)) + lower;
    }

}
