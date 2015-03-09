package javka.collectionsAndGenerics.containerWithTwoStrings.Task5;

/**
 * Created by Nazar on 04.03.2015.
 */
public class MyClass<K extends String , V extends String > implements Comparable<MyClass>{
    private K string1;
    private V string2;

    public void put(K string1, V string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }

    @Override
    public int compareTo(MyClass myClass) {
        return string1.compareTo(myClass.string1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyClass)) return false;

        MyClass myClass = (MyClass) o;

        if (string1 != null ? !string1.equals(myClass.string1) : myClass.string1 != null) return false;
        if (string2 != null ? !string2.equals(myClass.string2) : myClass.string2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = string1 != null ? string1.hashCode() : 0;
        result = 31 * result + (string2 != null ? string2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return string1 + " - " + string2;

    }
}
