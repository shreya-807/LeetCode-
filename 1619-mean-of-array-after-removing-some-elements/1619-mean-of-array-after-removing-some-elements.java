class Solution {
    public double trimMean(int[] arr) {
        int remove= arr.length/20;
        Arrays.sort(arr);
        double count=0;
        double sum=0;
        for(int i=remove;i<arr.length-remove;i++){
            sum+=arr[i]; count++;

        }
        return sum/count;
    }
}