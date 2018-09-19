import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountVowel{
    public static void main(String[] args){
        Map<Character, Integer> vowels = new HashMap<>();
        vowels.put('a', 0);
        vowels.put('e', 0);
        vowels.put('i', 0);
        vowels.put('o', 0);
        vowels.put('u', 0);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = scanner.nextLine();
        for(int i = 0; i < s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(vowels.containsKey(c)){
                vowels.put(c, vowels.get(c)+1);
            }
        }
        for(char k: vowels.keySet()){
            System.out.println(k+": "+vowels.get(k));
        }
    }
}
