public interface Encoder {
    <E extends Cypher> String encode(String rawText, E cypher);
}
