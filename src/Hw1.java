import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Hw1 {
	public static void main (String args[]){
		System.out.println("Homework 1 by Kyle Coleman");
		
		try {
			Scanner s1 = new Scanner (new File("input.txt"));
			boolean printIt = false;
			
			while (true) {
				String newLine = s1.nextLine();
				StringTokenizer t1 = new StringTokenizer(newLine, "\n");
				String st1 = t1.nextToken();
				boolean c= false;
				Scanner s2 = new Scanner (newLine);
				String newWord = s2.next();
				StringTokenizer t2 = new StringTokenizer(st1, " ,.");
				while (t2.hasMoreTokens()) {
					String st2 = t2.nextToken();
					if (st2.equals("end")) {
						System.out.println(st1 + " ");
						System.exit(0);
					}
					if (st2.equals("print")) {
						printIt = true;
					}	
					if (printIt == true) {
						if (!(st2.equals("print"))) {
							System.out.print(st2 + " ");
						}
					}
				}
				System.out.println("");
			}
		}
		catch (Exception e) {
			System.out.println("");
			}		
	}
}
