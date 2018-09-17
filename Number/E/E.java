import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class E{
    final static BigDecimal E = new BigDecimal("2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274");

    public static void main(String[] args){
        System.out.print("Input number of digits of e. (Max 100): ");
        Scanner scanner = new Scanner(System.in);
        boolean isntDigit = true;
        int d = 0;

        while(isntDigit){
            try{
                d = scanner.nextInt();
                isntDigit = false;
            } catch (Exception e) {
                System.out.println();
                System.out.print("Input must be an Integer between 1 and 100.");
                scanner = new Scanner(System.in);
            }

            if(d < 1 || d > 100 && isntDigit == false){
                System.out.println();
                System.out.print("Input must be an Integer between 1 and 100.");
                isntDigit = true;
                scanner = new Scanner(System.in);
            }
        }
        scanner.close();
        String format = "#.";

        for(int i = 0; i <= d; i++){
            format = format + 0;
        }

        DecimalFormat formatter = new DecimalFormat(format);

        System.out.println("e to " + d + " places is " + formatter.format(E));
    }
}
