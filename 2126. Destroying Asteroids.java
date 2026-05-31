//2126. Destroying Asteroids
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int index = 0;
        long masss=mass;
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] <= masss) {
                masss += asteroids[i];
            } else
                return false;
        }
        return true;
    }
}
