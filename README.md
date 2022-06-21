# Примеры Java Collection API
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Oracle](https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![collection](https://user-images.githubusercontent.com/58209188/174733474-994d92d4-acf8-4e2c-bf66-585b699243ab.png)

- ArrayList

``` Java
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
    
```
