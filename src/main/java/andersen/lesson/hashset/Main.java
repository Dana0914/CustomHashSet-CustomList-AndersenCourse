package andersen.lesson.hashset;

public class Main {
    public static void main(String[] args) {
        CustomHashSet<String> set = new CustomHashSet<>();
        System.out.println(set.add("A"));
        System.out.println(set.add("B"));
        System.out.println(set.add("A"));
        set.remove("A");
        System.out.println(set.contains("A"));




    }
}
