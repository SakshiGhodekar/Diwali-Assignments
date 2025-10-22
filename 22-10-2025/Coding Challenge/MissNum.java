public class MissNum {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4, 5}; 
        int n = arr.length; 

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);
    }
}
