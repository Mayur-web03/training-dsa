// To prove that by default priority queue implements Min Heap. This means the elements
// in priority 
// Queue are ordered by min heap but during deletion they are deleted in ASC order 
import java.util.PriorityQueue;
class queue{
    public static void main(String args[]){
        PriorityQueue<integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(3);
        pq.offer(8);
        pq.offer(2);
        pq.offer(4);
        System.out.print("pq contains"+pq); //2 3 8 5 4
        //delete the elements one by one they wil be removed in ASC ordering
        System.out.println("Deleting elements from pq");
        while(!pq.isEmpty()){
            System.out.println(pq.poll()+ " "); //2 3 4 5 8
        }
    }
}
