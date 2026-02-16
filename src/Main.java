public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        Pair<Integer, String> pair2 = new Pair<>(404, "Not Found");

        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);
        System.out.println("\n--------------- Using Static Factory Method ----------------\n");

        Pair<String, String> pair3 = Pair.create("Status", "Active");
        Pair<Integer, Double> pair4 = Pair.create(1, 99.99);

        System.out.println("Pair 3: " + pair3);
        System.out.println("Pair 4: " + pair4);
    }
}