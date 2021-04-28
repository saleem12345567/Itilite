package Itilite_makemytrip_genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class Fileutility {


	public String getPropertykeyValue(String key) throws Throwable {	
		FileInputStream fis= new FileInputStream("E:/ItiliteMakemytrip/src/Testdata/makemytrip.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		}

	public static void main(String[] args) throws Throwable {
		System.out.println(new Fileutility().getPropertykeyValue("browser"));
		System.out.println(new Fileutility().getPropertykeyValue("url"));
		System.out.println(new Fileutility().getPropertykeyValue("username"));
		System.out.println(new Fileutility().getPropertykeyValue("password"));
		
		

	}
}
