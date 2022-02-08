package newtestingfeb3;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Readconfigfile {
	Properties prop;

	public Readconfigfile() throws IOException {

		FileInputStream fis = new FileInputStream("./data/config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String appURL() {

		return prop.getProperty("URL");

	}

	public String adminUser() {

		return prop.getProperty("username");

	}

	public String adminPassword() {

		return prop.getProperty("password");

	}

}