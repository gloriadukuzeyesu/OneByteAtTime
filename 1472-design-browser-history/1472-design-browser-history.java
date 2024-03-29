class BrowserHistory {
    DDListNode head; 
    DDListNode current; 

    public BrowserHistory(String homepage) {
        head = new DDListNode(homepage); 
        current = head; 
        
    }
    
    public void visit(String url) {
        DDListNode newNode = new DDListNode(url); 
        current.next = newNode; 
        newNode.prev = current;
        // update the current to be the newNode
        current = newNode; 
    }
    
    public String back(int steps) {
        while(steps != 0 && current.prev != null) {
            current = current.prev; 
            steps--; 
        }
        return current.val; 
    }
    
    public String forward(int steps) {
        while(steps != 0 && current.next != null) {
            current = current.next;
            steps--; 
        }
        return current.val; 
    }
}

class DDListNode {
    DDListNode next; 
    DDListNode prev; 
    String val; 
    public DDListNode(String url) {
        this.val = url; 
        this.next = null;
        this.prev = null; 
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */