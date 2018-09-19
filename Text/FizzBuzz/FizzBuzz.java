public class FizzBuzz{
    public static void main(String[] args){
        int three = 1; int five = 1;
        for(int i = 1; i <= 100; i++){
            if(three == 3 && five == 5){
                System.out.println("FizzBuzz");
                three = 1;
                five = 1;
            } else if(three == 3){
                System.out.println("Fizz");
                three = 1;
                five++;
            } else if(five == 5){
                System.out.println("Buzz");
                five = 1;
                three++;
            } else {
                System.out.println(i);
                three++;
                five++;
            }
        }
    }
}
