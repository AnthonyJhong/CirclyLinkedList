package cs146S19.jhong.project1;

import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import java.util.Random;

/**
 * WorkingAtMusicBeat class has functions that will read an input file and load songs into an array
 * shuffle the songs in the array, and write the songs into an output file
 * written to another text file
 * @author AnthonyJhong
 * @version 1.0 2/12/2019
 */

public class WorkingAtMusicBest {
	private String songs[]; //Array of songs 
	
	public WorkingAtMusicBest(){
		songs = new String[459];
	}
	/**
	 * Reads the file and loads the songs into an array
	 * @throws FileNotFoundException
	 */
	public void readFile() throws FileNotFoundException {
		
		//Scanner used to read in all the songs in the "Playlist.txt" file
				Scanner reader = new Scanner(new File("C:\\Users\\antho\\IdeaProjects\\CirclyLinkedList\\src\\main\\java\\cs146S19\\jhong\\project1\\Playlist.txt"), "UTF-8");
				//This long holds the start time of the execution
				long startTime = System.currentTimeMillis();
				
				
				//The following code will read the file and load the songs into the ArrayList
				for(int i =0; i < songs.length; i++) {
					songs[i] = reader.nextLine();
				}
				
				System.out.println("The time it took to read the songs into the array: "  + 
						(System.currentTimeMillis() - startTime));
				
				reader.close();

	}
	/**
	 * Iterates through the array of songs and writes each song to an output file
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	public void loadFile() throws FileNotFoundException, UnsupportedEncodingException {
		long startTime = System.currentTimeMillis();
		
		//This PrintWriter will be used to write all the songs to an output file
		PrintWriter writer = new PrintWriter(new File("C:\\Users\\antho\\IdeaProjects\\CirclyLinkedList\\src\\main\\java\\cs146S19\\jhong\\project1\\JhongAnthonyPlaylist.txt"), "UTF-8");
		
		//For loop will iterate through the ArrayList and write each song to Output.txt
		for(int i = 0; i < songs.length; i++) {
			writer.println(songs[i]);
		}
		
		System.out.println("The time it took to load the songs into JhongAnthonyPlaylist.txt: "  + 
				(System.currentTimeMillis() - startTime));
		
		writer.close(); //closes the print writer	
	}
	
	/**
	 * Shuffles all the songs in array using Fisher-Yates Shuffle Algorithm
	 */
	public void shuffler() {
		long startTime = System.currentTimeMillis();
		//Random variable that will allow me to generate random numbers
		Random rand = new Random();
		rand.setSeed(20);   //Set the seed of the random number generator
				
		//The code in this for loop will sort the ArrayList of songs into a random order
		for(int i = songs.length - 1; i > 0; i --) {
			//Temporary Variable that will be used to hold the name of a song
			String tempSong = "";
			//Integer value that stores the value of the random number generated
			int randIndex = rand.nextInt(i);	//random number generated using nextInt();
			
			//This will exchange the positions of the two songs
			tempSong = songs[randIndex];
			songs[randIndex] = songs[i];
			songs[i] = tempSong;
		}
		System.out.println("The time it took to shuffle the songs: "  + 
				(System.currentTimeMillis() - startTime));
	}
}
