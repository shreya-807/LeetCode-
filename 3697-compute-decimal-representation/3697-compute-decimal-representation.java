class Solution {
    public int[] decimalRepresentation(int n) {
        int count = 10;
        ArrayList<Integer> list = new ArrayList<>();
         if (n % 10 != 0)
        {list.add(n % 10);}
        n /= 10;
        while (n > 0) {
            if (n % 10 != 0) {
                list.add((n % 10) * count);
                n /= 10;
                count *= 10;
            } else {
                n /= 10;
                count *= 10;
            }

        }
        Collections.reverse(list);
      int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}