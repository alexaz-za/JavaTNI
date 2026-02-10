package Customer;

public abstract class Customer {
    private String name;
    private double billAmount;

    Customer(String name,double billAmount){
        this.name = name;
        this.billAmount = billAmount;
    }

    double getBillAmount() {
        return this.billAmount;
    }

    abstract double calculateFinalBill();
    public String toString(){
        return "Customer: " + this.name +
                "\nBill amount: " + this.billAmount;
    }
}