package task1_24;
/**
 * task 1_24
 * @author Vlad Skrynyk
 */
public class task1_24 {
    int maxScore = 0;
    int W = 12;
    int n = 5;
    int[] a = {1, 2, 3, 4, 5};
    public int maxScore(int weight, int score, int num) {
        if (weight == this.W || num >= this.n) {
            if (score > this.maxScore && score <= this.W)
                this.maxScore = score;
            return 0;
        }

        this.maxScore(weight, score, num + 1);
        this.maxScore(weight + 1, score + this.a[num], num + 1);
        return 0;
    }

    public void run() {
        this.maxScore(0, 0, 0);
        System.out.println(maxScore);

    }
    public static void main(String[] args)
    {
        task1_24 p = new task1_24();
        p.run();
    }
}
