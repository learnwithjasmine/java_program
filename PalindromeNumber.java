public class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number)); 
        
        
    }
}
