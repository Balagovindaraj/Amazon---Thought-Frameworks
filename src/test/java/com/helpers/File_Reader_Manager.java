package com.helpers;

public class File_Reader_Manager {

	private File_Reader_Manager() {
		// TODO Auto-generated constructor stub
	}

	public static File_Reader_Manager getInstance() {
		// TODO Auto-generated method stub
		File_Reader_Manager f = new File_Reader_Manager();

		return f;

	}

	public static Configuration_Reader getInstanceCR() throws Throwable {
		// TODO Auto-generated method stub
		Configuration_Reader c = new Configuration_Reader();

		return c;
	}

}
