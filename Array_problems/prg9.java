//Checking palindrome using StringBuilder

public class PalindromeCheck {
    public static void main(String[] args) {
        String original = "racecar";
        
        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();
        
        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is NOT a palindrome.");
        }
    }
}
