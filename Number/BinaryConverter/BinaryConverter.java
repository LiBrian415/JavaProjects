public class BinaryConverter{
    public static void main(String[] args){
        if(args.length == 2){
            String n = args[0];
            int isBinary = Integer.parseInt(args[1]);
            if(isBinary == 1){
                System.out.println(Integer.parseInt(n, 2));
            } else {
                System.out.println(Integer.toBinaryString(Integer.parseInt(n)));
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
