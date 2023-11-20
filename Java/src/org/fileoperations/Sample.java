package org.fileoperations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Sample {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Arockia\\java files");
		boolean mkdir = file.mkdir();
		System.out.println(mkdir);
		File file2 = new File("C:\\Users\\Arockia\\java files\\java.txt");
		boolean createNewFile = file2.createNewFile();
		System.out.println(createNewFile);
		File file3 = new File("C:\\Users\\Arockia\\java files\\java.txt");
		FileUtils.write(file3, "java has a file operations" + "\n" + "it has methods to create directory and new files"
				+ "\n" + "we can also modify the data present within a file", false);
	}

}
