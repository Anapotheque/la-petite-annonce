package fr.meehome.training.qualification.hallofmirrors;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hall {

    private Integer x;

    private Integer y;

    private Integer d;

    private Map<Map<String, Integer>, ElementsEnum> matrice;

    private Map<Map<String, Integer>, Double> matriceDistance;

    Map<String, Integer> myCoord;

    public Hall(Scanner scanner) {

        this.y = scanner.nextInt() - 1;
        this.x = scanner.nextInt() - 1;
        this.d = scanner.nextInt();

        scanner.nextLine();

        matrice = new HashMap<Map<String, Integer>, ElementsEnum>();
        for (int j = 0; j <= y; j++) {
            String lineMatrice = scanner.nextLine();
            for (int k = 0; k <= x; k++) {
                HashMap<String, Integer> mapCoord = new HashMap<String, Integer>();
                mapCoord.put("x", k);
                mapCoord.put("y", j);
                matrice.put(mapCoord, ElementsEnum.getElement(String.valueOf(lineMatrice.charAt(k))));
            }
        }

        // Calcul de mes coordonnées
        myCoord = getMyCoord();

        // Calcul de la matrice des distances
        matriceDistance = new HashMap<Map<String, Integer>, Double>();
        for (Map<String, Integer> coord : matrice.keySet()) {
            matriceDistance.put(coord, calculDistance(coord));
        }
    }

    /**
     * Renvoi le nombre total de reflet
     * 
     * @return
     */
    protected String getReflet() {
        int reflet = 0;
        for (Map<String, Integer> coord : matrice.keySet()) {
            if (!isMyCoord(coord)) {
                if (matriceDistance.get(coord) * 2 <= d) {
                    System.out.println("x : " + coord.get("x") + " y : " + coord.get("y") + " - reflected");
                    reflet++;
                } else {
                    System.out.println("x : " + coord.get("x") + " y : " + coord.get("y") + " - not reflected");
                }
            } else {
                System.out.println("x : " + coord.get("x") + " y : " + coord.get("y") + " - my coord");
            }
        }
        return String.valueOf(reflet);
    }

    private Double calculDistance(Map<String, Integer> coordDistante) {
        return Math.hypot(Math.abs(coordDistante.get("x") - myCoord.get("x")), Math.abs(coordDistante.get("y") - myCoord.get("y"))) / 2;
    }

    /**
     * Calcul mes coordonnées
     * 
     * @return
     */
    private Map<String, Integer> getMyCoord() {
        Map<String, Integer> myCoord = null;
        for (Map<String, Integer> coord : matrice.keySet()) {
            if (matrice.get(coord) == ElementsEnum.ME) {
                myCoord = coord;
            }
        }
        return myCoord;
    }

    /**
     * Calcule si se sont mes coordonnées
     * 
     * @param coord
     * @return
     */
    private boolean isMyCoord(Map<String, Integer> coord) {
        return coord.get("x") == myCoord.get("x") && coord.get("y") == myCoord.get("y") ? true : false;
    }
}
