package mproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Text {

	public static void main(String[] args) throws IOException {
		
		File file = new File("H://testing.txt");
		String contents = new Scanner(file).useDelimiter("\\Z").next();
		System.out.print(contents);

	}

}
