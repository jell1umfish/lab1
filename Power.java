public class Power {
    public int problem6(int a, int n){
        if (n == 1){
            return a;
        }
        else{
            return a*problem6(a, n-1);
        }
    }
}
