/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mianm
 */
public class ATM {
    private String id;
    private CentralOffice centralOffice;

    public ATM(String id, CentralOffice centralOffice) {
        this.id = id;
        this.centralOffice = centralOffice;
    }

    public boolean verifyPIN(BankCard card, String pin) {
        return card.verifyPIN(pin);
    }

    public double requestBalance(BankCard card) {
        BankAccount account = centralOffice.verifyAccount(card);
        return account.getBalance();
    }

    public boolean dispenseCash(BankCard card, double amount) {
        BankAccount account = centralOffice.verifyAccount(card);
        boolean success = centralOffice.processTransaction(account, amount);
        if (success) {
            System.out.println("Dispensing $" + amount);
        }
        return success;
    }

    public void sendTransactionReport(BankCard card, double amount) {
        System.out.println("Transaction report sent for card: " + card.getCardNumber() + ", amount: $" + amount);
    }
}
