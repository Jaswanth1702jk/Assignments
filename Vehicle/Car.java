
package Vehicle;
public class Car {
    private String name;
    private int year;
    private int price;

    public Car(String name,int year,int price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }
   public String getName() {
       return name;
   }
   public int getYear() {
       return year;
   }
   public int getPrice() {
       return price;
   }
   @Override
   public String toString() {
    return "Car{" +"Company='" + name + '\'' +", year=" + year +", price=" + price +'}';
   }
}