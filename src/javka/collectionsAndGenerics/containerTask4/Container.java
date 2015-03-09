package javka.collectionsAndGenerics.containerTask4;

/**
 * Created by Nazar on 04.03.2015.
 */
public class Container {
    int capacity = 10;
    private String [] stringsContainer = new String[capacity];
    int emptyElementIndex;



    public int getSize() {
        return emptyElementIndex;
    }

    public String getFromContainer (int index) {
        return stringsContainer[index];
    }

    public void addToContainer (String string) {
        if (emptyElementIndex == stringsContainer.length){
            ensureCapacity();
        }

        stringsContainer[emptyElementIndex] = string;
        emptyElementIndex++;
    }

    private void ensureCapacity () {
        capacity = (capacity * 3) / 2 + 1;
        String [] newContainer = new String[capacity];
        System.arraycopy(stringsContainer, 0, newContainer, 0, stringsContainer.length);
        stringsContainer = newContainer;

    }



}


