package qualification.speakingInTongues;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    static Map<String, String> map = new HashMap<String, String>();

    static final String FILE_OUTPUT_NAME = "/src/main/resources/qualification/speakingInTongues/A-small-practice.out";

    static final String FILE_INPUT_NAME = "/src/main/resources/qualification/speakingInTongues/A-small-practice.in";

    static FileWriter fw;

    static BufferedWriter output;

    public static void main(String[] args) throws IOException {

        initMapping();
        fw = new FileWriter(FILE_OUTPUT_NAME, false);
        output = new BufferedWriter(fw);
        scanner = new Scanner(new File(FILE_INPUT_NAME));
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            String resultLine = "Case #" + i + ": " + solve() + "\n";
            output.write(resultLine);
            System.out.print(resultLine);
        }

        output.flush();
        output.close();
    }

    private static void initMapping() {
        map.put(" ", " ");
        map.put("y", "a");
        map.put("n", "b");
        map.put("f", "c");
        map.put("i", "d");
        map.put("c", "e");
        map.put("w", "f");
        map.put("l", "g");
        map.put("b", "h");
        map.put("k", "i");
        map.put("u", "j");
        map.put("o", "k");
        map.put("m", "l");
        map.put("x", "m");
        map.put("s", "n");
        map.put("e", "o");
        map.put("v", "p");
        map.put("z", "q");
        map.put("p", "r");
        map.put("d", "s");
        map.put("r", "t");
        map.put("j", "u");
        map.put("g", "v");
        map.put("t", "w");
        map.put("h", "x");
        map.put("a", "y");
        map.put("q", "z");
    }

    private static String solve() {
        String line = scanner.nextLine();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < line.length(); i++) {
            String key = Character.toString(line.charAt(i));
            result.append(map.get(key));
        }
        return result.toString();
    }
}
