package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Inventory> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: Create new item");
            System.out.println("2: Remove an item");
            System.out.println("3: Update item's quantity");

            String option = scanner.nextLine();



            switch (option) {
                case "1":
                    System.out.println("Enter your item");
                    String text = scanner.nextLine();
                    Inventory item = new Inventory(text, 1);
                    items.add(item);
                    break;

                case "2":
                    // remove item
                    break;

                case "3":
                    // update item quantity
                    break;


            }
        }
    }
}
