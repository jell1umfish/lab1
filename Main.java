import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        for(int i = 0; i<n; i++){
            N[i]=sc.nextInt();
        }
        Problem1 a = new Problem1(n, N);
        a.Problem_1(n,N);
        int m = sc.nextInt();
        int[] M = new int[m];
        for(int i = 0; i<m; i++){
            M[i]=sc.nextInt();
        }
        Problem2 b = new Problem2(m, M);
        b.Problem_2();
        int number = sc.nextInt();
        Problem3 c = new Problem3(number);
        if(c.isPrime()){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
        int h = sc.nextInt();
        Problem4 d = new Problem4();
        System.out.println(d.fact(h));
        int pb5 = sc.nextInt();
        Problem5 p5 = new Problem5();
        p5.Fibonacci(pb5);
    }
}