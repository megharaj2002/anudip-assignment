class Bank {
    double amount;

    Bank(double amount) {
        this.amount = amount;
    }

    void withdraw(double withdrawAmount) {
        String message = (withdrawAmount <= amount)
                ? "Withdraw successful"
                : "Insufficient balance";

        System.out.println(message);

        if (withdrawAmount <= amount) {
            amount = amount - withdrawAmount;
        }
    }

    void deposit(double depositAmount) {
        amount = amount + depositAmount;
        System.out.println("After deposit, available balance: " + amount);
    }

    public static void main(String[] args) {

        Bank b = new Bank(10000);

        System.out.println("Initial balance: " + b.amount);

        b.withdraw(5000);

        b.deposit(5000);
    }
}
