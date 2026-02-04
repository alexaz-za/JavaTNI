public class Brownie extends Bakery{
    private String topping;
    private int piece;

    Brownie(String topping, int piece,String flavor, double unitPrice){
        super(flavor,unitPrice);
        this.topping = topping;
        this.piece = piece;
    }
    String getTopping(){
        return this.topping;
    }
    boolean isLargeBox(){
        return this.piece > 4;
    }
    @Override
    double calculateTotalPrice(){
        return (this.piece*getUnitPrice()) +  super.getPackingCost();
    }
    public String toString(){
        return super.toString() + "\nBrownies " + getFlavor() + " (" + getTopping() + ") with " + (isLargeBox() ? "Large" : "Small") + " Box"
                + "\nTotal price of Brownie = " + calculateTotalPrice();
    }
}
