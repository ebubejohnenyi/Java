package Bank;

import java.util.Objects;

public class Account {
    private int initialBalance = 0;
    private boolean isEmpty = true;
    private String pin = "1234";
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
    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    public void deposit(int amount) {
        initialBalance += amount;
    }
    public int getBalance() {
        return initialBalance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void withdraw(String pin, int amount) {
        if(Objects.equals(this.pin, pin)){
            initialBalance -= amount;
        }
        else{
            System.out.println("Incorrect pin");
        }
    }
    public int checkBalance(String pin) {
        if(this.pin.equals(pin)){
            return getBalance();
        }
        else{
            System.out.println("Incorrect pin");
        }
        return 0;
    }
}
