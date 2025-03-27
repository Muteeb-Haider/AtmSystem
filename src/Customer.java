/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mianm
 */
public class Customer {
    private String name;
    private BankCard card;

    public Customer(String name, BankCard card) {
        this.name = name;
        this.card = card;
    }

    public void insertCard(BankCard card) {
        this.card = card;
    }

    public boolean enterPIN(String pin) {
        return card.verifyPIN(pin);
    }

    public void requestWithdrawal(double amount) {
        System.out.println(name + " requested withdrawal of $" + amount);
    }

    public String getName() {
        return name;
    }
}
