package task3_5;
/**
 * task 3.5
 * @author Vlad Skrynyk
 */
public class Interval {
    private int left;
    private int right;
    private boolean includeLeft;
    private boolean includeRight;

    public Interval(int left, int right, boolean includeLeft, boolean includeRight) {
        this.left = left;
        this.right = right;
        this.includeLeft = includeLeft;
        this.includeRight = includeRight;
    }

    public boolean overlapsWith(Interval other) {
        if (this.includeLeft && other.includeRight) {
            if (this.right < other.left || this.left > other.right) {
                return false;
            }
        } else if (!this.includeLeft && !other.includeRight) {
            if (this.right <= other.left || this.left >= other.right) {
                return false;
            }
        } else {
            if (this.right < other.left || this.left > other.right) {
                return false;
            }
        }
        return true;
    }

    public Interval mergeWith(Interval other) {
        if (!this.overlapsWith(other)) {
            throw new IllegalArgumentException("Intervals do not overlap and cannot be merged.");
        }

        int mergedLeft = Math.min(this.left, other.left);
        int mergedRight = Math.max(this.right, other.right);
        boolean mergedIncludeLeft = (this.left < other.left) ? this.includeLeft : other.includeLeft;
        boolean mergedIncludeRight = (this.right > other.right) ? this.includeRight : other.includeRight;

        return new Interval(mergedLeft, mergedRight, mergedIncludeLeft, mergedIncludeRight);
    }

    public int getDistance() {
        return this.right - this.left;
    }

    public int getLeft() {
        return this.left;
    }
    public int getRight() {
        return this.right;
    }
    public String getIncludeLeft() {
        return (this.includeLeft) ? "[" : "(";
    }
    public String getIncludeRight() {
        return (this.includeRight) ? "]" : ")";
    }
}
