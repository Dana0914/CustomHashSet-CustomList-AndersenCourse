package andersen.lesson.main;

import andersen.lesson.arraylist.List;
import andersen.lesson.hashset.CustomHashSet;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.add(0, "ggb");
        list.add(1, "ydg");
        list.add(2, "gn");
        list.add(3, "fv");
        list.add(4, "fgbf");
        list.add(5, "fgg");
        list.add(6, "ggg");
        list.add(7, "ggg");
        list.add(8, "ggg");
        list.add(9, "ggg");
        list.add(10, "ggg");
        System.out.println(list.get(4));
        list.remove(10);
        System.out.println(list.size());

        CustomHashSet<String> set = new CustomHashSet<>();
        System.out.println(set.add("A"));
        System.out.println(set.add("B"));
        System.out.println(set.add("A"));
        set.remove("A");
        System.out.println(set.contains("A"));
    }
}
