import static java.lang.Math.min;
public class Problem1 {
    private int n;
    private int[] N;
    public Problem1(int n, int[] n1) {
        this.n = n;
    }
    public void Problem_1(int n, int[] n1){
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (n1[j] > n1[j+1])
                {
                    int temp = n1[j];
                    n1[j] = n1[j+1];
                    n1[j+1] = temp;
                }
        System.out.println("Problem 1 solution: "+ n1[0]);
    }

}
