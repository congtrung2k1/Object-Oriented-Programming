public class MyStringObject implements Comparable<MyStringObject> {
    private String value;

    public MyStringObject(String str) {
        this.value = str;
    }

    @Override
    public int compareTo(MyStringObject o) {
        return this.value.compareTo(o.value);
    }

    @Override
    public String toString() {
//        System.out.println(value);
        return value;
    }
}