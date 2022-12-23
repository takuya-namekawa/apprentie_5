public class chapter_5_2 {
    public static void main(String[] args) {
        //この配列の初期値を、全て1にして出力してください。
        //出力結果
        //111
        //111

        int[][] array = new int[2][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++ ) {
                array[i][j] = 1;
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}
