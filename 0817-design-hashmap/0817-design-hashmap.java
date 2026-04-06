class MyHashMap {
    //using Open Addressing (Linear Probing)
    private static final int SIZE = 20011;
    private static final int EMPTY = -1;
    private static final int TOMBSTONE = -2;
    private int[] keys;
    private int[] values;

    public MyHashMap() {
        keys = new int[SIZE];
        values = new int[SIZE];
        Arrays.fill(keys, EMPTY);
    }

    private int hash(int key) {
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        int firstTombStone = -1;
        while (keys[index] != EMPTY) {
            if (keys[index] == key) {
                values[index] = value;
                return;
            }
            if (keys[index] == TOMBSTONE && firstTombStone == -1) {
                firstTombStone = index;
            }
            index = (index + 1) % SIZE;
        }
        if (firstTombStone != -1) {
            index = firstTombStone;
        }
        keys[index] = key;
        values[index] = value;
    }
    
    public int get(int key) {
        int index = hash(key);
        while (keys[index] != EMPTY) {
            if (keys[index] == key) {
                return values[index];
            }
            index = (index + 1) % SIZE;
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);
        while (keys[index] != EMPTY) {
            if (keys[index] == key) {
                keys[index] = TOMBSTONE;
                return;
            }
            index = (index + 1) % SIZE;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */