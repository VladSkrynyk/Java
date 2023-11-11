package task5_1;

public class Text {
    private String header;
    private Sentence[] text;

    public Text() {
        header = "";
        text = null;
    }

    public void appendText(String t) {
        setText(this.getText() + t);
    }

    public Text(String title, String text) {
        setHeader(title);
        setText(text);
    }

    public String getHeader() {
        return this.header;
    }

    public void setHeader(String s) {
        this.header = s;
    }
    public String getText() {
        String res =  this.header;
        for (Sentence w:text) {
            res += w.toString();
        }
        return res;
    }

    public void setText(String text) {
        int k = 0;
        for (String s:text.split("[\b\n.!?]")) {
            this.text[k++] = new Sentence(s);
        }
    }

    public int length() {
        return text.length;
    }
    @Override
    public String toString() {
        String res =  this.header;
        for (Sentence w:text) {
            res += w.toString();
        }
        return res;
    }
    @Override
    public int hashCode() {
        int  m = 0;
        for (Sentence w:text) {
            m += w.hashCode();
        }
        return m;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Text)) {
            return false;
        }
        Text another = (Text) other;

        if (another.header != this.header) {
            return false;
        }

        if (this.length() != another.length()) {
            return false;
        }
        for (int i = 0; i < text.length; i++) {
            if (!text[i].equals(another.text[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {

    }
}
