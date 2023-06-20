import ra.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<Integer>();
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(4);
        integerMyList.add(5);
        System.out.println(integerMyList.get(2));
    }
}