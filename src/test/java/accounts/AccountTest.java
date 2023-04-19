package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void addToAccountAmount() {
        String name = "Mixa";
        long balance = 5000;
        Account account = new Account(name, balance) {
            @Override
            public boolean pay(long amount) {
                return false;
            }

            @Override
            public boolean add(long amount) {
                return false;
            }
        };

        Assertions.assertFalse(account.add(5));
    }

    @Test
    public void addAcept() {
        String name = "Mixa";
        long balance = 5000;
        Account account = new Account(name, balance) {
            @Override
            public boolean pay(long amount) {
                return false;
            }

            @Override
            public boolean add(long amount) {
                return false;
            }
        };

        Assertions.assertFalse(account.accept(3));
    }


}