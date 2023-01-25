import java.util.Scanner;

public class SchoolMath {
    private static Scanner scan = new Scanner(System.in);
    private static int a, b, c;
    private static boolean x, y;

    public static void main(String[] args) {
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        // а + вх + су
        x = false;
        y = false;


        String str = "";
        boolean hasCf = false;

        if (a != 0) {
            hasCf = true;
            str += a;
        }
        if (b != 0) {
            if (b > 0 && hasCf)
                str += "+";
            if (b < 0)
                str += "-";
            if (Math.abs(b) != 1)
                str += Math.abs(b);
            str += "x";
            hasCf = true;
        }

        if (c != 0) {
            if (c > 0 && hasCf)
                str += "+";
            if (c < 0)
                str += "-";
            if (Math.abs(c) != 1)
                str += Math.abs(c);
            str += "y";
            hasCf = true;
        }
        if (!hasCf)
            str += "0";

        System.out.println(str);

    }
}
