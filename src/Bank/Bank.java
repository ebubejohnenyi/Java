package Bank;
import java.util.ArrayList;
import java.util.List;

public class Bank {
   private List <Account> newCustomer = new ArrayList<>();
   private String accountNumber;
   public void registerNewCustomer(String name, String phoneNumber) {
      Account newAccount = new Account(name,phoneNumber);
      newCustomer.add(newAccount);
      newAccount.setPhoneNumber(phoneNumber);
      newAccount.setName(name);
      newAccount.setAccountNumber(generateCustomerAccountNumberWith(phoneNumber));
   }
   public int getCustomersSize() {
      return newCustomer.size();
   }
   public String generateCustomerAccountNumberWith(String phoneNumber) {
      if(phoneNumber.length() > 11){
         return null;
      }
      else {
         for (int index = 0; index < phoneNumber.length(); index++) {
            accountNumber = phoneNumber.replaceFirst(String.valueOf(0), "");
         }
         return accountNumber;
      }
   }
   public void deposit(String accountNumber, int amount) {
      for (Account newAccountNumber : newCustomer) {
         if(newAccountNumber.getAccountNumber().equals(accountNumber)){
            newAccountNumber.deposit(amount);
         }
      }
   }

   public int getBalance(String accountNumber) {
      for (Account newAccountBalance : newCustomer) {
         if(newAccountBalance.getAccountNumber().equals(accountNumber)){
            return newAccountBalance.getBalance();
         }
      }
      return 0;
   }

   public void withdraw(String accountNumber, String pin, int amount) {
      for (Account newAccountNumber : newCustomer) {
         if (newAccountNumber.getAccountNumber().equals(accountNumber)){
            newAccountNumber.withdraw(pin, amount);
         }
      }
   }

   public void transferTo(String senderAccountNumber, String receiverAccountNumber, int amount, String pin) {
      for (Account newAccount: newCustomer) {
         if (newAccount.getAccountNumber().equals(senderAccountNumber)){
            withdraw(senderAccountNumber,pin,2000);
            deposit(receiverAccountNumber,2000);
         }
      }
   }
}
