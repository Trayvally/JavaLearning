package Work.Work3_28.Work7_3_28;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double x){
        if (balance>=x){
            balance=balance-x;
            System.out.println("成功取款"+x+"元");
        }else {
            System.out.println("余额不足，取款失败");
        }

    }

    public void deposit(double x){
        if (x<0){
            System.out.println("存款错误");
        }else {
            balance=balance+x;
            System.out.println("成功存款"+x+"元");
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                '}';
    }
}
