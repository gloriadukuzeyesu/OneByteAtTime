/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Set<Node> track = new HashSet<>(); 
        while(p != null && track.add(p)) {
            p = p.parent; 
        }
        
        while(q != null && !track.contains(q)) {
            q = q.parent; 
        }
        return q; 
    }
}