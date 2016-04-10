package utils;
/*
 * utilities
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
	public static  String loadFileAsString(String path) {
		StringBuilder builder = new StringBuilder();
		
		try{
			BufferedReader bReader = new BufferedReader(new FileReader(path));
			String line;
			while ((line = bReader.readLine())!=null) {
				builder.append(line + "\n");
				
			}
			bReader.close();
		}catch(IOException exception){
			exception.printStackTrace();
		}
		
		return builder.toString();
	}
	
	
	public static int parseInt(String number) {
		try {
			return Integer.parseInt(number);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
