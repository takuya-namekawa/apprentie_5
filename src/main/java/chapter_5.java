public class chapter_5 {
    public static void main(String[] args) {
        //int[] numberA = {0,1,2,3,4};
        int[] numberA = new int[10];
        for (int i = 0; i < numberA.length; i++) {
            numberA[i] = i;
            System.out.print(numberA[i] + " ");
        }
        System.out.println("");
        System.out.println(numberA.length);
        System.out.println("=====");

        int[][] numberB = new int[2][5];
        for (int i = 0; i < numberB.length; i++) {
            for (int j = 0; j < numberB[i].length; j++) {
                numberB[i][j] = i * 10 + j;
                System.out.print(numberB[i][j] + " ");
            }
            System.out.println("");
            System.out.println("----");
        }
    }
}
