/* Write a method maxLength that takes an ArrayList of Strings as a parameter 
and that returns the length of the longest string in the list.  If your method is passed an empty list, it should return 0. */


public static int maxLength (ArrayList <String> input) {
    
        int max = 0;
        
        for (int i = 0; i < input.size(); i++) {
            int currentLength = (input.get(i)).length();
            if (currentLength > max) {
                max = currentLength;
            }
            
        }
        return max;
        
}