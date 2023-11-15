/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int i = 0; 

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       // pre order
        // Root -> left -> right
       List<String> listOfvals = new ArrayList<>(); 
       preOrder(root, listOfvals); 
       StringBuilder sb = new StringBuilder(); 
       for( String val : listOfvals) {
           sb.append(val).append(","); 
       }
        System.out.println(sb.toString()); 
       return sb.toString(); 
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // "1,2,N, N"
        String[] vals = data.split(","); 
        for(String x : vals) {
            System.out.print(x + " "); 
        }
       return deserializeDFS(vals); 
    }
    
    public TreeNode deserializeDFS(String[] vals) {
        if(vals == null) {
            return null; 
        }
        String val = vals[i]; 
        if(val.equals("N")) {
            i++; 
            return null; 
        }
        TreeNode node = new TreeNode(Integer.parseInt(val)); 
        i++; 
        node.left = deserializeDFS(vals); 
        node.right = deserializeDFS(vals); 
        return node; 
    }
        
    public void preOrder(TreeNode root, List<String> listOfvals) {
        if(root == null) {
            listOfvals.add("N"); 
            return; 
        }
        
        listOfvals.add(root.val + ""); 
        preOrder(root.left, listOfvals); 
        preOrder(root.right, listOfvals);      
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));