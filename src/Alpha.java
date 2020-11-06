import java.util.Arrays;

public class Alpha implements Decoder, Encoder {
    @Override
    public <E extends Cypher> String encode(String rawText, E cypher) {
        rawText = rawText.toLowerCase();
        String cypherText = "";
        String regexKey = cypher.getRegexKey();

        int rawLength = rawText.length();
        cypher.setOffsets(rawLength, -10, 10);
        Integer[] offsets = cypher.getOffsets();

        int regexLength = regexKey.length();
        int rC = 0;

        for(int i = 0; i < rawLength; i++) {
            int position = ((rawText.charAt(i) - 'a') + (regexKey.charAt(rC++) - 'a') - offsets[i]) % 26;
            cypherText += (char) ('a' + position);
            rC = rC % regexLength;
        }
        return cypherText;
    }

    @Override
    public <E extends Cypher> String decode(String cypherText, E cypher) {
        cypherText = cypherText.toLowerCase();
        String rawText = "";
        String regexKey = cypher.getRegexKey();

        int cypherLength = cypherText.length();
        Integer[] offsets = cypher.getOffsets();

        int regexLength = regexKey.length();
        int rC = 0;

        for(int i = 0; i < cypherLength; i++) {
            int position = (26 + (cypherText.charAt(i) - 'a') - (regexKey.charAt(rC++) - 'a') + offsets[i]) % 26;
            rawText += (char) ('a' + position);
            rC = rC % regexLength;
        }
        return rawText;
    }
}
