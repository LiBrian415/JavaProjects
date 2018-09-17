import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal;

class Pi {
    final static BigDecimal PI = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");
	public static void main(String[] args){
        System.out.print("How many decimal places for PI? (Max 100):");
        Scanner scanner = new Scanner(System.in);
        boolean isntDigit = true;
        int digit = 0;
        while(isntDigit){
            try {
                digit = scanner.nextInt();
                isntDigit = false;
            } catch (Exception e) {
                System.out.println();
                System.out.print("Must enter a digit between 1 and 100:");
                scanner = new Scanner(System.in);
            }

            if(digit < 1 || digit > 100 && isntDigit == false){
                isntDigit = true;
                System.out.println();
                System.out.print("Must enter a digit between 1 and 100:");
                scanner = new Scanner(System.in);
            }
        }

        String format = "#.";
        for(int i = 0; i <= digit; i++){
            format = format + "0";
        }

        DecimalFormat formatter = new DecimalFormat(format);

        System.out.println();
        System.out.println("Pi to " + digit + " places is: " + formatter.format(PI));
    }
}
