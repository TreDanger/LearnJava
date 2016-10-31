package com.example.FileSearch;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import com.sun.java_cup.internal.runtime.Scanner;
//import java.util.Scanner;

public class FileSearchApp {
	String path;
	String regex;
	String zipFileName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSearchApp app = new FileSearchApp();
		
		switch( Math.min(args.length, 3)) {
		case 0:
			System.out.println("USAGE: FileSearchApp path [regex] [zipfile]");
			return;
		case 3: app.setZipFileName(args[2]);
		case 2: app.setRegex(args[1]); 
		case 1: app.setPath(args[0]);
		}
		
		try {
			app.walkDirectoryJava6(app.getPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void walkDirectory(String path) {
		System.out.println("walkDirectory: " + path);
		searchFile(null);
		addFileToZip(null);
	}
	
	public boolean searchFile(File file) {
		System.out.println("searchFile: " + file);
		return true;
	}
	
	public void addFileToZip(File file){
		System.out.println("addFileToZip: " + file);
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public String getZipFileName() {
		return zipFileName;
	}

	public void setZipFileName(String zipFileName) {
		this.zipFileName = zipFileName;
	}

	public void processFile(File file){
		if ( searchFile(file) ) {
			addFileToZip(file);
		}
	}

	
/**
	public boolean searchFileJava6(File file) throws FileNotFoundException {
		boolean found = false;
		Scanner scanner = new Scanner(file, "UTF-8");
		while (scanner.hasNextLine()) {
			found = searchText(scanner.nextLine()); // THis method is defined elsewhere in tutorial... may not compile
			if (found) {break; }
		}
		scanner.close();
		return found;
	}
*/
	
	public void walkDirectoryJava6(String path) throws IOException {
		File dir = new File(path);
		File[] files = dir.listFiles();
		
		for (File file : files) {
			if (file.isDirectory()) {
				walkDirectoryJava6(file.getAbsolutePath());
			} else {
				processFile(file);
			}
		}
	}
	
}

