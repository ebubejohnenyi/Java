package Bank;
import java.util.ArrayList;
import java.util.List;

public class Bank {
   private List <Account> newCustomer = new ArrayList<>();
   private String accountNumber;
   public void registerNewCustomer(String name, String phoneNumber,String pin) {
      Account newAccount = new Account(name,phoneNumber,pin);
      newCustomer.add(newAccount);
      newAccount.setPhoneNumber(phoneNumber);
      newAccount.setName(name);
      newAccount.setAccountNumber(generateCustomerAccountNumberWith(phoneNumber));
   }
   public int getCustomersSize() {
      return newCustomer.size();
   }
   public String generateCustomerAccountNumberWith(String phoneNumber) {
      if(phoneNumber.length() > 12){
         throw new IllegalArgumentException();
      }
      else if(phoneNumber.length() > 1 && phoneNumber.length() <12) {
         accountNumber = phoneNumber.substring(1);
      }
      else {
         throw new IllegalArgumentException();
      }
      return accountNumber;
   }
   public void deposit(String accountNumber, int amount) {
      for (Account newAccountNumber : newCustomer) {
         if(newAccountNumber.getAccountNumber().equals(accountNumber)) {
            if(amount < 1){
               throw new IllegalArgumentException();
            }
            else {
            newAccountNumber.deposit(amount);
            }
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
            if(newAccountNumber.getBalance() < 0){
               System.out.println("INSUFFICIENT FUNDS.");
            }
            else {
               newAccountNumber.withdraw(pin, amount);
            }
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
   public void deleteAccountNumber(String accountNumber){
      for (Account accountToDelete: newCustomer) {
         if(accountToDelete.getAccountNumber().equals(accountNumber)){
            newCustomer.remove(accountToDelete);
            System.out.println("ACCOUNT HAS BEEN SUCCESSFULLY DELETED");
            break;
         }
         else{
            System.out.println("ACCOUNT NOT FOUND.");
            break;
         }
      }
   }
}
