public class BiggestRectangleEasy {

    public int findArea(int N) {
        if (N % 2 == 1) {
            N--;
        }
        int max = 0;
        for (int i = 1; i < N; i++) {
            int a = i;
            int b = (N - (i * 2)) / 2;
            max = Math.max(a * b, max);
        }
        return max;
    }
}
