public class foreach {

    public static void main(String args[]) {
        System.out.println(("null"));
        // System.out.println(getName());

        int nums[] = { 1, 3, 5 };
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (int i : nums) {
            System.out.println(i);
        }

    }

    static String getName() {
        String fname = "sujan";
        return fname;
    }
}
