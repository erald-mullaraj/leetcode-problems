package Easy;

class LNode {
    int key;
    int val;
    LNode next;
    public LNode(int key, int val, LNode next){
        this.key = key;
        this.val = val;
        this.next = next;
    }
}
class MyHashMap {

    public static void main(String[] args){
        MyHashMap m = new MyHashMap();
        m.put(10, 1234);
        m.put(151514, 1234);
        int par = m.get(151514);
        System.out.println(par);
        m.remove(10);
    }

    int s = 1727;
    int rn = 2134321;
    LNode[] l;
    public MyHashMap() {
        this.l = new LNode[s];
    }

    public int mix(int key){
        return (int)((long)key * rn % s);
    }
        
    public void put(int key, int value) {
         remove(key);
         int m = mix(key);
         LNode ln = new LNode(key, value, l[m]);
         l[m] = ln;
    }
    
    public int get(int key) {
        int m = mix(key);
        LNode ln = l[m];
        for(;ln != null; ln = ln.next){
            if(ln.key == key) return ln.val;
        }
        return -1;
    }
    
    public void remove(int key) {
        int m = mix(key);
        LNode ln = l[m];
        if(ln == null) return;
        if(ln.key == key){
            l[m] = ln.next;
        } 
        else {
            for (;ln.next != null; ln = ln.next){
            if (ln.next.key == key){
                ln.next = ln.next.next;
                return;
                }
            }
        }
    }
}

