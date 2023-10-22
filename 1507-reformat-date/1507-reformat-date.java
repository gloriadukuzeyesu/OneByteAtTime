class Solution {
    public String reformatDate(String date) {
        String[] dateSplited = date.split(" ");
        Map<String, Integer> months = new HashMap<>(); 
        months.put("Jan", 1);
        months.put("Feb", 2);
        months.put("Mar", 3);
        months.put("Apr", 4);
        months.put("May", 5);
        months.put("Jun", 6);
        months.put("Jul", 7);
        months.put("Aug", 8);
        months.put("Sep", 9);
        months.put("Oct", 10);
        months.put("Nov", 11);
        months.put("Dec", 12);
        
        StringBuilder sb = new StringBuilder(); 
        
        String dayOriginal = dateSplited[0];
        String day = "";
        for(int i = 0; i < dayOriginal.length(); i++) {
            if(Character.isDigit(dayOriginal.charAt(i))) {
                day += dayOriginal.charAt(i);
            } else{
                break; 
            }
        }
        if(day.length() == 1) {
            day = "0" + day; 
        }
        
       String monthOriginal = dateSplited[1];
       int monthInt = months.get(monthOriginal); 
        String month = "";
        if(monthInt < 10) {
            month = String.valueOf("0" + monthInt); 
        } else {
            month = String.valueOf(monthInt);
        }
        //YYYY-MM-DD
        
        String year = dateSplited[2];
        
        sb.append(year);
        sb.append("-").append(month).append("-").append(day);
        return sb.toString();
    }
}