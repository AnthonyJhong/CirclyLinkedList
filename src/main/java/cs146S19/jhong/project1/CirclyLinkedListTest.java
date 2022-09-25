package cs146S19.jhong.project1;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * JUnit tester file for CirclyLinkedList tests different values for the number of prisoners inserted
 * and finding the winner within the prisoners of the linked list
 * @author AnthonyJhong
 *
 */

public class CirclyLinkedListTest {

	CirclyLinkedList prisoners;
	
	@Before
	public void setUp(){
		prisoners = new CirclyLinkedList();
	}
	
	
	@Test
	public void professorTest()	{//This test case will test 6 prisoners chosen by every 2
		setUp();
		System.out.println("Professors Tests:");
		System.out.println("Start of test (6 prisoners kill every 2)!");
		
		assertTrue(prisoners.isEmpty());  //Checks if the linked list is empty before inserting
		assertEquals(0,	prisoners.getSize());  //Checks to see if the size of the linked list is 0 before inserting
		
		
		prisoners.insertPrisoners(6); //populates linked list with prisoners 1 - 6
		assertFalse(prisoners.isEmpty());  //Makes sure that the linked list is not empty after inserting
		assertEquals(1, prisoners.findWinner(2)); //Makes sure that findWinner returns the correct value 
		assertEquals(1,prisoners.getSize());  //Checks to see if the size of the linked list is 1
		
		System.out.println("End of (6 prisoners kill every 2) test!\n");
		
		prisoners.emptyList();  //empties linked list
		assertTrue(prisoners.isEmpty());  //Checks if the linked list is empty after emptying
		assertEquals(0,	prisoners.getSize());  //Checks to see if the size of the linked list is 0 after emptying
		
		
		System.out.println("Start of test (1 prisoners kill every 9)!");
		prisoners.insertPrisoners(1);
		assertFalse(prisoners.isEmpty()); //list not empty
		assertEquals(1, prisoners.getSize()); //size is 1
		assertEquals(1, prisoners.findWinner(9));
		System.out.println("End of (1 prisoners kill every 9) test!\n");
		
		prisoners.emptyList();  //empties linked list
		assertTrue(prisoners.isEmpty());  //Checks if the linked list is empty after emptying
		assertEquals(0,	prisoners.getSize());  //Checks to see if the size of the linked list is 0 after emptying
		
		System.out.println("Start of test (7 prisoners kill every 7)!");
		prisoners.insertPrisoners(7);
		assertFalse(prisoners.isEmpty()); //list not empty
		assertEquals(7, prisoners.getSize()); //size is 7
		assertEquals(4, prisoners.findWinner(7));
		System.out.println("End of (7 prisoners kill every 7) test!\n");
		
		prisoners.emptyList();  //empties linked list
		assertTrue(prisoners.isEmpty());  //Checks if the linked list is empty after emptying
		assertEquals(0,	prisoners.getSize());  //Checks to see if the size of the linked list is 0 after emptying
		
		System.out.println("Start of test (12 prisoners kill every 8)!");
		prisoners.insertPrisoners(12);
		assertFalse(prisoners.isEmpty()); //list not empty
		assertEquals(12, prisoners.getSize()); //size is 12
		assertEquals(2, prisoners.findWinner(8));
		System.out.println("End of (12 prisoners kill every 8) test!\n");
	
		prisoners.emptyList();  //empties linked list
		assertTrue(prisoners.isEmpty());  //Checks if the linked list is empty after emptying
		assertEquals(0,	prisoners.getSize());  //Checks to see if the size of the linked list is 0 after emptying
		
		System.out.println("Start of test (5 prisoners kill every 1)!");
		prisoners.insertPrisoners(5);
		assertFalse(prisoners.isEmpty()); //list not empty
		assertEquals(5, prisoners.getSize()); //size is 7
		assertEquals(3, prisoners.findWinner(1));
		System.out.println("End of (5 prisoners kill every 1) test!\n");
	}	
	
