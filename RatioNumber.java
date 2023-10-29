package ratio;

/**
 * task 3.1
 * @author Vlad Skrynyk
 */
public class RatioNumber {
    private int m;
    private int n;

    public RatioNumber(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public RatioNumber plus(RatioNumber that) {
        if (this.n == that.n) {
            return new RatioNumber(this.m + that.m, this.n);
        }
        else {
            int m = this.m * that.n + that.m * this.n;
            int n = this.n * that.n;
            return new RatioNumber(m, n);
        }
    }

    public RatioNumber minus(RatioNumber that) {
        if (this.n == that.n) {
            return new RatioNumber(this.m - that.m, this.n);
        }
        else {
            int m = this.m * that.n - that.m * this.n;
            int n = this.n * that.n;
            return new RatioNumber(m, n);
        }
    }

    public RatioNumber times(RatioNumber that) {
        int m = this.m * that.m;
        int n = this.n * that.n;
        return new RatioNumber(m, n);
    }

    public RatioNumber div(RatioNumber that) {
        int m = this.n * that.m;
        int n = this.m * that.n;
        return new RatioNumber(m, n);
    }

    @Override
    public String toString() {
        return String.format("%d / %d", m, n);
    }
}
