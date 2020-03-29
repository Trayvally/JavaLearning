package Work.Work3_28.Work7_3_28;

public class Customer extends Account {
    private String firstName;
    private String lastName;
    private Account account=new Account();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void display() {
        System.out.println("Customer [" + lastName +
                ',' + firstName + ']' +
                " has a account: id is " + getId() +
                ", annualInterestRate is " + getAnnualInterestRate() +
                ", balance is "+getBalance());

    }
}
