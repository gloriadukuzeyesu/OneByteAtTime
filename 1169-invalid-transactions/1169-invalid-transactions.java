class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> invalid = new ArrayList<>();
        Map<String, List<Transaction>>map = new HashMap<>();
        for(String transaction : transactions) {
            Transaction t = new Transaction(transaction); 
            map.putIfAbsent(t.name,new ArrayList<>());
            map.get(t.name).add(t);
        }
        
        for(String transaction : transactions) {
            Transaction t = new Transaction(transaction); 
            if ( !isValid(t,map.getOrDefault(t.name, new ArrayList<>() ))) {
                invalid.add(transaction);
            }  
                         
        }  
        return invalid; 

    }
    
    private boolean isValid(Transaction t, List<Transaction>list) {
        if(t.amount > 1000) {
            return false; 
        }
        for(Transaction k: list) {
            if( Math.abs(t.minutes - k.minutes) <= 60 && !t.city.equals(k.city)) {
                return false; 
            }
        }
        return true; 
    }
    
     class Transaction{
        int amount; 
        int minutes; 
        String name; 
        String city; 
        
        public Transaction(String transaction) {
            String [] splitted = transaction.split(","); 
            this.name = splitted[0];
            this.minutes = Integer.parseInt(splitted[1]); 
            this.amount = Integer.parseInt(splitted[2]);
            this.city = splitted[3]; 
        }
        
    }
}