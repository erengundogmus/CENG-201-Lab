/**
 * BankDemo.java
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        19.11.2026
 */
public class BankDemo {

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.arrive("Ali");
        bank.arrive("Ayse");
        bank.arrive("Mehmet");
        bank.arrive("Zeynep");
        bank.arrive("Can");

        bank.displayStatus();

        bank.completeTransaction(2);
        bank.displayStatus();

        bank.completeTransaction(1);
        bank.displayStatus();
    }
}
