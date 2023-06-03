package Bank;
import java.util.ArrayList;
import java.util.List;

public class Bank {
   private List <Account> newCustomer = new ArrayList<>();
   private String accountNumber;
   private int accountBalance = 0;
   public void registerNewCustomer(String name, String phoneNumber) {
      Account newAccount = new Account(name,phoneNumber);
      newCustomer.add(newAccount);
      newAccount.setAccountNumber(generateCustomerAccountNumberWith(phoneNumber));
   }
   public int getCustomersSize() {
      return newCustomer.size();
   }
   public String generateCustomerAccountNumberWith(String phoneNumber) {
      for (int index = 0; index < phoneNumber.length(); index++) {
         accountNumber = phoneNumber.replaceFirst(String.valueOf(0), "");
      }
      return accountNumber;
   }
//   public String getAccountNumber() {
//      return accountNumber;
//   }

   public void deposit(String accountNumber, int amount) {
      for (Account accounts: newCustomer) {
         if(accounts.getAccountNumber() == accountNumber){
            accounts.deposit(amount);
         }
      }
   }
}
