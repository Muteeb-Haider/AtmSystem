/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mianm
 */
public class CentralOffice {
    public BankAccount verifyAccount(BankCard card) {
        return card.getAccount();
    }

    public boolean processTransaction(BankAccount account, double amount) {
        return account.withdraw(amount);
    }
}