import java.util.*;

class Calculate {
    int res;

    void add(int a, int b) {
        res = a + b;
        System.out.println(res);
    }
}
public class Type3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate c = new Calculate();
        int a = 10;
        int b = 20;
        c.add(a,b);
    }
}
