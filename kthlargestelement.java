// Determine the kth largest element from given array of integers without sorting arrays 
//Hint - use priority queue to store the elements of array
// Logic - Add one by one elements from array into priority queue If the size of priority 
// exceeds k then poll the root, then 
// poll the root continue these steps till all elements from
import java.util.PriorityQueue;
class kthlargestelement{
    public static void main(String args[]){
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int nums[] = {1,5,6,4,3,2,8,5,7};
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println("Kth largest element is:"+pq.peek());
    }
}