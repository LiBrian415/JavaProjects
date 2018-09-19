public class CheckPalindrome{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("No input found.");
            return;
        } else if(args.length == 1){
            String s = args[0];
            for(int i = 0; i < s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length()-1-i)){
                    System.out.println(s+" is not a palindrome.");
                    return;
                }
            }
            System.out.println(s+" is a palindrome.");
        }
    }
}
