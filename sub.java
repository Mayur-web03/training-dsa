// print all subsequencces
// like abc -> abc,ab,bc,ac,a,b,c

// empty string "" divide it inot left and right
//              " "
//  (exclude) /     \
//            /      \(include)
//        "    "     " a"
//                   /     \
//                  "a"    "ab" (Refer github it has image this is algo for this q)

//                               ""
//                               |
//                        ---------------
//                     E |               | I
//                      ""                "a"
//                       |                 |
//                     ----              ----------
//                   E|    |I           E|        |I
//                  ""      "b"        "a"       "ab"
//                  |        |         |          |
//                ------    ------     -----    ------
//                |    |    |    |     |   |    |    |
//               ""   "c"  "b"  "bc"  "a" "ac" "ab" "abc"
// TC (2^n)
class allsubseq{
    public static void main(String args[]){
        String str = "mayur";
        System.out.println("Given String is:"+str);
        printSS(s,0,"");
    }
    static void printSS(String str,int index,String ss){
        //base case - condition to terminate recursion
        if(index==str.length()){
            System.out.println(ss);
            return;
        }

        // include part means concatenate the char @ current index & proceed
        printSS(str.index+1,ss+str.charAt(index));

        // exclude part means ignore the char @ current index & proceed
        printSS(str,index+1,ss);

    }
}
