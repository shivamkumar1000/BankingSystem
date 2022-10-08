import java.util.Scanner;

public class Bank {
    private String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);
    //method to open new account
    public void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Account type: ");
        acc_type = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }
    //method to display account details
    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }
    //method to deposit money
    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
    }
    //method to withdraw money
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }
    //method to search an account number
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }

}
class SBI extends Bank{
    float interest;
    public SBI(float interestrrate){
        this.interest = interestrrate;
    }
    public void getDetails(){
        System.out.println(this.interest);
    }
}
class BOI extends Bank{
    float interest;
    public BOI(float interestrrate){
        this.interest = interestrrate;
    }
    public void getDetails(){
        System.out.println(this.interest);
    }
}
class ICICI extends Bank{
    float interest;
    public ICICI(float interestrrate){
        this.interest = interestrrate;
    }
    public void getDetails(){
        System.out.println(this.interest);
    }
}
