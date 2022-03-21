public class Exercicio1 {

    public static void main (String args[]){

        System.out.println(fibonacci_rec(4));
        System.out.println(fibonacci_rec(8));
        System.out.println(fibonacci_rec(16));
        System.out.println(fibonacci_rec(32));
    }

    public static int fibonacci_rec(int n){
        int a;
        int b;

        if (n<=1) {
            return n;
        } else {
            a = fibonacci_rec(n-1);
            b = fibonacci_rec(n-2);
            return a + b;
        }
    }
}