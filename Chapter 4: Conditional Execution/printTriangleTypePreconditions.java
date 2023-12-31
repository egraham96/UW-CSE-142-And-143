/* Consider a method printTriangleType that accepts three integer arguments representing the lengths of the sides of a triangle and prints the type of triangle that these sides form.

public static void printTriangleType(int a, int b, int c) {
    ...
}

The three types are equilateral, isosceles, and scalene. An equilateral triangle has three sides of the same length, an isosceles triangle has two sides that are the same length, 
and a scalene triangle has three sides of different lengths. However, certain integer values (or combinations of values) would be illegal 
and could not represent the sides of an actual triangle. What are these values? 
(In other words, how would you describe the precondition(s) of the printTriangleType method?)

Which of the following are precondition(s) that are appropriate for this method? Check all that apply. */


// No side's length may exceed the sum of any two other side lengths.
// The three side lengths must be positive integers.