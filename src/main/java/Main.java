import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import clients.Client;

public class Main {
    public static void main(String[] args) {
        Client account = new Client("Bob",4);
        System.out.println(account.pay(22));
        CheckingAccount account1 = new CheckingAccount("Tom", 10000);
        System.out.println(account1.pay(500));
        System.out.println(account1.pay(200));
        account1.accept(222);
    }
}
