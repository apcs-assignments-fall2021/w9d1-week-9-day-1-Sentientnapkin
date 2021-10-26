public class BankAccount {
    // Instance variables
    public double balance;
    private final int accountNumber;
    private String preferredName;
    private double lastValue;
    private double[] withdrawals;
    private int count = 0;

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
        if(num<=balance){
            System.out.println("You have withdrawn $"+num+".");
            balance-=num;
        }
        else System.out.println("You have inputted an invalid number.");
    }
    public void deposit(double num){
        if(num<=balance){
            System.out.println("You deposited $"+num+".");
            balance+=num;
        }
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
    public void withdrawalHistory(){
        this.withdrawals[count]=this.balance-this.lastValue;
        count++;
        double temp = 0;
        if (count==6){
            count--;
            for(int i = 0;i<5;i++){
                this.withdrawals[count]=this.withdrawals[count+1];
            }
        }
        for(int i = 0;i<4;i++){
            if(this.withdrawals[i]!=0)
                System.out.println(this.withdrawals[i]+"; ");
        }
        if(this.withdrawals[4]!=0)
            System.out.println(withdrawals[4]);
    }
}