/* Assume that you have a variable called line that will take on the values 1, 2, 3, 4, and so on, and a class constant named SIZE that takes two values. 
You are going to formulate expressions in terms of line and SIZE that will yield different sequences of numbers of characters. 
The first row is filled in for you as an example. Fill in the solution boxes below, indicating an expression that will generate each sequence. 
Your answers must be in the exact format 'coefficient1 * line + (coefficient2 * SIZE + offset)' in that order to be counted as correct.

Problem #	line value	            SIZE value	 Number of characters	      Expression
            1, 2, 3, 4, 5, 6, ...   1            4, 6, 8, 10, 12, 14, ...     2 * line + (2 * SIZE)
            1, 2, 3, 4, 5, 6, ...	2            6, 8, 10, 12, 14, 16, ...	

1	        1, 2, 3, 4, 5, 6, ...   3            13, 17, 21, 25, 29, 33, ...
            1, 2, 3, 4, 5, 6, ...	5            19, 23, 27, 31, 35, 39, ...

2	        1, 2, 3, 4, 5, 6, ...   4            10, 9, 8, 7, 6, 5, ...
            1, 2, 3, 4, 5, 6, ...	9            20, 19, 18, 17, 16, 15, ...	 
*/


/*
1 : 4 * line + (3 * SIZE)
2 : -1 * line + (2 * SIZE + 3)
*/
