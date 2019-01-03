package com.Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

// boolean offer(Object o)   :- To add an object into queue
// Object peak()	:- To head element of the queue. if queue is empty then this method return null
// Object element() :- To return head element of the queue. If queue is empty then  this method raise 
// Object poll() 	:- To remove and return head element of the queue. If queue is empty then this method return null 
// Object remove()	:- If queue is empty then this method raise RE: NoSuchElementException

// Insertion order is not preserved and it is based on some priority
// Duplicates object are not allowed
// If we are depending on default natural sorting order then object should be homogeneous and comparable 
// If we are defining our own sorting order then object not need to be homogeneous
// null is not allowed even first element also

public class PriorityQueueDemo {
	
	public static void main(String[] args) {

	//	PriorityQueue queue = new PriorityQueue(int initialCapacity);
	//	PriorityQueue queue = new PriorityQueue(int initialCapacity, Comparator c);
	//  PriorityQueue queue = new PriorityQueue(SortedSet set);
	//	PriorityQueue queue = new PriorityQueue(Collection c);
		
		Queue queue = new PriorityQueue();
		
		for (int i = 0; i < 10; i++) {
			queue.offer(i);
		}
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}