package Bank;

import java.util.Objects;

public class Account {
    private int initialBalance = 0;
    private boolean isEmpty = true;
    private String pin;
    private String name;
    private String phoneNumber;
    private String accountNumber;
    public Account(String name, String phoneNumber, String pin) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
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
        if(amount < 0){
            throw new IllegalArgumentException();
        }
        else {
            initialBalance += amount;
        }
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
            if(amount < 0){
                throw new IllegalArgumentException();
            }
            else{
                initialBalance -= amount;
            }
        }
        else{
            throw new IllegalArgumentException();
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
