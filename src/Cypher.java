public class Cypher {
    private String regexKey;
    private Integer[] offsets;

    public Cypher(String regexKey) {
        this.regexKey = regexKey;
    }

    public String getRegexKey() {
        return regexKey;
    }

    public void setRegexKey(String regexKey) {
        this.regexKey = regexKey;
    }

    public Integer[] getOffsets() {
        return offsets;
    }

    public void setOffsets(int length, int min, int max) {
        this.offsets = new Integer[length];
        for(int i = 0; i < this.offsets.length; i++) {
            this.offsets[i] = (int)(Math.random() * (max - min)) + min;
        }
    }

    public void setOffsets(Integer[] offsets) {
        this.offsets = offsets;
    }
}
