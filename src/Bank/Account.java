package Bank;

public class Account {
    private int accountBalance;
    private int initialBalance = 0;
    private boolean isEmpty = true;
    private boolean isCorrect = true;
    private String pin;
    private String name;
    private String phoneNumber;
    private String accountNumber;
    public Account(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public void deposit(int amount) {
        accountBalance = initialBalance + amount;
    }
    public int getBalance() {
        return accountBalance;
    }
    public void withdraw(String pin, int amount) {
        if(this.pin == pin){
            isCorrect = true;
            initialBalance -= amount;
        }
        else if(this.pin != pin){
            System.out.println("Incorrect pin");
            isCorrect = false;
        }
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public boolean pinIsCorrect() {
        return isCorrect;
    }

    public int checkBalance(String pin) {
        if(this.pin == pin){
            isCorrect = true;
            return getBalance();
        }
        else if(this.pin != pin){
            System.out.println("Incorrect pin");
            isCorrect = false;
        }
        return 0;
    }
    public String generateAccountNumberWith(String phoneNumber) {
        for (int index = 0; index < phoneNumber.length(); index++) {
            accountNumber = phoneNumber.replaceFirst(String.valueOf(0), "");
        }
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
