public class CoinFlip{
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Input the number of flips");
        } else {
            int num = Integer.parseInt(args[0]);
            int[] arr = new int[2];
            for(int i = 0; i < num; i++){
                double r = Math.random();
                if(r < 0.5){
                    arr[0]++;
                } else {
                    arr[1]++;
                }
            }
            System.out.println("heads: "+arr[0]);
            System.out.println("tails: "+arr[1]);
        }
    }
}
