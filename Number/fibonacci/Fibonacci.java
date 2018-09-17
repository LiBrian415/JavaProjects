import java.util.Scanner;

public class Fibonacci{

        public static void main(String[] args){
            System.out.print("Input ceiling number for fibonacci sequence: ");
            Scanner input = new Scanner(System.in);
            int a = 0; int b = 1;
            int ceil = 0;
            boolean isntInt = true;
            while(isntInt){
                try{
                    ceil = input.nextInt();
                    isntInt = false;
                } catch (Exception e) {
                    System.out.println();
                    System.out.print("Input must be an Integer.");
                    input = new Scanner(System.in);
                }
            }
            while(a <= ceil){
                System.out.print(a);
                int p = a;
                a = b; b = a + p;
                if(a <= ceil){
                    System.out.print(", ");
                }
                System.out.println();
            }
        }

}
