public interface Decoder {
    <E extends Cypher> String decode(String cypherText, E cypher);
}
