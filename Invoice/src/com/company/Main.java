package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> product = new ArrayList<String>();
        ArrayList<Double> price = new ArrayList<Double>();
        ArrayList<String> itemsPurchased = new ArrayList<String>();
        ArrayList<Double> purchasePrice = new ArrayList<Double>();

        product.add("Bison Sweater");
        price.add(55.99);
        product.add("Bison Tee");
        price.add(14.99);
        product.add("Bison Hoodie");
        price.add(23.99);
        product.add("Bison Bumpersticker");
        price.add(4.99);

        String answer = " ";
        input = new Scanner(System.in);
        String item;
        double sum = 0.0;
        int index = -1;
        do {
            System.out.println("What did you purchase?: ");
            item = input.nextLine();
            itemsPurchased.add(item);
            for (int i = 0; i < product.size(); i++) {
                if (item.equals(product.get(i))) {
                    index = i;
                }
            }
            purchasePrice.add(price.get(index));
        } while (!item.equals("Done"));
        double cost = 0.0;
        for (int i = 0; i < purchasePrice.size(); i++) {
            double itemPurchased = purchasePrice.get(i);
            cost += itemPurchased;
        }
        System.out.println("Your total is $" + cost);
    }
}

