import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class PigLatin{
    private static Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

    public static String convertToPigLatin(String s){
        StringBuilder b = new StringBuilder();
        int i = 0;
        while(i < s.length() && !vowels.contains(Character.toLowerCase(s.charAt(i)))){
            i++;
        }
        if(i == 0){
            b.append(s);
            b.append("ay");
        } else {
            b.append(s.substring(i));
            b.append(s.substring(0, i));
            b.append("ay");
        }
        return b.toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Input string: ");
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = convertToPigLatin(arr[i]);
        }
        System.out.println(String.join(" ", arr));
    }
}
