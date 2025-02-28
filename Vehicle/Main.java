package Vehicle;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------Welcome to Auto Shop World----------");
        System.out.println("Please signup with your details");
        System.out.println("Please enter your first name");
        String fName = sc.nextLine();

        System.out.println("Please enter your last name");
        String lName = sc.nextLine();

        System.out.println("Please enter your username");
        String uName = sc.nextLine();

        System.out.println("Please enter your password");
        String password = sc.nextLine();

        System.out.println("Thank you! Your registration is successfull");
        System.out.println("Please sign with your details");
        System.out.println("Please enter your username");
        String sUserName = sc.nextLine();

        List<Car> list = new ArrayList<>();

        
        list.add(new Car("Toyota", 2019, 5000));
        list.add(new Car("Suzuki", 2016, 3500));
        list.add(new Car("Benz", 2021, 6000));
        list.add(new Car("Kia", 2020, 4500));
        
        if (sUserName.equals(uName)) {
            System.out.println("Please enter your password");
            String sPassword = sc.nextLine();
            if (sPassword.equals(password)) {
                System.out.println("------------("+fName + ",Welcome to Autoshop world"+")------------");

                System.out.println("------------List of Available Vehicles------------------");
                for (Car car : list) {
                    System.out.println(car);
                }

                System.out.println("Do you wanna view the list sorted based on year ");
                String str1 = sc.nextLine();

                if (str1.equals("Yes")) {
                Collections.sort(list, Comparator.comparingInt(Car::getYear));
                System.out.println("Sorted by Year:");
                list.forEach(System.out::println);
                }
                else{
                    System.out.println("No worries!");
                }

                System.out.println("Do you wanna view the list sorted based on price");
                String str2 = sc.nextLine();

                if (str2.equals("Yes")) {
                Collections.sort(list, Comparator.comparingInt(Car::getPrice));
                System.out.println("Sorted by Price:");
                list.forEach(System.out::println);
                }
                else{
                    System.out.println("No worries!");
                }
            }  
        }
    }
}