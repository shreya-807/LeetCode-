//1338. Reduce Array Size to The Half
class Solution {
    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> c = new ArrayList<>();
        int n = arr.length;
        if (n == 2)
            return 1;
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1])
                count++;
            else {
                c.add(count);
                count = 1;
            }
        }
        c.add(count);
        Collections.sort(c);
        Collections.reverse(c);
        count = 0;
        n = arr.length;
        int minsize = n / 2;
        int i = 0;

        while (n > minsize) {
            n = n - c.get(i);
            i++;
            count++;
        }
        return count;
    }
}
