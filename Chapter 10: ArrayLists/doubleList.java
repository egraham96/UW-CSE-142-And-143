/*  Write a method doubleList that takes an ArrayList of Strings as a parameter and that replaces every string with two of that string. 
For example, if the list stores the values {"how", "are", "you?"} before the method is called, 
it should store the values {"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.
*/


public void doubleList (ArrayList <String> input) {
        for (int i = input.size() - 1; i >= 0; i--) {
            String element = input.get(i);
            input.add(i + 1, element);
        }    
}