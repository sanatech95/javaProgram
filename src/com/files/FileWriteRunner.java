package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToWrite = Paths.get("./resources/file-write.txt");
		
	 
		List<String> list = List.of("Good Morning all!!!", "I hope you all are okay..", "and enjoy the work",
				"If u faces any issue then call me.... ");

		// List<String> list = List.of("Apple", "Bat", "Cat", "Rat");

		Files.write(pathFileToWrite, list);
	}

}
