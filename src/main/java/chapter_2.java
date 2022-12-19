public class chapter_2 {
    public static void main(String[] args) {
        String player = "盗賊";
        String[] teamA = {player, "戦士", "魔法使い"};
        System.out.print(teamA[0] + ",");
        System.out.print(teamA[1] + ",");
        System.out.print(teamA[2]);
        System.out.println("");
        System.out.println("------");


        String[] teamB = {teamA[0], teamA[1], teamA[2]};
        System.out.print(teamB[0] + ",");
        System.out.print(teamB[1] + ",");
        System.out.print(teamB[2]);
        System.out.println("");
        System.out.println("-------");

        String[] teamC = {"勇者", "戦士", "魔法使い"};
        String[] teamD = {"盗賊", "忍者", "商人"};
        String[] teamE = {"スライム", "ドラゴン", "魔王"};

        String[][] teams = {teamC, teamD, teamE};
        System.out.print(teams[0][0] + ",");
        System.out.print(teams[0][1] + ",");
        System.out.print(teams[0][2]);
        System.out.println("");
        System.out.println("------");

    }
}
