public class CupCake extends Bakery{
    private int piece;

    CupCake(int piece,String flavor,double unitPrice){
        super(flavor,unitPrice);
        this.piece = piece;
    }
    boolean isPackingBox(){
        return this.piece >= 6;
    }
    int getBoxNumber(){
        return isPackingBox() ? this.piece / 6 : 0;
    }
    int getBagNumber(){
        return this.piece % 6;
    }
    @Override
    int getPackingCost() {
        return isPackingBox() ? getBoxNumber() * super.getPackingCost() : 0 ;
    }
    @Override
    double calculateTotalPrice() {
        return (this.piece * getUnitPrice()) + getPackingCost() + (getBagNumber() * 0.5);
    }
    public String toString(){
        return super.toString() + "\nCup cake (" + getFlavor() + ") with " + (isPackingBox()?getBoxNumber()+" Box " + getBagNumber()+ " Bag": getBagNumber()+ " Bag")
                + "\nTotal price of Cup Cake = " + calculateTotalPrice();
    }
}
