import java.util.*;

class Calculate {
    int a, b, res;

    int add() {
        a = 10;
        b = 20;
        res = a + b;
        return res;
    }
}
public class Type2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate c = new Calculate();
        int res = c.add();
        System.out.println(res);
    }
}
