package zhdanov.v.v;

import java.util.Scanner;

/**
 * PhoneBook
 * <p>
 * Menu:
 * 1 - Add contact;
 * 2 - Delete contact;
 * 3 - Show all contacts;
 * 4 - Edit contact;
 * 6 - Quit;
 */

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Functions fun = new Functions();

        while (true) {

            System.out.println("1 Add Contact\n" +
                    "2 Delete contact\n" +
                    "3 Show all contacts\n" +
                    "4 Find by name\n" +
                    "5 Edit contact\n" +
                    "6 Quit");

            int answear = scan.nextInt();

            if (answear == 1) {
                fun.addContact();
            } else if (answear == 2) {
                fun.deleteContact();
            } else if (answear == 3) {
                fun.showAll();
            } else if (answear == 4) {
                fun.findByName();
            } else if (answear == 5) {
                fun.editContact();
            } else if (answear == 6) {
                System.exit(0);
            } else {
                System.out.println("Try one more time..\n");

            }
        }

    }
}
