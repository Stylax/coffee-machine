package com.machine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int waterAmount = scanner.nextInt() / 200;
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkAmount = scanner.nextInt() / 50;
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeansAmount = scanner.nextInt() / 15;
        System.out.println("Write how many cups of coffee you will need:");
        int coffeeCupsRequest = scanner.nextInt();

        int maximumCoffies = Math.min(coffeeBeansAmount, Math.min(waterAmount,milkAmount));


        if (maximumCoffies < coffeeCupsRequest){
            System.out.println("No, I can make only " + maximumCoffies + " cup(s) of coffee");
        } else if (maximumCoffies == coffeeCupsRequest) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maximumCoffies - coffeeCupsRequest) + " more than that)");
        }

//        System.out.println("Write how many cups of coffee you will need:");
//        int coffeeNumber = scanner.nextInt();
//        System.out.println("For" + coffeeNumber + " cups of coffee you will need:");
//        System.out.println((coffeeNumber * 200) + "ml of water");
//        System.out.println((coffeeNumber * 50) + "ml of milk");
//        System.out.println((coffeeNumber * 15) + "g of coffee beans");
//

//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");
    }
}
