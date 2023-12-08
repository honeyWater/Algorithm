package StandardOfJava.ch9;

import static java.lang.Math.*;
import static java.lang.System.*;

public class MathEx1 {
    public static void main(String[] args) {
        double val = 90.7552;
        out.println("round(" + val + ")=" + round(val));                // 반올림 // 91

        val *= 100;
        out.println("round(" + val + ")=" + round(val));                // 반올림 // 9076

        out.println("round(" + val + ")/100 =" + round(val) / 100);     // 반올림 // 90
        out.println("round(" + val + ")/100.0=" + round(val) / 100.0);  // 반올림 // 90.76
        out.println();
        out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1));              // 올림 // 2.0
        out.printf("floor(%3.1f)=%3.1f%n", 1.5, floor(1.5));            // 버림 // 1.0
        out.printf("round(%3.1f)=%d%n", 1.1, round(1.1));               // 반올림 // 1
        out.printf("round(%3.1f)=%d%n", 1.5, round(1.5));               // 반올림 // 2
        out.printf("rint(%3.1f)=%f%n", 1.5, rint(1.5));                 // 반올림 // 2.000000
        out.printf("round(%3.1f)=%d%n", -1.5, round(-1.5));             // 반올림 // -1
        out.printf("rint(%3.1f)=%f%n", -1.5, rint(-1.5));               // 반올림 // -2.000000
        out.printf("ceil(%3.1f)=%f%n", -1.5, ceil(-1.5));               // 올림 // -1.000000
        out.printf("floor(%3.1f)=%f%n", -1.5, floor(-1.5));             // 버림 // -2.000000
    }
}
