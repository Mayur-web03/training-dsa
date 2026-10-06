// Given an array of strings.Determine whether the concantenation of any 2 strings from this array 
// results in a palindrome or not
// i/p {"and","mad","eet","am","xyz"} , o/p true bcoz string mad and am from "madam" which is palindrome
// i/p {"in","par","abc","nit","yre"}, o/p true bcoz string nit & in from "nitin" which is palindrome
// The 1st was forward concatenation whereas the 2nd is backward concantenation 
// i/p {"pac","mand","geyr","poar"} o/p false

class string2 {
    public static void main(String args[]) {

        String str1[] = {"and", "mad", "eet", "am", "xyz"};

        for (int i = 0; i < str1.length; i++) {
            for (int j = i + 1; j < str1.length; j++) {
                String forward = str1[i] + str1[j];

                if (isPalindrome(forward)) {
                    System.out.println("Palindrome: " + forward);
                }
                String backward = str1[j] + str1[i];

                if (isPalindrome(backward)) {
                    System.out.println("Palindrome: " + backward);
                }
            }
        }
    }

    static boolean isPalindrome(String str) {

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
