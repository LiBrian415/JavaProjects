import java.util.HashSet;
import java.util.Set;

public class Eratosthenes{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        int n = Integer.parseInt(args[0]);
        for(int i = 2; i <= n; i++){
            if(!set.contains(i)){
                System.out.print(i + " ");
                int t = i;
                while(t <= n){
                    t += i;
                    set.add(t);
                }
            }
        }
        System.out.println();
    }
}
