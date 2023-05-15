class Solution {
    public int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<>(); 
        map.put("M" , 1000);
        map.put("D" , 500);  
        map.put("C" , 100);
        map.put("L" , 50);
        map.put("X" , 10);  
        map.put("V" , 5);
        map.put("I" , 1);

        int N = s.length();
        int i=0;
        int total =0;  
        while(i < N){
            String currentSymbol = s.substring(i,i+1);
            int currentValue = map.get(currentSymbol);
            int nextValue=0;

            if (i+1 < N){
                String nextSymbol = s.substring(i+1, i+2);
                nextValue = map.get(nextSymbol);
            }
            if(currentValue < nextValue){
                total = total + (nextValue - currentValue);
                i+=2;
            } else if(currentValue == nextValue){
                total = total + currentValue+nextValue;
                i+=2;
            }
            else{
                total += currentValue;
                i++;
            }
        }
        return total;  
    }
}