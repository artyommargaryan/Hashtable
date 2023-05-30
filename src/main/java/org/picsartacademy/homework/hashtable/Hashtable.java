package org.picsartacademy.homework.hashtable;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Hashtable {
    private final List<Pair<String, Integer>>[] array;
    private final int capacity = 1000;

    private int size = 0;

    @SuppressWarnings("unchecked")
    public Hashtable() {
        array = new List[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(String key, int value) {
        int keyHash = hash(key);

        if (array[keyHash] == null) {
            array[keyHash] = new LinkedList<>();
            array[keyHash].add(new Pair<>(key, value));
            ++size;
            return;
        }

        for (Pair<String, Integer> pair : array[keyHash]) {
            if (pair.getKey().equals(key)) {
                pair.value = value;
                return;
            }
        }


        array[keyHash].add(new Pair<>(key, value));
        ++size;
    }

    private int hash(String key) {
        int sum = 0;

        for (int i = 0; i < key.length(); i++) {
            sum += key.charAt(i);
        }

        return sum % capacity;
    }

    public Integer get(String key) {
        int keyHash = hash(key);
        return getValue(array[keyHash], key);
    }

    private Integer getValue(List<Pair<String, Integer>> pairs, String key) {
        if (pairs == null) {
            return null;
        }

        for (var pair : pairs) {
            if (Objects.equals(pair.getKey(), key)) {
                return pair.getValue();
            }
        }
        return null;
    }

    public String[] getKeys() {
        List<String> keys = new LinkedList<>();

        for (List<Pair<String, Integer>> list : array) {
            if (list != null) {
                for (Pair<String, Integer> pair : list) {
                    keys.add(pair.getKey());
                }
            }
        }

        return keys.toArray(new String[0]);
    }

    public Integer[] getValues() {
        List<Integer> values = new LinkedList<>();

        for (List<Pair<String, Integer>> list : array) {
            if (list != null) {
                for (Pair<String, Integer> pair : list) {
                    values.add(pair.getValue());
                }
            }
        }

        return values.toArray(new Integer[0]);
    }

    public static class Pair<K, V> {
        private final K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }
}
