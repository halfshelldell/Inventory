package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*static Item createItem(String name, int quantity, String category) {
        ;
    }*/


    static Item createItem(String name, int quantity, String category) {
        category = category.toLowerCase();
        switch (category) {
            case "fruit":
                return new Fruit(name, quantity);

            case "clothes":
                return new Clothes(name, quantity);

            case "vegetables":
                return new Vegetables(name, quantity);

            case "nuts":
                return new Nuts(name, quantity);

            case "meat":
                return new Meat(name, quantity);

            default:
                System.out.println("Invalid category");
        }
        return new Item(name, quantity);
    }

    public static void removeItem(Scanner scanner, ArrayList<Item> items) {
        System.out.println("Enter number of item(s) you would to remove:");
        String rmvItems = scanner.nextLine();
        int remove = Integer.valueOf(rmvItems);
        items.remove(remove - 1);
    }


    public static void updateItem(Scanner scanner, ArrayList<Item> items) {
        System.out.println("Enter which item you would like to update");
        String updateNum = scanner.nextLine();
        System.out.println("Update item's quantity");
        String itemNum = scanner.nextLine();
        int num = Integer.valueOf(updateNum);
        Item tempItem = items.get(num - 1);
        tempItem.quantity += Integer.valueOf(itemNum);
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Item:");


        while (true) {
            for (Item item : items) {
                System.out.printf("%s. [%s] %s (%s)\n", 1 + items.indexOf(item), item.quantity, item.text, item.category);
            }

            System.out.println("1: Create new item");
            System.out.println("2: Remove an item");
            System.out.println("3: Update item's quantity");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Enter your item");
                    String text = scanner.nextLine();
                    System.out.println("Enter the quantity of the item you entered");
                    String numItem = scanner.nextLine();
                    int num = Integer.valueOf(numItem);
                    System.out.println("Enter the category the of item");
                    String category = scanner.nextLine();
                    Item item = createItem(text, num, category);
                    items.add(item);
                    break;

                case "2":
                    removeItem(scanner, items);
                    break;

                case "3":
                    updateItem(scanner, items);
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
