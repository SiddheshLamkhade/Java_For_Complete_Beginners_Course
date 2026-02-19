package Week_3_Assignment1_Solutions.Problem3;

class BankAccount {
    int balance = 1000;

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    int getBalance() {
        return balance;
    }
}

