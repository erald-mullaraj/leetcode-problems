package Easy;

class MyHashSet {

    boolean[] s;

    public MyHashSet() {
        s = new boolean[(int)1e6 + 1];
    }
    
    public void add(int key) {
        s[key] = true;
    }
    
    public void remove(int key) {
        s[key] = false;
    }
    
    public boolean contains(int key) {
        return s[key];
    }
}


