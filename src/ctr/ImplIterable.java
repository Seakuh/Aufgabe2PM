package ctr;                       

import java.io.File;         
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ImplIterable {

	public static void main(String[] args) {

			String filename = "/tmp/read.me";
			File file=new File(filename);
			Reader reader = new FileReader(file);
			LineReader lines = new LineReader(reader);
			for(String line : lines)
			System.out.println(line);
			for(String line : lines)
			System.out.println(line);
	}

}     































