class MRUQueue {
    Node head, tail; 

    public MRUQueue(int n) {
        head = new Node(); 
        Node node = head;
        for(int i = 1; i <= n; i++) {
            node.next = new Node(i); 
            node = node.next;
        }
        tail = node;    
    }
    
    public int fetch(int k) {
        Node prev = null; 
        Node curr = head; 
        for (int i = 1; i <= k ; i++) {
            prev = curr; 
            curr = curr.next;
        }
        int val = curr.val;
        
        tail.next = curr;
        tail = tail.next;
        
        prev.next = curr.next;
        curr.next = null;
        
        return val;
    }
}

class Node {
    int val;
    Node next; 
    Node(){};
    Node(int val) {
      this.val = val;   
    }
}

/**
 * Your MRUQueue object will be instantiated and called as such:
 * MRUQueue obj = new MRUQueue(n);
 * int param_1 = obj.fetch(k);
 */