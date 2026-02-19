package Banking;

import java.io.*;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount{
    OpenNewAccount(String accId,double accBalance){
        super(accId,accBalance);
    }
    String recordAccount(){
        if (isExistingAccount(getAccId())) return "This account has been created!!";

        try {
            FileWriter filename = new FileWriter(getFilename(),true);
            PrintWriter writer = new PrintWriter(filename);
            writer.println(super.toString());
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return "Created account success!!";
    }
    private boolean isExistingAccount(String account_name){
        File filename = new File(getFilename());
        try {

            Scanner sc = new Scanner(filename);
            while (sc.hasNext()){
                String[] data = sc.nextLine().split(",");
                if (data[0].equals(account_name)){
                    sc.close();
                    return true;
                }
            }
            sc.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
}