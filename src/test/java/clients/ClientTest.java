package clients;

import accounts.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    public void testAddAccount() {
        String name = "Peta";
        Client client = new Client(name,2);
        Account[] account = new Account[2];

        Assertions.assertArrayEquals(client.getAccounts(),account);

    }



}