public class Problem4 {
    public int fact(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
        output = fact(n-1)* n;
        return output;
    }
}
