package ctr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Test {
	//Main
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "C:\\Users\\Dizzle\\WorkSpaces\\Eclipse\\Informatik1\\Readme.me";
		File file = new File(filename);
		Reader reader = new FileReader(file);
		LineReader lines = new LineReader(reader);
		for (String line : lines)
			System.out.println(line);
		for (String line : lines)
			System.out.println(line);
		
        String str = "ls"; 
        
        StringReader stringReader = new StringReader(str); 
        
        int ch = 0; 

		
		
        for (int i = 0; i < 5; i++) { 
            try {
				ch = stringReader.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
            System.out.println("\nInteger value "
                               + "of character read: "
                               + ch); 
            System.out.println("Actual "
                               + "character read: "
                               + (char)ch); 
        } 
		
		
		
	}

}
