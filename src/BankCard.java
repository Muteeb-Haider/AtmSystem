/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mianm
 */
import java.util.Date;

public class BankCard {
    private String cardNumber;
    private String pin;
    private Date expiryDate;
    private BankAccount account;

    public BankCard(String cardNumber, String pin, BankAccount account) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.expiryDate = new Date(System.currentTimeMillis() + (365L * 24 * 60 * 60 * 1000));
        this.account = account;
    }

    public boolean verifyPIN(String enteredPIN) {
        return pin.equals(enteredPIN);
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}