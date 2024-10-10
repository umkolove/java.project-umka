public class Leet35 {

    public int searchInsert(int[] nums, int target) {
        int a = 0, b = nums.length - 1;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) a = mid + 1;
            else b = mid - 1;
        }
        return a;
    }

    public static void main(String[] args) {
        Leet35 solution = new Leet35();
        int[] nums = {1, 3, 5, 6};
        System.out.println(solution.searchInsert(nums, 5)); // 2
        System.out.println(solution.searchInsert(nums, 2)); // 1
        System.out.println(solution.searchInsert(nums, 7)); // 4
        System.out.println(solution.searchInsert(nums, 0)); // 0
    }
}
