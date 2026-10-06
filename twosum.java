// two sum problem
// approach 1: nested loop, which is very inefficeint cause it has an time complexity of O(n^2)
// so if the input  size is 10^6 then the total combinations will be around  10^12

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class twosum{
	public static void main(String args[]){

        int nums[] = {10,9,-2,0,5,7,6,15};
        int[] result = new int[2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();


        // approach 1 that is brute force 

        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("brute force approach");
        System.out.println(" ");
        System.out.println(" ");

        boolean app1flag = false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length-1; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = nums[i];
                    result[1] = nums[j];
                    app1flag = true;
                    System.out.println("result array is: "+Arrays.toString(result));
                    //break;
                    
                }
            }
        }
        if(app1flag){
            System.out.println("Combination found");
            // print the results
            // System.out.println("result array is: "+Arrays.toString(result));
        } else {
            System.out.println("No possible combination found");
        }

        // approach 2 that is of hashmap 

        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Hashmap approach");
        System.out.println(" ");
        System.out.println(" ");

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                result[0] = comp;
                result[1] = nums[i];
                System.out.println("Combination found {single}");
                System.out.println("result array is: "+Arrays.toString(result));
            }
            map.put(nums[i],i);
        }
        
    }
}