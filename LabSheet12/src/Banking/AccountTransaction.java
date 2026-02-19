package Banking;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AccountTransaction extends BankAccount implements Transactionable{
    AccountTransaction(String accId){
        super(accId);
    }
    boolean hasAccount(){
        try{
            File filename = new File(getFilename());
            Scanner sc = new Scanner(filename);
            while (sc.hasNext()){
                String[] data = sc.nextLine().split(",");
                if (data[0].equals(getAccId())){
                    setAccBalance(Double.parseDouble(data[1]));
                    sc.close();
                    return true;
                }
            }
            sc.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void deposit(double amount) {
        setAccBalance(getAccBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getAccBalance() >= amount) setAccBalance(getAccBalance() - amount);
    }

    @Override
    public double checkBalance() {
        return getAccBalance();
    }
}