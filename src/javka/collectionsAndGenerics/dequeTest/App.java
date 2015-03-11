package javka.collectionsAndGenerics.dequeTest;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by Nazar on 11.03.2015.
 */
public class App {

    public static void main(String[] args) {
        Deque<Integer> integers = new LinkedBlockingDeque<>(3);

        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(3);
    }
}
