class Solution {
    public int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getMax(arr, i+1);
        }

        return arr;
    }

    public int getMax(int[] arr, int start) {
        
        if (arr.length == start) {
            return -1;
        }

        int max = arr[start];
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}