package assignment;

import java.util.Scanner;

public class GroceryShopping {
    public static void searchItem(String[] itemArray, String name){
        int index = -1;
        for(String i : itemArray){
            index++;
            if(i.equalsIgnoreCase(name)){
                break;
            }
        }
        if(index!= -1){
            System.out.println(index);
        } else {
            System.out.println("Item not found.");
        }
    }
    public static float calculateAveragePrice(float[] priceArray){
        float sum = 0;
        for(float i : priceArray){
            sum += i;
        }
        float average = sum/(priceArray.length);
        System.out.println(average);
        return average;
    }
    public static void filterItemBelowPrice(String[]itemArray,float[] priceArray, float price){
        int index = -1;
        for(float i : priceArray){
            index++;
            if(i < price){
                System.out.println(itemArray[index]);
            }
        }
    }
    public static void main(String[] args) {
        String[] item = new String[10];
        float[] price = new float[10];
        int[] stock = new int[10];
        item[0] = "Apple";   price[0] = 0.50f; stock[0] = 100
        ;
        item[1] = "Banana";  price[1] = 0.30f; stock[1] = 120;
        item[2] = "Bread";   price[2] = 2.00f; stock[2] = 50;
        item[3] = "Milk";    price[3] = 1.50f; stock[3] = 60;
        item[4] = "Eggs";    price[4] = 2.50f; stock[4] = 80;
        item[5] = "Cheese";  price[5] = 3.00f; stock[5] = 40;
        item[6] = "Chicken"; price[6] = 5.00f; stock[6] = 30;
        item[7] = "Rice";    price[7] = 1.00f; stock[7] = 90;
        item[8] = "Pasta";   price[8] = 1.20f; stock[8] = 70;
        item[9] = "Tomato";  price[9] = 0.80f; stock[9] = 110;

        searchItem(item, "Apple");
        searchItem(item, "Tomato");
        searchItem(item, "Invalid");

        calculateAveragePrice(price);

        filterItemBelowPrice(item,price,10);
        filterItemBelowPrice(item,price,1);
        filterItemBelowPrice(item,price,0.5f);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to start");
        while(true) {
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("exit")) {
                System.out.println("Thank you for using the shopping cart. Goodbye!");
                break;
            }

            float totalBill = 0;
            while (true) {
                String itemInput = scanner.nextLine();
                if (itemInput.toLowerCase().equals("finish")) {
                    System.out.println("Your total bill is: $" + totalBill);
                    if(totalBill > 100){
                        float newTotalBill = totalBill - ((10/100)*totalBill);
                        System.out.println("Discounted bill is: " + newTotalBill);
                    }
                    break;
                }
                int itemIndex = -1;
                for (int i = 0; i < item.length; i++) {
                    if (item[i].equalsIgnoreCase(itemInput)) {
                        itemIndex = i;
                        break;
                    }
                }
                if (itemIndex == -1) {
                    throw new ItemNotFoundException("No item found");
                }
                System.out.println("Enter the quantity of " + item[itemIndex] + ":");
                int quantity = Integer.parseInt(scanner.nextLine());
                if(quantity > stock[itemIndex]){
                    System.out.println("item out of stock");
                } else {
                    stock[itemIndex] -= quantity;
                    float itemPrice = price[itemIndex] * quantity;
                    totalBill += itemPrice;
                }

            }
        }
    }

}
