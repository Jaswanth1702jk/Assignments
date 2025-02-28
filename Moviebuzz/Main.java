package Moviebuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        System.out.println("---------Welcome to The MoviesWeb--------------");
        t1.start();
        t2.start();

        System.out.println("Do you wanna view the movies list , based on favourite hero?");
        String str = sc.nextLine();
        if (str.equals("Yes")) {
            String hero = sc.nextLine();
            if (hero.equals("Chiranjeevi")) {
                t1.start();
            }
            else if (hero.equals("Bala Krishna")) {
                t2.start();
            }
            else{
                System.out.println("Your favourite Heroes list is Unavailable");
            }
        }
        else{
            System.out.println("Keep watching!");
        }
    }
}
