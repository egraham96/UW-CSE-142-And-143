/* Write a method named season that takes two integers as parameters representing a month and day and that returns a String 
indicating the season for that month and day. Assume that months are specified as an integer between 1 and 12 
(1 for January, 2 for February, and so on) and that the day of the month is a number between 1 and 31.

If the date falls between 12/16 and 3/15, you should return "Winter". 
If the date falls between 3/16 and 6/15, you should return "Spring". 
If the date falls between 6/16 and 9/15, you should return "Summer". 
And if the date falls between 9/16 and 12/15, you should return "Fall". */


public static String season(int month, int day) {
    
        if (month == 1 || month == 2 || month == 12 && day >= 16 || month == 3 && day <=15 ){
            return "Winter";
        }else if (month == 4 || month == 5 || month == 6 && day <= 15 || month == 3 && day >= 16){
            return "Spring";
        }else if (month == 7 || month == 8 || month == 6 && day >= 16 || month == 9 && day <= 15){
            return "Summer";
        }else{
            return "Fall";
        }
}