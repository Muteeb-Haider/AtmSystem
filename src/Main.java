/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mianm
 */
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.00);
        BankCard card = new BankCard("1111222233334444", "1234", account);
        Customer customer = new Customer("John Doe", card);
        CentralOffice centralOffice = new CentralOffice();
        ATM atm = new ATM("ATM001", centralOffice);

        customer.insertCard(card);
        boolean pinVerified = customer.enterPIN("1234");
        
        if (pinVerified) {
            double balance = atm.requestBalance(card);
            System.out.println("Current balance: $" + balance);
            
            customer.requestWithdrawal(200.00);
            boolean success = atm.dispenseCash(card, 200.00);
            
            if (success) {
                atm.sendTransactionReport(card, 200.00);
                System.out.println("New balance: $" + atm.requestBalance(card));
            }
        }
    }
}