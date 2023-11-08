class UndergroundSystem {
    Map<Integer, ArrivalInfo> checkIntrack; // [id, [id, stationName, t]]
    Map<String, double[]> totals; // 

    public UndergroundSystem() {
        checkIntrack = new HashMap<>(); 
        totals = new HashMap<>();  
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIntrack.put(id, new ArrivalInfo(stationName, t));  
    }
    
    public void checkOut(int id, String stationName, int t) {
        ArrivalInfo info = checkIntrack.get(id); 
        String src = info.stationName;
        String key = src + "_" + stationName;
        int tripTime = t - info.time; 
        double[] pair = totals.getOrDefault(key, new double[2]); 
        pair[0] += tripTime;
        pair[1]++;
        totals.put(key, pair); 
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "_" + endStation; 
        double[] pair = totals.get(key); 
        return pair[0] / pair [1]; 
    }
}

// Custom object 
public class ArrivalInfo{
    // int id; 
    String stationName; 
    int time; 
    public ArrivalInfo(String stationName, int time) {
        // this.id = id; 
        this.stationName = stationName;
        this.time = time; 
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */