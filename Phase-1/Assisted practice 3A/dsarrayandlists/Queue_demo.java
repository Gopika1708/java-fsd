package dsarrayandlists;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_demo {
	
		public static void main(String[] args) 
		{
		        		Queue<String> locationsQueue = new LinkedList<>();
		locationsQueue.add("Kerala");
		        		locationsQueue.add("Chennai");
		        		locationsQueue.add("Bangalore");
		        		locationsQueue.add("Kerala");
		        		locationsQueue.add("Pune");
		System.out.println("Queue is : " + locationsQueue);
		        		System.out.println("Head of Queue : " + locationsQueue.peek());
		        		locationsQueue.remove();
		        		System.out.println("After removing Head of Queue : " + locationsQueue);
		        		System.out.println("Size of Queue : " + locationsQueue.size());
		    	}


}
