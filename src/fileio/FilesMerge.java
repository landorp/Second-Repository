package fileio;

import java.io.*;
import java.util.*;

public class FilesMerge {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("file.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("input1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("input2.txt"));
		String line1 = br1.readLine();
		String line2 = br2.readLine();
//		HashSet<String> hs = new HashSet<String>();
//		
//		HashSet<String> i1 = new HashSet<String>();
//		HashSet<String> i2 = new HashSet<String>();
//		hs = mergeSet(i1,i2);
		while(line2 != null || line1 != null) {
			if(line1 != null) {
				pw.println(line1);
				line1 = br1.readLine();
			}
			if(line2 != null) {
				pw.println(line2);
				line2 = br2.readLine();
			}
		}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();	
	}
	public static <T> HashSet<T> mergeSet(HashSet<T> i1, HashSet<T> i2){
		Set<T> mergedSet = new HashSet<T>();
		
		mergedSet.addAll(i1);
		mergedSet.addAll(i2);
		
		return (HashSet<T>) mergedSet;
	}
}
