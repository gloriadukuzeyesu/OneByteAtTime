class Solution {
    public String reformatDate(String date) {
        String[] dateSplited = date.split(" ");
        StringBuilder sb = new StringBuilder();  
        String dayOg = dateSplited[0];
        String day = dayOg.length() == 3 ? ("0" + dayOg.substring(0, 1)) : dayOg.substring(0, 2); 
        sb.append(dateSplited[2]).append("-").append(getMonth(dateSplited[1])).append("-").append(day);
        return sb.toString();
    }
    
    public String getMonth(String month) {
        Map<String, String> months = new HashMap<>(); 
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        return months.get(month); 
    }
}