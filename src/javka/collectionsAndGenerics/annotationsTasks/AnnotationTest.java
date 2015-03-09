package javka.collectionsAndGenerics.annotationsTasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Nazar on 07.03.2015.
 */
@Retention(RetentionPolicy.RUNTIME)
@interface myAnnotation{
    String name();
}

public class AnnotationTest {


    @myAnnotation(name = "My annotation")
    String name;

    int number;

    @myAnnotation(name = "My annotation")
    int id;

    public static int count(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {


    }
}
