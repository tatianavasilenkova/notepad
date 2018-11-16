package lv.ctco.notepad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Person> records = new ArrayList<>();


    public static void main(String[] args) {
        for (;;) {                                                     // (;;) - bezkone4nij cikl
            System.out.print("cmd: ");
            String cmd = scanner.next();
            switch (cmd) {
                case "create":
                    createPerson();
                    break;
                case "help":
                    showHelp();
                    break;
                case "list":
                    list();                                               // zapros o vivode vsex su6estvuju6ix zapisej na ekran
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Wrong command. Try help");
            }
        }
    }

    private static void list() {

    }

    private static void showHelp() {

    }

    private static void createPerson() {
    }

}
