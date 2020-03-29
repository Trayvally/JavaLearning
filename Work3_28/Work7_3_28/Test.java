package Work.Work3_28.Work7_3_28;

public class Test {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setFirstName("Jane");
        customer.setLastName("Smith");

        customer.setId(1000);
        customer.setBalance(2000);
        customer.setAnnualInterestRate(0.014);

        customer.deposit(100);
        customer.withdraw(960);
        customer.withdraw(2000);
        customer.display();
    }
}
