package enumType;

public class TransactionRunner {
    public static void main(String[] args) {
        System.out.println("********** call constant method *********");
        constantMethod(1);
        constantMethod(2);
        constantMethod(3);
        constantMethod(4);
        constantMethod(5);

        constantMethod(15); //no CTE and no RTE
        System.out.println("********** call enum method *********");
        enumMethod(TransactionType.PAYMENT);

//        enumMethod(TransactionType.WITHDRAW);
//        enumMethod(TransactionType.PAYMENT);
//        enumMethod(TransactionType.OTHER);

    }

    //method for constant
    private static void constantMethod(int i){
        if(i == TransactionTypeConstant.DEPOSIT){
            System.out.println("Money is deposited");
        } else if (i==TransactionTypeConstant.WITHDRAW) {
            System.out.println("Money is withdrawn");
        } else if (i==TransactionTypeConstant.TRANSFER) {
            System.out.println("Money is transferred");
        } else if (i==TransactionTypeConstant.PAYMENT) {
            System.out.println("Money is paid");
        } else if (i==TransactionTypeConstant.OTHER) {
            System.out.println("Other transaction");
        }
    }
    //method for enum type
    private static void enumMethod(TransactionType tt){
        if(tt.ordinal()==0)
        if(tt == TransactionType.DEPOSIT){
            System.out.println("Money is deposited");
        } else if (tt==TransactionType.WITHDRAW) {
            System.out.println("Money is withdrawn");
        } else if (tt==TransactionType.TRANSFER) {
            System.out.println("Money is transferred");
        } else if (tt==TransactionType.PAYMENT) {
            System.out.println("Money is paid");
        }else {
            System.out.println("Other Transaction");
        }

        //Enum Methods
        System.out.println("Enum Name: "+ tt.name()); //print the variable name on screen
        System.out.println("Enum value: "+ tt.getTransactionCode());
        System.out.println("Enum Ordinal: "+tt.ordinal());
    }
}
