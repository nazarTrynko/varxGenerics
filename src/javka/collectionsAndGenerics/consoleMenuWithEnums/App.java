package javka.collectionsAndGenerics.consoleMenuWithEnums;

import java.util.Scanner;

/**
 * Created by Nazar on 04.03.2015.
 */
public class App {
    static Button button;
    static Scanner scanner = new Scanner(System.in);

    public static void chooseOption() {
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                button = Button.OPTION1;
                break;
            case 2:
                button = Button.OPTION1;
                break;
            case 3:
                button = Button.OPTION1;
                break;
            case 4:
                button = Button.OPTION1;
                break;
        }
    }
    public static void main(String[] args) {
        for (Button button : Button.values()) {
            System.out.println(button);
        }
        chooseOption();
        ConsoleMenu consoleMenu = new ConsoleMenu(button);
    }


}
