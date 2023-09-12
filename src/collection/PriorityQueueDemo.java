package collection;
import java.util.Queue;
import java.util.*;
public class PriorityQueueDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*Queue q= new  PriorityQueue();
		q.add(9);
		q.add(7);
		q.add(8);
		q.add(6);
		q.add(4);
		System.out.println(q);
		System.out.println(q);*/
		Demo d=new Demo();
		Queue queue=d.call();
		System.out.println(queue);
	}

}
class Demo
{
	Queue<Integer> queue= new  PriorityQueue();
	public Queue call()
	{
		return queue;
	}
}