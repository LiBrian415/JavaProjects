public class CollatzConjecture{
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Input a starting number.");
            return;
        } else {
            int n = Integer.parseInt(args[0]);
            int count = 0;
            while(n != 1){
                if(n % 2 == 0){
                    n /= 2;
                } else {
                    n *= 3;
                    n += 1;
                }
                count++;
            }
            System.out.println("Number of moves: " + count);
        }
    }
}
