package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry<K,V>> entries;

    public TableNested() {
        this.entries = new ArrayList<>();
    }

    public class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

    }

    public V get (K key){
        for (Entry entry : entries){
            if (entry.getKey().equals(key)){
                return (V) entry.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value){
        Entry<K,V> entry = new Entry<>(key, value);
        if (get(key) == null) {
            entries.add(entry);
        } else {
            remove(key);
            entries.add(entry);
        }
    }

    public void remove(K key){
        for (Entry entry : entries){
            if (entry.getKey().equals(key)){
                entries.remove(entry);
                break;
            }
        }
    }
}
