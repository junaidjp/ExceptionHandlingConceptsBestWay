package com.training.exceptionhandlingmore;

import java.io.IOException;

public class FileDBCaller {
	
	public static void main(String args[]) { 
		
		FileDB fileDb = new FileDB();
		
		String fileContents =null;
		try {
			fileContents = fileDb.getFileContents();
		} catch (IOException e) {
			System.out.println("File was not found");
			e.printStackTrace();
		}
		System.out.println(fileContents);
	}

}

// Today we will learn about the File Handling 
