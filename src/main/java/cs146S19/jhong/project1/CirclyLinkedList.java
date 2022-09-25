package cs146S19.jhong.project1;

/**
 * CirclyLinkedList implements a linked list where the tail points to the head
 * Made for the games of prisoners 
 * @author AnthonyJhong
 * @version 1.0 2/13/2017
 */
public class CirclyLinkedList {
	class Node{
		//This holds the data of the node
		int data;
		//Pointer to the next node in the linked list
		Node next;
		/**
		 * Constructor of Node sets the data of the node
		 * @param setData value of the data that needs to be set
		 */
		public Node(int sData){
			data = sData;
		}
	}
	private Node head; //the first node of the linked list
	private Node tail; //the last node of the linked list points to the head
	private int size;
	
	/**
	 * Constructor of CirclyLinkedList sets the value of head to null and sets the size to zero
	 */
	public CirclyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	/**
	 * Returns the size of the LinekdList
	 */
	public int getSize() {
		return size;
	}
	/**
	 * This method will add a node at the end of the linked list
	 * @param data
	 */
	public void insertatEnd(int data) {
		
		Node insertingNode = new Node(data); //new node that will be inserted to the end of the linked list
		
		//inserts the node at the head if the linked list is empty
		if(this.isEmpty()) {
			head = insertingNode;
			tail = insertingNode;
			size ++;
		}
		//inserts the node at the end of the linked list
		else {
			tail.next = insertingNode;
			tail = tail.next;
			tail.next  = head;
			size++;
		}
	}
	
	/**
	 * Deletes a specified node in the linked list
	 * @param prisonerData data of the node that needs to be deleted
	 * @return the data that was contained in the deleted node
	 */
	public void deleteNode(int prisonerData) {
		
		long startingTime = System.currentTimeMillis(); //gets the start time of the method
		
		//checks if the linked list is empty
		if(this.isEmpty())
			return;
		
		Node prev = head;    //views the node previous to the one we are currently viewing
		Node current = head; //stores the current node we are viewing
		
		//only runs if the head is the node being deleted
		if(prisonerData == head.data) {
			head = head.next;
			tail.next = head;
			size--;
		}
		//only runs if the tail is the node being deleted
		else if (tail.data == prisonerData) {
			while(current !=tail) {
				prev = current;
				current = current.next;
			}
			tail = prev;
			tail.next = head;
			size--;
		}
		//deletes the node from anywhere
		else {
			while(current != tail) {
				if(current.data == prisonerData) {
					prev.next = current.next;
					current = current.next.next;
					size--;
				}
				
				prev = current;
				current = current.next;
			}
		}
		
		//Prints time it takes to delete a single prisoner
		System.out.println("The time it took to delete prisoner " + prisonerData +
				" took " + (System.currentTimeMillis() - startingTime) + " Milliseconds");
		
	}
	/**
	 * This method will populate the CirclyLinkedList with prisoners
	 * @param numberOfPrisoners number of prisoners that will populate LinkedList
	 */
	public void insertPrisoners(int numberOfPrisoners) {
		
		long startingTime = System.currentTimeMillis();//The start time of the linked list being populated
		//populates the linked list with nodes (how many prisoners are added)
		for(int i = 1; i <= numberOfPrisoners; i++) {
			insertatEnd(i);
		}
		
		//prints the time it takes to populate the entire linked list with n prisoners
		System.out.println("The time it took to populate the linked list with " + numberOfPrisoners +
				" took " + (System.currentTimeMillis() - startingTime) + " Milliseconds");	
	}
	
	/**
	 * This method will delete prisoners from the CirclyLinkedList by counting 
	 * @param number to jump by
	 * @return number of the prisoner who won
	 */
	public int findWinner(int number) {
		
		long startingTime = System.currentTimeMillis(); //gets the start time of the method
		
		if(head == null) {
			//Prints how long it took to find the winner
			System.out.println("The time that it took to find the winner of the prisoner game is " +
					"took " + (System.currentTimeMillis() - startingTime) + " Milliseconds");
			return 0;
		}
		
		Node temp = head;		//place holder for when current is deleted
		Node currentNode = head;//place holder of where we are in the linked list
		
		//this gets the node that will be deleted and stops before deleting the head
		while(size != 1) {
			for(int i = 0; i < number; i++) {
				currentNode = currentNode.next;
			}
			temp = currentNode;
			currentNode = currentNode.next;
			deleteNode(temp.data);
		}
		
		//Prints how long it took to find the winner
		System.out.println("The time that it took to find the winner of the prisoner game is " +
				"took " + (System.currentTimeMillis() - startingTime) + " Milliseconds");
		return head.data;
	}
	
	/**
	 * Empties the CirclyLinkedList
	 */
	public void emptyList() {
		head = null;
		size = 0;
	}
	
	/**
	 * Returns whether or not the current CirclyLinkedList is empty or not
	 * @return boolean 
	 */
	public boolean isEmpty() {
		if(head == null)
			return true;
		else 
			return false;
	}
}
