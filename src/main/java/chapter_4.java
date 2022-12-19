public class chapter_4 {
    public static void main(String[] args) {
        String[][] teams = {{"勇者", "戦士", "魔法使い"}, {"盗賊", "忍者", "小人"}, {"スライム", "ドラゴン", "魔王"}};

        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                System.out.print(teams[i][j]);
                System.out.print(i);
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println("");
            System.out.println("------");
        }

        for (String[] team : teams) {
            for (String player : team) {
                System.out.print(player + " ");
            }
            System.out.println("");
            System.out.println("-------------");
        }
    }
}
