import java.util.*;

class Calculate {
    int res;

    int add(int a, int b) {
        res = a + b;
        return res;
    }
}
public class Type4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate c = new Calculate();
        int a = 10;
        int b = 20;
        int res = c.add(a,b);
        System.out.println(res);
    }
}
