class MyHashSet {
    Set<Integer> myHashSet;
    public MyHashSet() {
         myHashSet=new HashSet<>();
    }
    public void add(int key) {
        myHashSet.add(key);
    }
    
    public void remove(int key) {
        myHashSet.remove(key);
    }
    
    public boolean contains(int key) {
        return myHashSet.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */