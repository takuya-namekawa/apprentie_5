public class chapter_5_1 {
    public static void main(String[] args) {
        //・配列名は、array
        //・要素のデータ型は、int
        //・2 x 3の2次元配列

        //出力結果
        //000
        //000

        int[][] array = new int[2][3];

        for (int[] item : array) {
            for (int num : item) {
                System.out.print(num);
            }
            System.out.println("");
        }
    }
}
