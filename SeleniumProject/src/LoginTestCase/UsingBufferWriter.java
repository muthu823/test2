package LoginTestCase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class UsingBufferWriter {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		String Location ="UsingBufferWriter.txt";
		String content="Amudhesh is a Good Boy";
		
		FileWriter write =new FileWriter(Location);
		
		BufferedWriter file =new BufferedWriter(write);
		
		file.write(content);
		
		file.close();
		
	
		
		
		
	
		
		

	}

}
