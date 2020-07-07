package com.machine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterLeft = 400;
        int milkLeft = 540;
        int beansLeft = 120;
        int cupsLeft = 9;
        int moneyLeft = 550;

        state(waterLeft, milkLeft, beansLeft, cupsLeft, moneyLeft);

        System.out.println("Write action (buy, fill, take)");
        String action = scanner.next();

        switch (action) {
            case "buy":
                int[] coffeeAr = buy(waterLeft, milkLeft, beansLeft, moneyLeft);
                waterLeft = coffeeAr[0];
                milkLeft = coffeeAr[1];
                beansLeft = coffeeAr[2];
                moneyLeft = coffeeAr[3];
                cupsLeft--;
                state(waterLeft, milkLeft, beansLeft, cupsLeft, moneyLeft);
                break;
            case "fill":
                int[] fillAr = fill(waterLeft, milkLeft, beansLeft, cupsLeft);
                waterLeft = fillAr[0];
                milkLeft = fillAr[1];
                beansLeft = fillAr[2];
                cupsLeft = fillAr[3];
                state(waterLeft, milkLeft, beansLeft, cupsLeft, moneyLeft);
                break;
            case "take":
                int money = take(moneyLeft);
                moneyLeft -= money;
                state(waterLeft, milkLeft, beansLeft, cupsLeft, moneyLeft);
                break;
            }
    }

    public static void state(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money\n");
    }

    public static int[] buy(int water, int milk, int beans, int money) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
        int coffeeType = scanner.nextInt();
        System.out.println();

        int[] coffeeAr = new int[4];

        switch(coffeeType){
            case 1:
                coffeeAr[0] = water - 250;
                coffeeAr[1] = milk;
                coffeeAr[2] = beans - 16;
                coffeeAr[3] = money + 4;
                break;
            case 2:
                coffeeAr[0] = water - 350;
                coffeeAr[1] = milk - 75;
                coffeeAr[2] = beans - 20;
                coffeeAr[3] = money + 7;
                break;
            case 3:
                coffeeAr[0] = water - 200;
                coffeeAr[1] = milk - 100;
                coffeeAr[2] = beans - 12;
                coffeeAr[3] = money + 6;
                break;
        }
        return coffeeAr;
    }
    public static int[] fill(int water, int milk, int beans, int cups) {
        Scanner scanner = new Scanner(System.in);

        int[] fillAr = new int[4];

        System.out.println("Write how many ml of water do you want to add:");
        fillAr[0] = scanner.nextInt() + water;
        System.out.println("Write how many ml of milk do you want to add:");
        fillAr[1] = scanner.nextInt() + milk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        fillAr[2] = scanner.nextInt() + beans;
        System.out.println("Write how many disposable cups do you want to add:");
        fillAr[3] = scanner.nextInt() + cups;
        System.out.println();
        return fillAr;
    }
    public static int take(int money) {
        System.out.println("I gave you $" + money + "\n");

        return money;
    }
}


//        int coffeeCupsRequest = scanner.nextInt();
//
//        int maximumCoffees = Math.min(coffeeBeansAmount, Math.min(waterAmount,milkAmount));
//
//
//        if (maximumCoffees < coffeeCupsRequest){
//            System.out.println("No, I can make only " + maximumCoffees + " cup(s) of coffee");
//        } else if (maximumCoffees == coffeeCupsRequest) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else {
//            System.out.println("Yes, I can make that amount of coffee (and even " + (maximumCoffees - coffeeCupsRequest) + " more than that)");
//        }

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