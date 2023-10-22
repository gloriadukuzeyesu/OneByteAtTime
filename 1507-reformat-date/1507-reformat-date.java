class Solution {
    public String reformatDate(String date) {
        String[] dateSplited = date.split(" ");
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
        
        StringBuilder sb = new StringBuilder(); 
        
       //sb.append(ss[0].length() == 3 ? ("0" + ss[0].substring(0, 1)) : ss[0].substring(0, 2));
        

        String dayOg = dateSplited[0];
        String day = dayOg.length() == 3 ? ("0" + dayOg.substring(0, 1)) : dayOg.substring(0, 2); 
            
//        = "";
//         for(int i = 0; i < dayOriginal.length(); i++) {
//             if(Character.isDigit(dayOriginal.charAt(i))) {
//                 day += dayOriginal.charAt(i);
//             } else{
//                 break; 
//             }
//         }
//         if(day.length() == 1) {
//             day = "0" + day; 
//         }
        
       String monthOriginal = dateSplited[1];
       String month = months.get(monthOriginal); 
    
        String year = dateSplited[2];
        sb.append(year).append("-").append(month).append("-").append(day);
        return sb.toString();
    }
}