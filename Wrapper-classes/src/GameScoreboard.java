public class GameScoreboard {

        public static void main(String[] args) {
            Integer[] scores = {50, null, 75, null, 100, 25};
            int notPlayed = 0;
            int total = 0;

            for (Integer score : scores) {
                if (score == null) {
                    notPlayed++;
                } else {
                    total += score;
                }
            }

            System.out.println(notPlayed);
            System.out.println(total);
        }

}
