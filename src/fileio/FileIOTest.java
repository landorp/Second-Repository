package fileio;

import java.io.*;
import java.util.*;

public class FileIOTest {

	public static <T> void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("outputfile.txt");
		BufferedReader br = new BufferedReader(new FileReader("inputfile.txt"));
		String line = br.readLine();
		HashSet<String> hs = new HashSet<String>();
		
		while(line != null) {
			if(hs.add(line)) {
				pw.println(line);
			}
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}

}
