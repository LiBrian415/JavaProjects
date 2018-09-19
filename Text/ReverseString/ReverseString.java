import java.util.Scanner;

public class ReverseString{
    public static void reverse(char[] arr){
        int l = 0; int r = arr.length-1;
        while(l < r){
            char t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = scanner.nextLine();
        char[] arr = s.toCharArray();
        reverse(arr);
        System.out.println("Reversed string: " + new String(arr));
    }
}
