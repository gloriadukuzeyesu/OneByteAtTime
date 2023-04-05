package TwoPointers;

public class ValidPalindrome {
    //use two pointers, one from the front and another from the back
    // those pointers will skip over the non-alphanumeric characters
    // and only compare chars after converting them to lowercase
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        char head;
        char tail;
        while (i <= j) {
            head = s.charAt(i);
            tail = s.charAt(j);
            if (!Character.isLetterOrDigit(head)) {
                i++;
            } else if (!Character.isLetterOrDigit(tail)) {
                j--;
            } else {
                if (Character.toLowerCase(head) != Character.toLowerCase(tail)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;

    }
}
