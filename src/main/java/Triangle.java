public class Triangle {
    public static void testTriangle(int a, int b, int c) {
        int m;
        if (a + b <= c || b + c <= a || c + a <= b)
            m = (1/0);
    }

    public static boolean equilateral(int a, int b, int c) {
        Triangle.testTriangle(a, b, c);
        if (a == b && b == c) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean isosceles(int a, int b, int c) {
        Triangle.testTriangle(a, b, c);
        if (a == b || b == c || c == a) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean scalene(int a, int b, int c) {
        Triangle.testTriangle(a, b, c);
        if (!(a == b && b == c && c == a)) {
            return true;
        } else {
            return false;
        }
    }
}
