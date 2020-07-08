package com.machine;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterLeft = 400;
        int milkLeft = 540;
        int beansLeft = 120;
        int cupsLeft = 9;
        int moneyLeft = 550;
        String action = "";

        while(!action.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            action = scanner.next();

            switch (action) {
                case "buy":
                    int[] coffeeAr = buy(waterLeft, milkLeft, beansLeft, moneyLeft, cupsLeft);
                    waterLeft = coffeeAr[0];
                    milkLeft = coffeeAr[1];
                    beansLeft = coffeeAr[2];
                    moneyLeft = coffeeAr[3];
                    cupsLeft = coffeeAr[4];
                    break;
                case "fill":
                    int[] fillAr = fill(waterLeft, milkLeft, beansLeft, cupsLeft);
                    waterLeft = fillAr[0];
                    milkLeft = fillAr[1];
                    beansLeft = fillAr[2];
                    cupsLeft = fillAr[3];
                    break;
                case "take":
                    int money = take(moneyLeft);
                    moneyLeft -= money;
                    break;
                case "remaining":
                    System.out.println();
                    state(waterLeft, milkLeft, beansLeft, cupsLeft, moneyLeft);
                    break;
            }
        }
    }

    public static void state(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money\n");
    }

    public static int[] buy(int water, int milk, int beans, int money, int cups) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
        String coffeeType = scanner.next();
        System.out.println();

        int[] coffeeAr = new int[5];

        switch(coffeeType){
            case "1":
                if(water >= 250 && beans >= 16) {
                    System.out.println("I have enough resources, making you a coffee!");
                    coffeeAr[0] = water - 250;
                    coffeeAr[1] = milk;
                    coffeeAr[2] = beans - 16;
                    coffeeAr[3] = money + 4;
                    coffeeAr[4] = cups - 1;
                } else {
                    coffeeAr[0] = water;
                    coffeeAr[1] = milk;
                    coffeeAr[2] = beans;
                    coffeeAr[3] = money;
                    coffeeAr[4] = cups;
                    if(water<250) System.out.println("Sorry, not enough water!");
                    else System.out.println("Sorry, not enough beans");
                }
                break;
            case "2":
                if(water >= 350 && milk >= 75 && beans >= 20) {
                    System.out.println("I have enough resources, making you a coffee!");
                    coffeeAr[0] = water - 350;
                    coffeeAr[1] = milk - 75;
                    coffeeAr[2] = beans - 20;
                    coffeeAr[3] = money + 7;
                    coffeeAr[4] = cups - 1;
                } else {
                    coffeeAr[0] = water;
                    coffeeAr[1] = milk;
                    coffeeAr[2] = beans;
                    coffeeAr[3] = money;
                    coffeeAr[4] = cups;
                    if(water<350) System.out.println("Sorry, not enough water!");
                    else if (milk<75) System.out.println("Sorry, not enough milk!");
                    else System.out.println("Sorry, not enough beans");
                }
                break;
            case "3":
                if(water >= 200 && milk >= 100 && beans >= 12) {
                    System.out.println("I have enough resources, making you a coffee!");
                    coffeeAr[0] = water - 200;
                    coffeeAr[1] = milk - 100;
                    coffeeAr[2] = beans - 12;
                    coffeeAr[3] = money + 6;
                    coffeeAr[4] = cups - 1;
                } else {
                    coffeeAr[0] = water;
                    coffeeAr[1] = milk;
                    coffeeAr[2] = beans;
                    coffeeAr[3] = money;
                    coffeeAr[4] = cups;
                    if (water < 200) System.out.println("Sorry, not enough water!");
                    else if (milk < 100) System.out.println("Sorry, not enough milk!");
                    else System.out.println("Sorry, not enough beans");
                }
                break;
            case "back":
                coffeeAr[0] = water;
                coffeeAr[1] = milk;
                coffeeAr[2] = beans;
                coffeeAr[3] = money;
                coffeeAr[4] = cups;
                break;
        }
        return coffeeAr;
    }

    public static int[] fill(int water, int milk, int beans, int cups) {
        Scanner scanner = new Scanner(System.in);

        int[] fillAr = {water, milk, beans, cups};

        System.out.println("Write how many ml of water do you want to add:");
        fillAr[0] += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        fillAr[1] += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        fillAr[2] += scanner.nextInt();
        System.out.println("Write how many disposable cups do you want to add:");
        fillAr[3] += scanner.nextInt();
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