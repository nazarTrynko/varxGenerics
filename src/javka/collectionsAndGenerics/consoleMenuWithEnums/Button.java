package javka.collectionsAndGenerics.consoleMenuWithEnums;

/**
 * Created by Nazar on 04.03.2015.
 */
public enum Button {
    OPTION1(1) {
        @Override
        public String info() {
            return "Buy";
        }
    }, OPTION2(2) {
        @Override
        public String info() {
            return "Sell";
        }
    }, OPTION3(3) {
        @Override
        public String info() {
            return "Trade";
        }
    }, OPTION4(4) {
        @Override
        public String info() {
            return "Other";
        }
    };

    private int number;

    private Button(int number) {
        this.number = number;
    }



    public int getNumber() {
        return number;
    }

    public abstract String info ();


    @Override
    public String toString() {
        return number + ". " + info();
    }
}