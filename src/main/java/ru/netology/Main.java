package ru.netology;

import ru.netology.accounts.*;

public class Main {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount("Petya", 1000000, 500000);
        CheckingAccount account2 = new CheckingAccount("Vasiliy", 2000000);
        CreditAccount account3 = new CreditAccount("Ildar", -1500000);
        System.out.println("\nДанные по накопительному счету:");
        print(account1);
        System.out.println("\nДанные по расчетному счету:");
        print(account2);
        System.out.println("\nДанные по кредитному счету:");
        print(account3);
    }

    public static void print(Account account) {
        System.out.println(account);

        System.out.print("Попытка пополнения счета на 1500000");
        System.out.println(account.add(1500000) ? " - ок" : " - неудача");

        System.out.print("Попытка оплаты 2500000");
        System.out.println(account.pay(2500000) ? " - ок" : " - неудача");

        System.out.print("Попытка оплаты 2000000");
        System.out.println(account.pay(2500000) ? " - ок" : " - неудача");
    }
}


