package semestr1.practice05;


public class Task4DotaMatchStats {
    public static void main(String[] args) {
        String[] heroes = {"Pudge", "Invoker", "Juggernaut", "Crystal Maiden", "Earthshaker"};
        int[] kills    = {8, 12, 10, 2, 4};
        int[] deaths   = {6, 3, 2, 9, 5};
        int[] assists  = {14, 9, 8, 18, 16};
        int[] networth = {14500, 21200, 24800, 9800, 12300};

        double[] kdaRatios = new double[5];
        for (int i = 0; i < 5; i++) {
            int d = deaths[i];
            if (d == 0) {
                d = 1;
            }
            kdaRatios[i] = (double) (kills[i] + assists[i]) / d;
        }

        int totalKills = 0;
        int totalNetWorth = 0;
        for (int i = 0; i < 5; i++) {
            totalKills += kills[i];
            totalNetWorth += networth[i];
        }

        double[] kp = new double[5];
        for (int i = 0; i < 5; i++) {
            kp[i] = (double) (kills[i] + assists[i]) / totalKills * 100;
        }

        int mvpIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (kdaRatios[i] > kdaRatios[mvpIndex]) {
                mvpIndex = i;
            }
        }

        System.out.println("========================================================================");
        System.out.println("                      DOTA 2: POST-MATCH REPORT");
        System.out.println("========================================================================");
        System.out.println("Герой            | K / D / A  | Net Worth | KDA Ratio | Kill Participation");
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            String name = heroes[i];
            while (name.length() < 15) {
                name += " ";
            }

            String kda = kills[i] + " / " + deaths[i] + " / " + assists[i];
            while (kda.length() < 10) {
                kda += " ";
            }

            int thousands = networth[i] / 1000;
            int rest = networth[i] % 1000;
            String restStr = "" + rest;
            while (restStr.length() < 3) {
                restStr = "0" + restStr;
            }
            String money = thousands + "," + restStr;
            while (money.length() < 9) {
                money += " ";
            }

            int kdaCents = (int) Math.round(kdaRatios[i] * 100);
            String kdaFrac = "" + (kdaCents % 100);
            if (kdaCents % 100 < 10) {
                kdaFrac = "0" + kdaFrac;
            }
            String kdaStr = (kdaCents / 100) + "." + kdaFrac;
            while (kdaStr.length() < 9) {
                kdaStr += " ";
            }

            int kpCents = (int) Math.round(kp[i] * 100);
            String kpFrac = "" + (kpCents % 100);
            if (kpCents % 100 < 10) {
                kpFrac = "0" + kpFrac;
            }
            String kpStr = (kpCents / 100) + "." + kpFrac + "%";

            System.out.println(name + " | " + kda + " | " + money + " | " + kdaStr + " | " + kpStr);
        }

        System.out.println("------------------------------------------------------------------------");

        int totalThousands = totalNetWorth / 1000;
        int totalRest = totalNetWorth % 1000;
        String totalRestStr = "" + totalRest;
        while (totalRestStr.length() < 3) {
            totalRestStr = "0" + totalRestStr;
        }

        int mvpCents = (int) Math.round(kdaRatios[mvpIndex] * 100);
        String mvpFrac = "" + (mvpCents % 100);
        if (mvpCents % 100 < 10) {
            mvpFrac = "0" + mvpFrac;
        }

        System.out.println("Загальна кількість вбивств команди: " + totalKills);
        System.out.println("Сумарний Net Worth команди:         " + totalThousands + "," + totalRestStr + " золота");
        System.out.println("НАЙКРАЩИЙ ГРАВЕЦЬ МАТЧУ (MVP):      " + heroes[mvpIndex] + " (KDA: " + (mvpCents / 100) + "." + mvpFrac + ")");
        System.out.println("========================================================================");
    }
}