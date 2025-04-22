public class Main {
    public static void main(String[] args) {


        TestHashMap<Integer, String> map = new TestHashMap<>();
        map.put(1, "One");
        map.put(1, "DUP_One");
        map.put(2, "Two");
        map.put(null, null);


        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(100));
    }
}