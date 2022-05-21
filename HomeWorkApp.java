package First;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    private static void checkSumSign() {
        int varA = 16;
        int varB = 4;
        System.out.println(varA + varB);
        if (varA + varB >= 0) {
            System.out.println("Сумма положительная");
        } else if (varA + varB < 0) {
            System.out.println("Сумма отрицательная");
        }

    }
    private static void printColor() {
        int value = -1234;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers() {
        int varC = 17;
        int varD = 71;
        if (varC >= varD) {
            System.out.println("a>=b");
        } else if (varC < varD) {
            System.out.println("a<b");
        }
    }

}
