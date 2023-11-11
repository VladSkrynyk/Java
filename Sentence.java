package task5_1;

public class Sentence {
    private Word[] words;
    public int length() {
        return words.length;
    }

    Sentence() {
        words = null;
    }

    Sentence(Word[] w) {
        words = w;
    }

    Sentence(String w) {
        int k = 0;
        for (String t:w.split("\s")) {
            words[k++] = new Word(t);
        }
    }

    @Override
    public String toString() {
        String res =  "";
        for (Word w:words) {
            res += w.toString();
        }
        return res;
    }
    @Override
    public int hashCode() {
        int  m = 0;
        for (Word w:words) {
            m += w.hashCode();
        }
        return m;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Sentence)) {
            return false;
        }
        Sentence another = (Sentence) other;
        if (this.length() != another.length()) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(another.words[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {

    }
}
