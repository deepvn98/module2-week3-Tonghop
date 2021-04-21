import java.util.Comparator;

public class MyComparatorForAge implements Comparator<Persion> {

    @Override
    public int compare(Persion o1, Persion o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
