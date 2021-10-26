public class BankAccount {
    // Instance variables
    public double balance;
    private final int accountNumber;
    private String preferredName;
    private double lastValue;
    private double[] withdrawals;
    private int count = -1;

    public BankAccount(String preferredName){
        this.balance = 2.50;
        this.accountNumber=generateAccountNumber();
        this.lastValue=this.balance;
        this.withdrawals=new double[6];
        this.preferredName = preferredName;
    }
    public int generateAccountNumber(){
        int num;
        int accountNumber = 0;
        for(int i = 1;i<=80;i+=10){
            num=(int)(Math.random()*9+1);
            num*=i;
            accountNumber+=num;
        }
        return accountNumber;
    }
    public void withdraw(double num){
        if(num<=this.balance){
            System.out.println("You have withdrawn $"+num+".");
            this.lastValue=this.balance;
            this.balance-=num;
            withdrawalHistory();
        }
        else System.out.println("You have inputted an invalid number.");
    }
    public void deposit(double num){
            System.out.println("You deposited $"+num+".");
            this.lastValue=this.balance;
            this.balance+=num;
            withdrawalHistory();
    }
    public double getBalance(){
        return this.balance;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getPreferredName(){
        return this.preferredName;
    }
    public void setPreferredName(String change){
       this.preferredName=change;
    }
    @Override
    public String toString(){
        return "Owner:"+this.preferredName+"; Balance:"+this.balance+"; Account Number:"+this.accountNumber;
    }
    private void withdrawalHistory(){
        count++;
        this.withdrawals[count]=this.balance-this.lastValue;
        if (count==6){
            count--;
            for(int i = 0;i<5;i++){
                this.withdrawals[count]=this.withdrawals[count+1];
            }
        }
    }
    public void printWithdrawalHistory(){
        for(int i = 0;i<4;i++){
            if(this.withdrawals[i]!=0)
                System.out.println(this.withdrawals[i]+"  ");
        }
        if(this.withdrawals[4]!=0)
            System.out.println(withdrawals[4]);
    }
}