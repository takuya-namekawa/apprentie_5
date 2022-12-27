public class chapter_8 {
    public static void main(String[] args) {
        String[][] worldMap = new String[10][20];
        worldMap[0][0] = "城";
        worldMap[0][19] = "町";
        worldMap[9][19] = "町";

        for (int i = 0; i < worldMap.length; i++){
            for (int j = 0; j < worldMap[i].length; j++) {
                if (worldMap[i][j] == null) {
                    worldMap[i][j] = "森";
                }
                System.out.print(worldMap[i][j]);
            }
            System.out.println("");
        }
    }
}
