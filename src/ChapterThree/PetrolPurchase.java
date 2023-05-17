package ChapterThree;

public class PetrolPurchase {
    public PetrolPurchase(String location, String petrol, int quantity, double pricePerLiters, double discount){
        location = "Adeola Odeku";
        petrol = "Fuel";
        quantity = 2;
        pricePerLiters = 210.10;
        discount = 0.05;
    }
    private double netPurchaseAmount;

    public PetrolPurchase(){

    }
    public void purchaseAmount(int quantity, double pricePerLiters, double discount){
        netPurchaseAmount = (quantity * pricePerLiters) - discount;
    }
    public double getPurchaseAmount(){
        return netPurchaseAmount;
    }
}
