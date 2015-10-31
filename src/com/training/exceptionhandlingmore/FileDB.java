package com.training.exceptionhandlingmore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author junaidpasha
 *
 */
public class FileDB {
	
	
	public String getFileContents() throws IOException { 
		
		File file = new File(System.getProperty("user.dir")+"/names.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
		StringBuilder out = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            out.append(line);
        }
        reader.close();
		return out.toString();
		
	}
	
	

}
