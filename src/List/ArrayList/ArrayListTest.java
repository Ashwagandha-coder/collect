package List.ArrayList;

import java.util.ArrayList;

public class ArrayListTest {

    private ArrayList<Integer> arrayList = new ArrayList<>();

    public void example() {

        // add()

        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(67);

        System.out.println(arrayList);

        // remove()

        arrayList.remove(0);

        System.out.println(arrayList);

        // get()

        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));


        // contains()

        boolean value = arrayList.contains(5);

        System.out.println(value);

    }


}
