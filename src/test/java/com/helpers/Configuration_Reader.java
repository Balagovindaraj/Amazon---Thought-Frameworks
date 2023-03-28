package com.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public Properties p;

	public Configuration_Reader() throws Throwable {
		// TODO Auto-generated constructor stub
		File f = new File("D:\\Eclipse\\Eclipse Workspace\\Adactin\\src\\test\\java\\com\\helpers\\data.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getBrowser() {
		// TODO Auto-generated method stub
		String property = p.getProperty("browser");

		return property;
	}

	public String getUrl() {
		// TODO Auto-generated method stub
		String property = p.getProperty("url");
		return property;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		String property = p.getProperty("username");
		return property;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		String property = p.getProperty("password");
		return property;
	}
}
