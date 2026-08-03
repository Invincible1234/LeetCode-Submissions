class MyHashSet {
    static final int M = 769;//const number.
    LinkedList<Integer>[] b;//a linked list for the queue.
    public MyHashSet() {
        b = new LinkedList[M];//size
        for(int i = 0; i < M; i++){//loop
            b[i] = new LinkedList<>();//every element up until M into a new list.
        }
    }

    int h(int key){
        return Math.floorMod(key, M);//math function.
    }
    
    public void add(int key) {
        LinkedList<Integer> q = b[h(key)];//add to the q.
        if(!q.contains(key)){//if it doesn't contain it
            q.addFirst(key);//contain it.
        }
    }
    
    public void remove(int key) {
        b[h(key)].remove((Integer)key);//remove it.
    }
    
    public boolean contains(int key) {
        return b[h(key)].contains(key);//check if it contains.
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */