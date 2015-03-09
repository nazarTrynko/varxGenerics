package javka.collectionsAndGenerics.containerTask4;

import java.util.ArrayList;

/**
 * Created by Nazar on 04.03.2015.
 */
public class Test {



    public static void main(String[] args) {

        Container container = new Container();
        ArrayList<String> arrayList = new ArrayList<>();

        // Container test
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            container.addToContainer(String.valueOf(i));
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Time for adding to container: " + (endTime - startTime));

        // ArrayList test

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(String.valueOf(i));
        }
        long endTime1 = System.currentTimeMillis();

        System.out.println("Time for adding to ArrayList: " + (endTime1 - startTime1));

    }


}
