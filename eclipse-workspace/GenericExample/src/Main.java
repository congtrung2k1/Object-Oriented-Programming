import java.lang.annotation.Inherited;

public class Main {
    public static void main(String[] args) {

        //MyIntObject
        MyIntObject[] intArr = {new MyIntObject(3), new MyIntObject(9), new MyIntObject(6),
                new MyIntObject(1), new MyIntObject(2)};
        GenericList<MyIntObject> myList = new GenericList<MyIntObject>(intArr);
        System.out.println(myList);
        myList.sortGenericList();
        System.out.println(myList);

        //MyStringObject object
        MyStringObject[] strArr = {new MyStringObject("def"), new MyStringObject("dba"), new MyStringObject("abb"),
                new MyStringObject("bce"), new MyStringObject("abc")};
        GenericList<MyStringObject> myStringObjectList = new GenericList<MyStringObject>(strArr);
        System.out.println(myStringObjectList);
        myStringObjectList.sortGenericList();
        System.out.println(myStringObjectList);

        //Wrapper Integer
        Integer[] integerArray = {5, 10, 3, 15, 1};
        GenericList<Integer> myIntegerList = new GenericList<Integer>(integerArray);
        System.out.println(myIntegerList);
        myIntegerList.sortGenericList();
        System.out.println(myIntegerList);

        //String
        String[] stringArr = {"abc", "def", "bbd", "aab", "cda"};
        GenericList<String> myStringList = new GenericList<>(stringArr);
        System.out.println(myStringList);
        myStringList.sortGenericList();
        System.out.println(myStringList);

    }
}