class ListNode {
    int val; 
    int key; 
    ListNode next; 
    
    ListNode(int key, int val, ListNode next) {
        this.val = val; 
        this.key = key;
        this.next = next; 
    }
}
class MyHashMap {
    final int capacity = 1000001;
    ListNode[] map ;

    public MyHashMap() {
        map = new ListNode[capacity];
    }
    public int hash(int key) {
        return key % capacity;
    }
    
    public void put(int key, int value) {
        remove(key);
        int index = hash(key);
        ListNode node = new ListNode(key, value, map[index]);
        map[index] = node;  
    }
    
    public int get(int key) {
        int index = hash(key);
        ListNode head = map[index]; 
        while(head != null) {
            if(head.key == key) {
                return head.val;
            }
            head = head.next; 
        }
        return -1; 
    }
    
    public void remove(int key) {
        int index = hash(key); 
        ListNode curr = map[key]; 
        if(curr == null) {
            return; 
        }
        // case when the first node is the one to be removed. 
        if(curr.key == key) {
            map[index] = curr.next;
            return; 
        }
        
        ListNode prev = curr;
        curr = curr.next;
        
        while(curr != null) {
            if(curr.key == key) {
                prev.next = curr.next; 
                return;
            }
            prev = curr; 
            curr = curr.next; 
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