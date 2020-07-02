package com.machine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");
        int coffeeNumber = scanner.nextInt();
        System.out.println("For" + coffeeNumber + " cups of coffee you will need:");
        System.out.println((coffeeNumber * 200) + "ml of water");
        System.out.println((coffeeNumber * 50) + "ml of milk");
        System.out.println((coffeeNumber * 15) + "g of coffee beans");


//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
    }
}
