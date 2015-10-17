package zhdanov.v.v;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Владимир on 17.10.2015.
 */
public class Functions {
    ArrayList<Contact> book = new ArrayList<Contact>();
    Scanner scan = new Scanner(System.in);

    public Contact addContact() {                    //Доюавление контакта
        System.out.println("Set name:");
        String name = scan.next();

        System.out.println("Set number:");
        String number = scan.next();

        System.out.println("Set e-mail:");
        String email = scan.next();

        Contact contact = new Contact(name, number, email);
        book.add(contact);
        return contact;

    }

    public void deleteContact() {
        System.out.println("Input name");
        String name = scan.next();
        for (int i = 0; i < book.size(); i++) {
            if (name.equals(book.get(i).getName())) {
                System.out.println("Name - " + book.get(i).getName() + "; E-mail - " + book.get(i).getEmail()
                        + "; Phone - " + book.get(i).getNumber() + ";");
                System.out.println("Do you want to delete this contact?\n 1-Yes\n 2-No");
                int choise = scan.nextInt();
                if (choise == 1) {
                    book.remove(i);
                    System.out.println("Contact deleted :(\n");
                } else if (choise == 2) {
                    System.out.println("You changed your mind :)\n");
                    break;
                } else {
                    System.out.println("Wrong input! >:(\n");
                }
            }
        }
    }

    public void showAll() {
        for (int i = 0; i < book.size(); i++) {
            System.out.println("Contact name - " + book.get(i).getName() + "; Number - " + book.get(i).getNumber() +
                    "; E-mail - " + book.get(i).getEmail());
        }

    }

    public void findByName() {
        System.out.println("Input name:");
        String name = scan.next();

        for (int i = 0; i < book.size(); i++) {
            if (name.equals(book.get(i).getName())) {
                System.out.println("Contact : " + book.get(i).getName() + " " + book.get(i).getNumber() + " " +
                        book.get(i).getEmail());
            }

        }

    }

    public Contact editContact() {
        Contact contact = new Contact();
        System.out.println("Input name:");
        String name = scan.next();

        for (int i = 0; i < book.size(); i++) {
            if (name.equals(book.get(i).getName())) {
                System.out.println("Contact : " + book.get(i).getName() + " " + book.get(i).getNumber() + " " +
                        book.get(i).getEmail());
                System.out.println("What do you want to edit?\n" +
                        "1 - Name\n" +
                        "2 - Number\n" +
                        "3 - Email");
                int choise = scan.nextInt();
                if (choise == 1) {
                    System.out.println("Input new name:");
                    String newName = scan.next();
                    book.get(i).setName(newName);
                    System.out.println("Changed " + book.get(i).getName() + " On " + newName + ".\n");

                } else if (choise == 2) {
                    System.out.println("Input new Number:");
                    String newNumber = scan.next();
                    book.get(i).setNumber(newNumber);
                    System.out.println("Changed " + book.get(i).getNumber() + " On " + newNumber + ".\n");
                } else if (choise == 3) {
                    System.out.println("Input new Email:");
                    String newEmail = scan.next();
                    book.get(i).setEmail(newEmail);
                    System.out.println("Changed " + book.get(i).getEmail() + " On " + newEmail + ".\n");
                } else {
                    System.out.println("Oops wrong input...\n");
                }
            } else {
                System.out.println("Not found :( \n");
            }
        }
        return contact;
    }
}

