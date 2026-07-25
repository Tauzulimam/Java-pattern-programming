//Checking palimdrom in case of string

public class PalindromeCheck {
    public static void main(String[] args) {
        String text = "racecar";
        
        boolean isPalindrome = isPalindrome(text);
        System.out.println(text + " is palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        
        return true; 
    }
}
