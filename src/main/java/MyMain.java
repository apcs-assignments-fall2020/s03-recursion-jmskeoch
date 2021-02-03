public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        if(x < 1) {return 0;} 
        else {return (x % 10) + addDigits(x / 10);}
    }

    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        if(str.length() <= 1) {
            return true;
        }
        else if(str.charAt(0) == str.charAt(str.length()-1)) {
            return isPalindrome(str.substring(1, str.length()-1));
        } 
        else {
            return false;
        }
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        if(str.length() <= 1) {return str;}
        else {
            return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
        }
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
