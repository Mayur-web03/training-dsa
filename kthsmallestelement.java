
import java.util.PriorityQueue;
import java.util.Collections;
class kthsmallestelement{
    public static void main(String args[]){
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
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