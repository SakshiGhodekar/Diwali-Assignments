public class StringLen {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "mango", "kiwi", "orange"};

        int maxLength = 0;

        for (String str : arr) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }

        System.out.println("Longest String length: " + maxLength);
    }
}
