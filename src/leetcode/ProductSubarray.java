package leetcode;

import org.junit.Test;

/**
 * @author zhangyu
 * @version V1.0
 * @ClassName: ProductSubarray
 * @Description: zhangyu
 * @date 2018/12/24 11:14
 **/


public class ProductSubarray {
    @Test
    public void fun() {
        int nums[] = {2, 3, -2, 4};
        int product = maxProduct(nums);
        System.out.println(product);
    }

    private int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }
}
