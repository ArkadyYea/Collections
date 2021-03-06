package colls.queue;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

public class PriorityQueueTest2 {
	
	//							  Insert / Remove / Examine 
	//Throws exception 			-> add(e) remove() element() 
	//Returns special value  	-> offer(e) poll() peek() 
	
	public static void main(String[] args) {
		PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
		pq.add(new GregorianCalendar(1906, Calendar.DECEMBER, 9)); // G. Hopper
		pq.add(new GregorianCalendar(1815, Calendar.DECEMBER, 10)); // A. Lovelace
		pq.add(new GregorianCalendar(1910, Calendar.JUNE, 22)); // K. Zuse
		pq.add(new GregorianCalendar(1903, Calendar.DECEMBER, 3)); // J. von Neumann

		System.out.println("Iterating over elements...");
		for (GregorianCalendar date : pq)
			System.out.println(date.get(Calendar.YEAR));
		
		System.out.println("Removing elements...");
		while (!pq.isEmpty()) 
			System.out.println(pq.remove().get(Calendar.YEAR));
	}
}
