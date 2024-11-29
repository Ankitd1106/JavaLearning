package javaConcepts;

public class Encapsulation {
    public class BankAccount {
        // Private fields - data hiding
        private String accountHolderName;
        private double balance;

        // Constructor to initialize the account
        public BankAccount(String accountHolderName, double initialBalance) {
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }

        // Public getter for account holder's name
        public String getAccountHolderName() {
            return accountHolderName;
        }

        // Public getter for balance
        public double getBalance() {
            return balance;
        }

        // Public method to deposit money - controlled access
        public void deposit(double amount) {
            if (amount > 0) {
                balance = balance + amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Public method to withdraw money - controlled access
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient balance.");
            }
        }
    }


    public void main(String[] args) {
        // Creating a bank account object
        BankAccount account = new BankAccount("Ankit Das", 5000);

        // Accessing account details using getters
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        // Performing operations using public methods
        account.deposit(1500);
        System.out.println("Updated Balance: " + account.getBalance());

        account.withdraw(2000);
        System.out.println("Final Balance: " + account.getBalance());
    }


}
