package classes;

import java.util.Scanner;

public class BooksMenu {
    public static Book compareBooks(Book b1, Book b2){
        float b1price = b1.getPrice();
        float b2price = b2.getPrice();
        if(b1price == b2price){
            return null;
        } else if(b1price > b2price){
            return b1;
        } else {
            return b2;
        }
    };
    public static void main(String s[]) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        Book[] books = new Book[10];

        int bkIdx = 0;
        while(true) {
            System.out.println("Press 1 to view books, 2 to add books,3 to compare books, any other key to exit");
            String userAction = scanner.nextLine();
            if (userAction.equals("1")) {
                for(int i=0;i<books.length;i++) {
                    if(books[i] != null) {
                        System.out.println(books[i]);
                    }
                }
            } else if (userAction.equals("2")) {
                if(bkIdx == 10) {
                    System.out.println("10 books added already. Cannot add any more books!");
                    continue;
                }
                System.out.println("Enter book title");
                String tmpTitle = scanner.nextLine();
                System.out.println("Enter book author");
                String tmpAuthor = scanner.nextLine();
                System.out.println("Enter book price");
                float tmpPrice = Float.parseFloat(scanner.nextLine());
                Book bkTmp = new Book();
                bkTmp.setTitle(tmpTitle);
                bkTmp.setAuthor(tmpAuthor);
                bkTmp.setPrice(tmpPrice);
                books[bkIdx++] = bkTmp;

            } else if(userAction.equals("3")) {
                System.out.println("Enter book1 index");
                int book1index = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter book2 index");
                int book2index = Integer.parseInt(scanner.nextLine());
                Book expensive = compareBooks(books[book1index],books[book2index]);
                System.out.println(expensive + "is the more expensive book");
            }

            else {
                break;
            }
        }
    }
}

