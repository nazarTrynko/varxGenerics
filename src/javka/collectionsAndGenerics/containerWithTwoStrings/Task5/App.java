package javka.collectionsAndGenerics.containerWithTwoStrings.Task5;

import java.util.*;

/**
 * Created by Nazar on 04.03.2015.
 */
class SecondStringComparator implements Comparator<MyClass> {

    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getString2().compareTo(o2.getString2());
    }
}

public class App {

    public static void main(String[] args) {
        // Sorting by first string in array
        System.out.println("Array sorting by string1\n");
        MyClass<String ,String >[] myClasses = new MyClass[5];

        myClasses[0] = new MyClass<>();
        myClasses[1] = new MyClass<>();
        myClasses[2] = new MyClass<>();
        myClasses[3] = new MyClass<>();
        myClasses[4] = new MyClass<>();

        myClasses[0].put("Norway", "Oslo");
        myClasses[1].put("Mali", "Bamako");
        myClasses[2].put("Austria", "Vienna");
        myClasses[3].put("Madagascar", "Antananarivo");
        myClasses[4].put("Indonesia", "Jakarta");

        Arrays.sort(myClasses);
        for (MyClass<String, String> myClass : myClasses) {
            System.out.println(myClass);
        }

        // Sorting by first string in ArrayList
        System.out.println("\nArrayList sorting by string1\n");
        ArrayList<MyClass<String, String>> arrayList = new ArrayList<>();


        arrayList.add(new MyClass<>());
        arrayList.add(new MyClass<>());
        arrayList.add(new MyClass<>());
        arrayList.add(new MyClass<>());
        arrayList.add(new MyClass<>());
        arrayList.add(new MyClass<>());



        arrayList.get(0).put("Serbia", "Belgrade");
        arrayList.get(1).put("Spain", "Madrid");
        arrayList.get(2).put("France", "Paris");
        arrayList.get(3).put("Malta", "Valletta");
        arrayList.get(4).put("China", "Beijing");
        arrayList.get(5).put("Uzbekistan", "Tashkent");

        Collections.sort(arrayList);

        for (MyClass myClass : arrayList) {
            System.out.println(myClass);
        }

        // Using custom comparator that compares by second string of objects

        Arrays.sort(myClasses, new SecondStringComparator());

        System.out.println("\nSorting array with custom comparator\n");
        for (MyClass<String, String> myClass : myClasses) {
            System.out.println(myClass);
        }

        System.out.println("\nSorting ArrayList with custom comparator\n");
        Collections.sort(arrayList, new SecondStringComparator());
        for (MyClass myClass : arrayList) {
            System.out.println(myClass);
        }

    }

}

