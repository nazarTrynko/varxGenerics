package javka.collectionsAndGenerics.consoleMenuWithEnums;

/**
 * Created by Nazar on 07.03.2015.
 */
public class ConsoleMenu {
    Button button;

    public ConsoleMenu(Button button) {
        this.button = button;
        chooseOption();
    }

    private void chooseOption() {
        switch (button) {
            case OPTION1:
                System.out.println("You choosed option: " + button.info());
                break;
            case OPTION2:
                System.out.println("You choosed option: " + button.info());
                break;
            case OPTION3:
                System.out.println("You choosed option: " + button.info());
                break;
            case OPTION4:
                System.out.println("You choosed option: " + button.info());
                break;
        }
    }

}
