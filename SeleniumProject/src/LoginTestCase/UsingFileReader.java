package LoginTestCase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReader {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		String Location ="UsingBufferWriter.txt";
		
		FileReader file =new FileReader(Location);
		
		BufferedReader Read =new BufferedReader(file);
		//print single line olny in the txt file
		//String readLine = Read.readLine();
		
		//Print All in the txt file 
		String readLine;
		while((readLine = Read.readLine())!=null)
		{
			System.out.println(readLine);
			
		}

	}

}
