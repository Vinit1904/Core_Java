import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        int x = 4;
        int y = x*x + 3*x - 7;
        System.out.println("Value y = " + y);
        
        x = 2;
        y = x++ + ++x;
        System.out.println("\n\nValue x = " + x + "\nValue y = " + y);
        
        x = 3;
        y = 2;
        int z = x++ - --y - --x  +  x++;
        System.out.println("\n\nValue x = " + x + "\nValue y = " + y + "\nValue z = " + z);
        
        boolean a = true;
        boolean b = false;
        boolean c = a && b || !(a || b);
        System.out.println("\n\nValue x = " + a + "\nValue y = " + b + "\nValue z = " + c);
    }    
}
