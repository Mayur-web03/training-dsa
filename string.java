// In java strings are not treated as array of characters like in C/C++ & hence do not support 
// indexing operation it is a class in java and hence string is an object type.
// IMP Methods of this class are 
// 1.lenth() ->Returns number of characters in given string
// 2. charAt() -> Returns the character at given position in string using base 0
// eg String s = "Indira College";
// s.length() = 14 s[0] = error 
// s.charAt(0) -> i , s.charAt(1) -> n
// toCharArray() - To convert String into an array of characters 
// char arr[] = s.toCharArray();
// arr[o] -> j , arr[1] -> n
// 4) equals() -> To compare data of 2 strings do not use == operator becoz with objects 

class StringCheck {
    public static void main(String args[]) {
        System.out.println("hello world");

        String S1 = "abcdef";
        String S2 = "aef";

        int small = 0;
        int big = 0;

        while (small < S1.length() && big < S2.length()) {
            if (S1.charAt(small) == S2.charAt(big)) {
                big++;
            }
            small++;
        }

        if (big == S2.length()) {
            System.out.println("S2 is a subsequence of S1");
        } else {
            System.out.println("S2 is not a subsequence of S1");
        }
    }
}
