public class QuickSort {
    public static void main(String[] args) {
        int nums[] = new int[] { 2, 1, 3, 5, 6, 4 };
        int n = nums.length;
        Quicksort(nums, 0, n-1);
        for (int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");

    }

    public static void Quicksort(int nums[], int start, int end) {
        if (start < end) {
            int j = partition(nums,start,end);
            Quicksort(nums, start, j);
            Quicksort(nums, j + 1, end);
        }
    }

    public static int partition(int nums[],int start, int end) {
        int pivot = nums[start];
        int i = start;
        int j = end;
        while (i < j) {
            do {
                i++;
            } while (nums[i] <= pivot);
            do {
                j--;
            } while (nums[j] > pivot);
            if (i < j) {
                swap(nums, nums[i], nums[j]);
            }
        }
        swap(nums, nums[j], nums[start]);
        return j;
    }

    public static void swap(int nums[], int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}