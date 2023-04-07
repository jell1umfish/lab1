import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] N = new int[n];
        for(int i = 0; i<n; i++){
            N[i]=sc.nextInt();
        }
        FindMinimum a = new FindMinimum(n, N);
        a.FindMin(n,N);
        int m = sc.nextInt();
        int[] M = new int[m];
        for(int i = 0; i<m; i++){
            M[i]=sc.nextInt();
        }
        FindAverage b = new FindAverage(m, M);
        b.FindAVG();
        int number = sc.nextInt();
        FindIsPrime c = new FindIsPrime(number);
        if(c.isPrime()){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
        int h = sc.nextInt();
        Factorial d = new Factorial();
        System.out.println(d.fact(h));
        int pb5 = sc.nextInt();
        Fibonacci p5 = new Fibonacci();
        p5.Fibonacci(pb5);
        int degree = sc.nextInt();
        int numb = sc.nextInt();
        Power pr6 = new Power();
        System.out.println(pr6.problem6(degree,numb));
    }
}