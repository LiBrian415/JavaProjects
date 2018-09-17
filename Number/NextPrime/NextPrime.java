import java.util.Scanner;

public class NextPrime{
    
    private static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    private static int getNext(int curr){
        while(!isPrime(++curr)){
        }
        return curr;
    }

    public static void main(String[] args){
        
        int prime = 2;
        Scanner scanner = null;
        try{
            char res = ' ';
            scanner = new Scanner(System.in);
            do{
            System.out.print("Do you want the next prime? (y/n): ");
            res = scanner.next().charAt(0);
            if(Character.toLowerCase(res) != 'y'){
                System.out.println("Closing program.");
            } else {
                System.out.println(prime);
                prime = getNext(prime);
            }
            }while(Character.toLowerCase(res) == 'y');
        } catch (Exception e) {
            System.out.println("Invalid input. Closing program.");
        } finally {
            scanner.close();
        }

    }

}
