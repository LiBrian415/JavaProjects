import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PrimeFactorization{
    
    private static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    private static int getNext(int prime, int n){
        if(isPrime(n)){
            return n;
        }
        while(!isPrime(++prime) && prime < n){
        }
        return prime;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = scanner.nextInt();
        System.out.println(n);
        List<Integer> list = new ArrayList<>();
        int prime = 2;
        while(n > 1){
            while(n % prime == 0){
                n /= prime;
                list.add(prime);
            }
            prime = getNext(prime, n);
        }
        for(int i : list){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
