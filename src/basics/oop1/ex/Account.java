package basics.oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        this.balance += amount;
    }

    void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}
