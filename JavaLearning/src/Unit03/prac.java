package Unit03;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class prac {
	public static void main(String[] args) throws IOException {
		String s;
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("temp1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Writing into file char by char");
		System.out.println("Enter your name");
		s = sc.nextLine();
		char ch[];
		ch = s.toCharArray();
		bw.write(ch);
		bw.close();
		fw.close();

		FileOutputStream fos = new FileOutputStream("temp2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte by[];
		System.out.println("Writing into file byte by byte");
		System.out.println("Enter your name");
		s = sc.nextLine();
		by = s.getBytes();
		bos.write(by);
		bos.close();
		fos.close();

	}
}