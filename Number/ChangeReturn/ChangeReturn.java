import java.util.Scanner;

public class ChangeReturn{

    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("Invalid inputs.");
            return;
        } else {
            double total = Double.parseDouble(args[0]);
            double given = Double.parseDouble(args[1]);
            if(given < total){
                System.out.println("Given amount is less than total cost.");
            } else {
                int difference = (int)((given - total)*100);
                System.out.println(difference);
                int[] arr = new int[5];
                for(int i = 0; i < 5; i++){
                    switch (i) {
                        case 0:
                            arr[i] += difference/100;
                            difference -= 100 * (difference/100);
                            System.out.print(arr[i] + " dollars, ");
                            break;
                        case 1:
                            arr[i] += difference/25;
                            difference -= 25 * (difference/25);
                            System.out.print(arr[i] + " quarters, ");
                            break;
                        case 2:
                            arr[i] += difference/10;
                            difference -= 10 * (difference/10);
                            System.out.print(arr[i] + " dimes, ");
                            break;
                        case 3:
                            arr[i] += difference/5;
                            difference -= 5 * (difference/5);
                            System.out.print(arr[i] + " nickels, ");
                            break;
                        case 4:
                            arr[i] += difference;
                            System.out.print(arr[i] + " pennies");
                            break;
                    }
                }
                System.out.println();
            }
        }
    }

}
