package task5_1;

public class Word {
    final private String word;

    Word() {
        this.word = "";
    }

    Word(String word) {
        this.word = word;
    }
    @Override
    public String toString() {
        return word;
    }
    @Override
    public int hashCode() {
        int  m = 0;
        for (int i = 0; i < word.length(); i++) {
            m *= 31;
            m += (int)word.charAt(i);
        }
        return m;
    }

    @Override
    public boolean equals(Object other) {
        return other.hashCode() == this.hashCode();
    }

    public static void main(String args[]) {

    }
}
