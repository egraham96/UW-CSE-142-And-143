/* Write a complete Java program in a class named EggStop that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

  ______
 /      \
/        \
\        /
 \______/

  ______
 /      \
/        \
\        /
 \______/
+--------+

  ______
 /      \
/        \
|  STOP  |
\        /
 \______/
+--------+
*/


public class EggStop {
    public static void main(String[] args){
        shape();
        System.out.println();
        shape();
        line();
        System.out.println();
        top();
        System.out.println("|  STOP  |");
        bottom();
        line();
        
    }
    public static void top() {
        System.out.println("  ______");
        System.out.println(" /      \\ ");
        System.out.println("/        \\");
    }
    public static void line() {
        System.out.println("+--------+");
    }
    public static void bottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/"); 
    }
    public static void shape() {
        top();
        bottom(); 
    }
}
