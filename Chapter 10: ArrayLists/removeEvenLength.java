/* Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of the strings of even length from the list. */


public void removeEvenLength (ArrayList <String> input) {
        for (int i = input.size() - 1; i >= 0; i--) {
            if (input.get(i).length() % 2 == 0) {
                input.remove(i);
            }
        }    
}