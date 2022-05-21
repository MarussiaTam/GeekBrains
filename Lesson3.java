public class Lesson3 {

        public static void main(String[] ards) {
            FirstArray();
            SecondArray();
            ThirdArray();
            FourthArray();
            FifthArray(1, 2);


        }

        private static void FifthArray(int len, int initialValue) {
            int[] data5 = new int[len];
            for (int i = 0; i < len; i++) {
                data5[i] = initialValue;
                System.out.print(i + data5[i] + " ");

            }

        }


        private static void FourthArray() {
            int[][] data4 = new int[5][5];
            for (int i = 0; i < data4.length; i++) {
                for (int j = 0; j < data4.length; j++) {
                    if (data4[i] == data4[j]) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                    System.out.print("\n");

                }

            }
        }

        private static void ThirdArray() {
            int[] data3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < data3.length; i++) {
                if (data3[i] < 6) {
                    System.out.print(data3[i] * 2 + " ");
                } else {
                    System.out.print(data3[i] + " ");
                }
            }
        }

        private static void SecondArray() {
            int[] data2 = new int[100];
            for (int i = 0; i < data2.length; i++) {
                data2[i] = i; {
                    System.out.println(data2[i] + 1);
                }

            }
        }

        private static void FirstArray() {
            int[] data = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < data.length; i++) {
                if (data[i] == 0) {
                    System.out.print(data[i] + 1 + " ");
                } else {
                    System.out.print(data[i] - 1 + " ");
                }
            }
        }
    }


