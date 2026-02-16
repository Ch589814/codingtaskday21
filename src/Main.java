public class Main {
    public static void main(String[] args) {
        //Create pairs using constructor
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        Pair<Integer, String> pair2 = new Pair<>(404, "Not Found");
        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);

        //Test static factory method
        System.out.println("\n--------------- Using Static Factory Method ----------------\n");
        Pair<String, String> pair3 = Pair.create("Status", "Active");
        Pair<Integer, Double> pair4 = Pair.create(1, 99.99);
        System.out.println("Pair 3: " + pair3);
        System.out.println("Pair 4: " + pair4);

        //Test getter methods
        System.out.println("\n------------  Testing Getters ------------\n");
        System.out.println("Pair 1 Key: " + pair1.getKey());
        System.out.println("Pair 1 Value: " + pair1.getValue());

        //Test equals method
        System.out.println("\n-------------- Testing Equality --------------\n");
        Pair<String, Integer> pair5 = new Pair<>("Age", 25);
        System.out.println("pair1 equals pair5: " + pair1.equals(pair5));
        System.out.println("pair1 equals pair2: " + pair1.equals(pair2));

        //Test hashCode method
        System.out.println("\n------------------Testing Hash Codes --------------\n");
        System.out.println("pair1 hashCode: " + pair1.hashCode());
        System.out.println("pair5 hashCode: " + pair5.hashCode());
        System.out.println("Same hash code: " + (pair1.hashCode() == pair5.hashCode()));

         // Test null key validation
        try {
            Pair<String, Integer> invalidPair = new Pair<>(null, 100);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}