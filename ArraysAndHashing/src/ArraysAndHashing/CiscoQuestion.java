package ArraysAndHashing;

public class CiscoQuestion {

    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    product = product * nums[j];
                }
            }
            output[i] = product;
        }
        return output;
    }

    public static int[] productExceptSelfOp(int[] nums) {
        int[] output = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= product;
            product *= nums[i];
        }
        return output;
    }

    public static int addFun (int n) {
        if (n <= 0)
            return 0;
        if(n == 1)
            return 2;
        return addFun(n - 1) + addFun( n- 2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("origin nums");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println("\nproductExceptSelf ");
        int[] output = productExceptSelf(nums);
        for (int i : output) {
            System.out.print(i + " ");
        }

        int[] nums1 = {1, 2, 3, 4};

        System.out.println("\nproductExceptSelf optimized ");
        int []outPutOpt = productExceptSelfOp(nums1);
        for (int i : outPutOpt) {
            System.out.print(i + " ");
        }


        var t = addFun(6);
        System.out.println("var " + t);


    }
}
