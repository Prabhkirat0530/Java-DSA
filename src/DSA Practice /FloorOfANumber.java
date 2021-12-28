public class FloorOfANumber {
    public static void main(String[] args) {
        //Array need to be sorted in order for binary search to work
        int[] arr = { -18, -12, -5, 0, 2, 3, 4, 15, 16, 18, 22, 48 };
        int target = 17;
        int ans = Floor(arr,target);
        System.out.println(ans);
    }

    static int Floor(int[] arr, int target){        //Similar to Binary code

        //if target is last element in the array
        if(target > arr[arr.length] - 1){
            return -1;
        }

        //Start and end pointers
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            // For descending order array, target and arr argument will be reversed
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        //greatest no which is <= target
        return end;
    }
}
