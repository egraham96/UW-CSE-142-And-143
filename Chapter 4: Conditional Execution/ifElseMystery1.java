/* Consider the following method.

public static void ifElseMystery1(int x, int y) {
    int z = 4;
    if (z <= x) { 
        z = x + 1; 
    } else { 
        z = z + 9; 
    } 
    if (z <= y) { 
        y++; 
    } 
    System.out.println(z + " " + y); 
}
For each call below, indicate what output is produced. */


/*
ifElseMystery(3, 20) : 13 21
ifElseMystery(4, 5) : 5 6
ifElseMystery(5, 5) : 6 5
ifElseMystery(6, 10) : 7 11
*/