package javka.collectionsAndGenerics.dequeTest;

/**
 * Created by Nazar on 11.03.2015.
 */
public class DequeTest {

    public static void main(String[] args) throws Exception {
        DequeClass<Integer> dequeClass= new DequeClass<>(3);

        dequeClass.offerFirst(1);
        dequeClass.offerFirst(2);
        dequeClass.offerFirst(3);

        dequeClass.removeFirst();
        dequeClass.offerFirst(4);
        dequeClass.removeFirst();
        dequeClass.offerLast(5);
        dequeClass.removeFirst();
        dequeClass.offerFirst(5);

        for (Integer dequeClas : dequeClass) {
            System.out.println(dequeClas);
        }
    }
}
