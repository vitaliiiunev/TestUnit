package accounts;

public class SavingsAccount extends Account {
    protected int minBalance;

    public SavingsAccount(String name, long balance, int minBalance) {
        super(name, balance);
        this.minBalance = minBalance;
    }

    @Override
    public boolean add(long amount) {

        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if(balance - amount >= minBalance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    public static interface MoneyTarget {
        boolean accept(int money);
    }
}
