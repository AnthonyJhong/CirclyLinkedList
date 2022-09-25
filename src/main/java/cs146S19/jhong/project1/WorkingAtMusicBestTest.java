package cs146S19.jhong.project1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * JUnit tester file for WorkingAtMusicBest reads both the output file and the file
 * that contains the correct answers comparing both
 * @author AnthonyJhong
 *
 */

public class WorkingAtMusicBestTest {

	String expectedOutput;
	BufferedReader out;
	BufferedReader in;
	WorkingAtMusicBest tester;
	
	@Before
	public void setUp() throws FileNotFoundException{
		tester = new WorkingAtMusicBest();
	}
	
	@Test
	public void test() throws IOException {
		setUp();
		tester.readFile();
		tester.shuffler();
		tester.loadFile();
		
		out = new BufferedReader(new FileReader("C:\\Users\\antho\\IdeaProjects\\CirclyLinkedList\\src\\main\\java\\cs146S19\\jhong\\project1\\JhongAnthonyPlaylist.txt"));
		in = new BufferedReader(new FileReader("C:\\Users\\antho\\IdeaProjects\\CirclyLinkedList\\src\\main\\java\\cs146S19\\jhong\\project1\\Target2.txt"));
	
		while((expectedOutput = in.readLine()) != null)	{
			String actualLine = out.readLine();
			assertEquals(expectedOutput, actualLine);
		 }
		
		out.close();
		in.close();
	}

}
