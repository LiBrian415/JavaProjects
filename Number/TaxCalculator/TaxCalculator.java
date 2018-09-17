public class TaxCalculator{
    public static void main(String[] args){
        double total = Double.parseDouble(args[0]);
        double tax = Double.parseDouble(args[1]);
        System.out.println(String.format("tax: %.02f, total: %.02f", total * (tax/100), total + total * (tax/100)));
    }
}
