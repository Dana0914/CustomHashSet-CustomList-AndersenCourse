package hashset;

public class Main {
    public static void main(String[] args) {
        CustomHashSet<String> set = new CustomHashSet<>();
        System.out.println(set.add("A"));
        System.out.println(set.add("B"));
        System.out.println(set.add("C"));
        System.out.println(set.add("W"));
        System.out.println(set.remove("A"));
        System.out.println(set.contains("B"));

        CustomHashSet<Integer> integerSet = new CustomHashSet<>();
        System.out.println(integerSet.add(4));
        System.out.println(integerSet.add(5));
        System.out.println(integerSet.add(6));
        System.out.println(integerSet.remove(4));


    }
}
