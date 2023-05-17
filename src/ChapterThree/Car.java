package ChapterThree;
public class Car{
    private String model;
    private String year;
    private double actualPrice;
    private double bmwDiscountAmount;
    private double benzDiscountAmount;
       private double fivePercent;
    private double sevenPercent;
      public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        this.actualPrice = price;
    }

    public void setBmwPrice(double price) {
        this.actualPrice = price;
    }
    public double getActualPrice(){
        return actualPrice;
    }
    public void calculateForBmwDiscount(double fivePercent) {
        bmwDiscountAmount = actualPrice * fivePercent;
        if(actualPrice <= 0) actualPrice = 0;
        else this.actualPrice = this.actualPrice - bmwDiscountAmount;
    }
    public double getBmwDiscount(){
        return bmwDiscountAmount;
    }

    public void calculateForBenzDiscount(double sevenPercent) {
        benzDiscountAmount = actualPrice * sevenPercent;
        if (actualPrice <= 0) actualPrice = 0;
        else this.actualPrice = actualPrice - benzDiscountAmount;
    }
    public double getBenzDiscount(){
          return benzDiscountAmount;
    }
}