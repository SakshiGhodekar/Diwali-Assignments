public class CheckAlphanumeric {
    public static void main(String[] args) {
        String str = "Hello123";
        boolean isAlphanumeric = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                isAlphanumeric = false;
                break;
            }
        }

        if (isAlphanumeric)
            System.out.println("String is alphanumeric");
        else
            System.out.println("String is NOT alphanumeric");
    }
}
