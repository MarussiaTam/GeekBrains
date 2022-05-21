package Second;

import java.security.cert.X509Certificate;

public class HomeWorkApp2 {
    private static String[] arg;

    public static void main(String [] args) {
    System.out.println(FirstMethod(1, 13));
    SecondMethod();
    System.out.println(ThirdMethod(85));
    FourthMethod();
    System.out.println(FiveMethod(2090));

}
    public static boolean FirstMethod(int A, int B) {
        int sum = A + B;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void SecondMethod() {
        int C = 9;
        if (C >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }

    public static boolean ThirdMethod(int D) {
        if (D >= 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void FourthMethod() {
        String str = "";
        int times = 6;
        for (int i = 0; i < times; i++) {
            str += "1";
            System.out.println("[" + i + "]" + " " + str);
        }
    }
    public static boolean FiveMethod(int Y) {
        if ((Y % 4 == 0 && Y % 100 != 0)|| Y % 400 == 0) {
            return true;
        } else {
            return false; }
    }
}
