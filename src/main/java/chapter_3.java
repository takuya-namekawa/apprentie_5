public class chapter_3 {
    public static void main(String[] args) {
        String[] teamA = {"勇者", "戦士", "魔法使い"};
        String[] teamB = {"盗賊", "忍者", "小人"};
        String[] teamC = {"スライム", "ドラゴン", "魔王"};

        String[][] teams = {{"勇者", "戦士"}, {"盗賊", "忍者", "小人"}, {"スライム", "ドラゴン", "魔王"}};

        System.out.print(teams[2][0] + ",");
        System.out.print(teams[2][1] + ",");
        System.out.print(teams[2][2]);
        System.out.println("");
        System.out.println("-------");


        teams[2][2] = "ドロップボックス";
        System.out.print(teams[2][0] + ",");
        System.out.print(teams[2][1] + ",");
        System.out.print(teams[2][2] + ",");
        System.out.println("");
        System.out.println("------");


        System.out.println(teams.length);
        System.out.println(teams[0].length);


    }
}
