class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) return triangle; 
        
        List<Integer> firstRow = new ArrayList<>(); 
        firstRow.add(1); 
        triangle.add(firstRow); 
        
        for(int r = 1; r < numRows; r++) {
            List<Integer> row = new ArrayList<>(); 
            // get the prevList 
            List<Integer> prevList = triangle.get(r - 1); 
            row.add(1); // every row start with 1 and ends with 1.
            
            // each row, how many column
            for(int c = 1; c < r; c++) {
                int sum = prevList.get(c - 1) + prevList.get(c); 
                row.add(sum); 
            }
            row.add(1); 
            triangle.add(row); 
       
        }
       return triangle; 
    }
}