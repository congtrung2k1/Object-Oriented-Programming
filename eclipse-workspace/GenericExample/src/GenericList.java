import java.util.ArrayList;
import java.util.Collections;

public class GenericList<T extends Comparable<T>> {
    private ArrayList<T> genList;

    public GenericList() {
        genList = new ArrayList<T>();
    }

    public GenericList(T[] array) {
        this();
        for (T element : array) {
            genList.add(element);
        }
    }

    public void addElement(T element) {
        genList.add(element);
    }

    public void sortGenericList() {
        Collections.sort(this.genList);
    }

    @Override
    public String toString() {
        String result ="";
        for (T element : genList) {
            result = result + element.toString() + " ";
        }
        return result;
    }
}