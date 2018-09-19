import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CountWords{
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        Scanner input = null;
        try{
            input = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(input.hasNext()){
                String next = input.next().toLowerCase();
                if(!Character.isLetter(next.charAt(next.length()-1))){
                    next = next.substring(0, next.length()-1);
                }
                map.put(next, map.getOrDefault(next, 0)+1);
            }
        } catch (IOException e){
            System.out.println("No File Found");
        }finally {
            if(input != null){
                input.close();
            }
        }
        for(String k: map.keySet()){
            System.out.println(k+": "+map.get(k));
        }
    }
}
