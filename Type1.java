import java.util.*;

class Calculate {
    int a, b, res;

    void add() {
        a = 10;
        b = 20;
        res = a + b;
        System.out.println(res);
    }
}
public class Type1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate c = new Calculate();
        c.add();
    }
}
