package ru.netology;

import org.junit.jupiter.api.*;

import ru.netology.accounts.Account;
import ru.netology.accounts.SavingsAccount;

public class MainTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new SavingsAccount("Petya", 1000000, 500000);
    }

    @Test
    @DisplayName("Пополнение счета на 500000")
    void savingsAdd() {
        Assertions.assertTrue(account.add(500000));
    }

    @Test
    @DisplayName("Снятие 500000")
    void savingsPayFour() {
        Assertions.assertTrue(account.pay(500000));
    }

    @Test
    @DisplayName("Снятие 500001")
    void savingsPayFive() {
        Assertions.assertFalse(account.pay(500001));
    }
}