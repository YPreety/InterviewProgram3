package GeneralProgramming;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class ListOfAllFiles1 {

	public static void main(String[] args) {
		// 1. File.list() Method Example :
		File folder = new File("F:/Path");
		String[] files = folder.list();
		for (String file : files) {
			System.out.println(file);
		}

		// 2. File.listFiles() Method Example :
		File folder1 = new File("F:/Path");
		File[] files1 = folder1.listFiles();
		for (File file1 : files1) {
			System.out.println(file1.getName());
		}

		// 3. File.listFiles(FilenameFilter filter) Method Example :
		// Implementing FilenameFilter to retrieve only txt files
		File folder2 = new File("C:/Path");
		FilenameFilter txtFileFilter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.endsWith(".txt")) {
					return true;
				} else {
					return false;
				}
			}
		};
		File[] files2 = folder.listFiles(txtFileFilter);
		for (File file2 : files2) {
			System.out.println(file2.getName());
		}

		// 4. File.listFiles(FileFilter filter) Method Example : Implementing
		// FileFilter to retrieve the files smaller than 10MB
		File folder3 = new File("C:/Path");
		FileFilter sizeFilter = new FileFilter() {
			@Override
			public boolean accept(File file3) {
				if (file3.length() < 10 * 1024 * 1024) {
					return true;
				} else {
					return false;
				}
			}
		};

		// 5. Passing sizeFilter to listFiles() method
		File[] files4 = folder.listFiles(sizeFilter);
		for (File file4 : files4) {
			System.out.println(file4.getName());
		}
	}

}
