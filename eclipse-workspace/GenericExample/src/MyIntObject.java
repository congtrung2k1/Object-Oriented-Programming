public class MyIntObject implements Comparable<MyIntObject>{
    private int value;

    public MyIntObject(int x) {
        this.value = x;
    }

//    @Override
//    public int compareTo(Object o) {
//        if (o instanceof MyIntObject)
//            return this.value - ((MyIntObject) o).value;
//        return 0;
//    }

    @Override
    public int compareTo(MyIntObject o) {
        return this.value - ((MyIntObject) o).value;
    }

    @Override
    public String toString() {
//        System.out.println(value);
        return Integer.toString(value);
    }
}