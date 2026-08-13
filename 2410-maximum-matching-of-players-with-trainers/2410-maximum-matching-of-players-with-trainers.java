class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int j = 0;
        int count = 0;
        for (int i = 0; i < players.length; i++) {
            while (j < trainers.length) {
                if (trainers[j] >= players[i]) {
                    count++;
                    j++;
                    break;
                } else
                    j++;

            }
        }
        return count;
    }
}