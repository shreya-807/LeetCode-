//941. Valid Mountain Array
class Solution {
    public boolean validMountainArray(int[] arr) {
        int incind = 0;
        if (arr.length <= 2)
            return false;
        if (arr[0] > arr[1])
            return false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                incind = i + 1;
            else
                break;
        }
        if (incind == arr.length - 1)
            return false;
        for (int i = incind; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                continue;
            else
                return false;
        }
        return true;
    }
}
