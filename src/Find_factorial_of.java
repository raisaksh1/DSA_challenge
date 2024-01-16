import java.math.BigInteger;
import java.util.Scanner;
public class Find_factorial_of {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  num = sc.nextInt();
        BigInteger fact = BigInteger.ONE;
        long i ;
        for( i=2; i<=num; i++)
        {
            fact = fact.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(fact);
    }
}
