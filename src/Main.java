import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        alphaDriver();
    }

    public static void alphaDriver() {
        Alpha alpha = new Alpha();
        Scanner sc = new Scanner(System.in);

        ///*
        String rawText = sc.nextLine();
        String regexKey = sc.nextLine();

        Cypher cypher = new Cypher(regexKey);
        String encoded = alpha.encode(rawText, cypher);

        System.out.println(encoded);
        System.out.println(Arrays.toString(cypher.getOffsets()));
        //*/

        /*
        String cypherText = sc.nextLine();
        String regexKey = sc.nextLine();

        String[] strings = sc.nextLine().split(" ");
        Integer[] offsets = new Integer[strings.length];
        int i = 0;
        for(String s : strings) {
            offsets[i++] = Integer.parseInt(s);
        }

        Cypher cypher = new Cypher(regexKey);
        cypher.setOffsets(offsets);
        String decoded = alpha.decode(cypherText, cypher);

        System.out.println(decoded);
        //*/

        sc.close();
    }
}
