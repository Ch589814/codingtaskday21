import java.util.Objects;

public class Pair<K, V> {
    private final K key;
    private final V value;
    //constructor
    public Pair(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null!");
        }
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<K, V> create(K key, V value) {
        return new Pair<>(key, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("(Key: %s, Value: %s)", key, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}