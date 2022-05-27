public class task3 {


    public static void main(String[] args) {
        Account Client1 = new Account("Jack","0000 2345 2687 3498 4235",1500);
        Account Client2 = new Account("Bernardo","0000 1234 5678 9187",4500);
        try{
            Client2.Transfer(10000);
        }
        catch(NotEnoughMoneyException ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("Amount left on your Bank is "+Client2.balance);
        }

    }
}

class Account{
    String Owner,No_Account;
    int balance;

    public void Transfer(int amount) throws NotEnoughMoneyException{
        if(balance>amount){
            balance-=amount;
        }
        else{
            throw new NotEnoughMoneyException("There is no enough money in your account");
        }
    }
    public Account(String owner,String Acc_No,int balance){
        this.Owner=owner;
        this.No_Account=Acc_No;
        this.balance=balance;
    }

    public String getOwner() {return Owner;}
    public String getNo_Account() {return No_Account;}
    public int getbalance() {return balance;}

    public void setOwner(String L) {this.Owner = L;}
    public void setNo_Account(String L) {this.No_Account = L;}
    public void setbalance(int L) {this.balance = L;}
}
