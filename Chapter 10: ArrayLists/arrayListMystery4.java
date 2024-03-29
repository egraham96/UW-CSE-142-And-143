/* Consider the following method:

public static void mystery4(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
        int element = list.get(i);
        list.remove(i);
        list.add(0, element + 1);
    }
    System.out.println(list);
}

Write the output produced by the method when passed each of the following ArrayLists:


/*
[10, 20, 30] : [72, 20]
[8, 2, 9, 7, 4] : [5, 8, 10, 3, 9]
[-1, 3, 28, 17, 9, 33] : [34, 10, 18, 29, 4,0]
*/