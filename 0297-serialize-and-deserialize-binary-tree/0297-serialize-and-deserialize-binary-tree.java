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
    private int index = 0; 

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        // preOrder Root left right 
        List<String> list = new ArrayList<>(); 
        StringBuilder sb = new StringBuilder(); 
        preOrder(root, list); 
        for(String str : list) {
            sb.append(str).append("#"); 
        }
        System.out.println(sb.toString()); 
        return sb.toString(); 
    }
    public void preOrder(TreeNode root,  List<String>list) {
        if(root == null) {
            list.add("N"); 
            return; 
        }
        list.add(root.val + ""); 
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] vals = data.split("#");
        System.out.println(Arrays.toString(vals)); 
        return deserializeDfs(vals); 
    }
    public TreeNode deserializeDfs(String[] vals) {
        if(vals == null) return null; 
        String val = vals[index]; 
        if(val.equals("N")) {
            index++; 
            return null;  
        }
        TreeNode node = new TreeNode(Integer.parseInt(val)); 
        index++; 
        node.left = deserializeDfs(vals); 
        node.right = deserializeDfs(vals);  
        return node; 
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));