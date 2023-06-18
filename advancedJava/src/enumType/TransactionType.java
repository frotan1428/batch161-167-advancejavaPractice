package enumType;

public enum TransactionType {
    DEPOSIT(10),
    WITHDRAW (20),
    TRANSFER(30),
    PAYMENT(40),
    OTHER(50);



    private final int transactionCode;

    //getter


    public int getTransactionCode() {
        return transactionCode;
    }

    //by default the constructor is private
    private TransactionType(int transactionCode) {
        this.transactionCode = transactionCode;
    }
}