	@Test
	public void myTest() {
		setUp();
		
		System.out.println("My Tests");
		System.out.println("Start of test (0 prisoners kill every 5) test");
		
		assertTrue(prisoners.isEmpty()); //ensures that the linked,list is empty upon creation
		assertEquals(0, prisoners.getSize()); //ensures that the size of the linked list is zero upon creation
		
		assertEquals(0, prisoners.findWinner(5)); //makes sure that return value is equal to 0
		
		System.out.println("End of test (0 prisoners kill every 5) test\n");
		
		prisoners.emptyList();  //empties the linked list
		assertTrue(prisoners.isEmpty()); //ensures that the linked,list is empty after emptied
		assertEquals(0, prisoners.getSize()); //ensures that the size of the linked list is zero after emptied
		
		
		System.out.println("Start of test (1 prisoners kill every 10) test");
		
		prisoners.insertPrisoners(1);  //populates linked list with 1 prisoner
		assertFalse(prisoners.isEmpty()); //list not empty
		assertEquals(1, prisoners.getSize()); //size is 1
		
		assertEquals(1, prisoners.findWinner(10)); //correct value is 1
		
		System.out.println("End of test (1 prisoners kill every 10) test\n");
		
		prisoners.emptyList();
		assertTrue(prisoners.isEmpty()); //ensures that the linked,list is empty after emptied
		assertEquals(0, prisoners.getSize()); //ensures that the size of the linked list is zero after emptied
		
		System.out.println("Start of test (3 prisoners kill every 2) test");
		
		prisoners.insertPrisoners(3);    //inserts 3 prisoners
		assertFalse(prisoners.isEmpty()); //list not empty
		assertEquals(3, prisoners.getSize()); //size is 3
		
		assertEquals(2, prisoners.findWinner(2)); //correct value is 2
		
		System.out.println("End of test (3 prisoners kill every 2) test\n");
		
		prisoners.emptyList();
		assertTrue(prisoners.isEmpty()); //ensures that the linked,list is empty after emptied
		assertEquals(0, prisoners.getSize()); //ensures that the size of the linked list is zero after emptied
		
		System.out.println("Start of test (12 prisoners kill every 5) test");
		
		prisoners.insertPrisoners(12);    //inserts 12 prisoners
		assertFalse(prisoners.isEmpty()); //list not empty
		assertEquals(12, prisoners.getSize()); //size is 12
		
		assertEquals(3, prisoners.findWinner(5)); //correct value is 2
		
		System.out.println("End of test (12 prisoners kill every 5) test\n");	
		
		prisoners.emptyList();
		assertTrue(prisoners.isEmpty()); //ensures that the linked,list is empty after emptied
		assertEquals(0, prisoners.getSize()); //ensures that the size of the linked list is zero after emptied
		
		System.out.println("Start of test (9 prisoners kill every 9) test");
		
		prisoners.insertPrisoners(9);    //inserts 9 prisoners
		assertFalse(prisoners.isEmpty()); //list not empty
		assertEquals(9, prisoners.getSize()); //size is 9
		
		assertEquals(8, prisoners.findWinner(9)); //correct value is 2
		
		System.out.println("End of test (9 prisoners kill every 9) test\n");
		
		prisoners.emptyList();
		assertTrue(prisoners.isEmpty()); //ensures that the linked,list is empty after emptied
		assertEquals(0, prisoners.getSize()); //ensures that the size of the linked list is zero after emptied
		
		System.out.println("Start of test (8 prisoners kill every 1) test");
		
		prisoners.insertPrisoners(8);    //inserts 8 prisoners
		assertFalse(prisoners.isEmpty()); //list not empty
		assertEquals(8, prisoners.getSize()); //size is 8
		
		assertEquals(1, prisoners.findWinner(1)); //correct value is 1
		
		System.out.println("End of test (8 prisoners kill every 1) test\n");
		
		prisoners.emptyList();
		assertTrue(prisoners.isEmpty()); //ensures that the linked,list is empty after emptied
		assertEquals(0, prisoners.getSize()); //ensures that the size of the linked list is zero after emptied
		
		System.out.println("Start of test (5 prisoners kill every 3) test");
		
		prisoners.insertPrisoners(5);    //inserts 5 prisoners
		assertFalse(prisoners.isEmpty()); //list not empty
		assertEquals(5, prisoners.getSize()); //size is 5
		
		assertEquals(1, prisoners.findWinner(3)); //correct value is 1
		
		System.out.println("End of test (5 prisoners kill every 3) test\n");
		
		prisoners.emptyList();
		assertTrue(prisoners.isEmpty()); //ensures that the linked,list is empty after emptied
		assertEquals(0, prisoners.getSize()); //ensures that the size of the linked list is zero after emptied
		
		System.out.println("Start of test (13 prisoners kill every 7) test");
		
		prisoners.insertPrisoners(13);    //inserts 5 prisoners
		assertFalse(prisoners.isEmpty()); //list not empty
		assertEquals(13, prisoners.getSize()); //size is 5
		
		assertEquals(13, prisoners.findWinner(7)); //correct value is 1
		
		System.out.println("End of test (13 prisoners kill every 7) test\n");
	}
}
