
public class TileCost{
    public static void main(String[] args){
        int costPerTile = 0;
        int floorWidth = 0;
        int floorLength = 0;
        int tileWidth = 1;
        int tileLength = 1;
        if(args.length == 3){
            System.out.println("Assuming 1x1 tiles");
            costPerTile = Integer.parseInt(args[0]);
            floorWidth = Integer.parseInt(args[1]);
            floorLength = Integer.parseInt(args[2]);
        } else if(args.length == 5){
            costPerTile = Integer.parseInt(args[0]);
            floorWidth = Integer.parseInt(args[1]);
            floorLength = Integer.parseInt(args[2]);
            tileWidth = Integer.parseInt(args[3]);
            tileLength = Integer.parseInt(args[4]);
        } else {
            System.out.println("Incorrect inputs.");
            return;
        }
        int w = (int)Math.ceil(floorWidth/ tileWidth);
        int l = (int)Math.ceil(floorLength/ tileLength);
        System.out.println(w*l*costPerTile);
    }
}
