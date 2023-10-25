class Node {
    int key;
    int val;
    Node next; 
    Node prev;
}
class LRUCache {
    Map<Integer, Node> map; 
    Node head = new Node();
    Node tail = new Node();
    int capacity;

    public LRUCache(int capacite) {
        map = new HashMap<>(capacite);
        head.next = tail;
        tail.prev = head; 
        this.capacity = capacite;
    }
    
    public int get(int key) {
        int result  = -1;
        Node node = map.get(key); 
        if(node != null) {
            result = node.val;
            remove(node);
            add(node); 
        }
        return result; 
    }
    
    private void add (Node node) {
        Node headNext = head.next; 
        head.next = node;
        node.prev = head; 
        node.next = headNext;
        headNext.prev = node; 
        
    }
    private void remove (Node node) {
        Node nodeNext = node.next; 
        Node nodePrev = node.prev; 
        
        nodePrev.next = nodeNext; 
        nodeNext.prev = nodePrev; 
       
    }
    public void put(int key, int value) {
       Node curr = map.get(key); 
        if(curr != null) {
           remove(curr);
           curr.val = value;
           add(curr);
        } else {
            if(map.size() == capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev); 
            }
            // create a new node
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;
            
            // put in the map
            map.put(key, newNode);
            add(newNode); // add it to the list. 
        }
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */