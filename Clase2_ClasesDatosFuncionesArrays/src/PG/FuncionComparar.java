package PG;

public class FuncionComparar {
    public static void main(String[] args) {
        System.out.println(esDivisible(2, 4));
    }
    public static boolean esDivisible(int n,int divisor) {
        return n % divisor == 0;
    }
}


