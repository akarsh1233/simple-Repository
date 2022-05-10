package Sample_Project.Sample_Project;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.Test;

public class ReadingDatafromCMD {
	@Test(groups = "smoke")
	
	public void readingdatafromcmd() {
	System.out.println("Execute Poll SCM in jenkinc");
	String URL = System.getProperty("url");
	String un = System.getProperty("username");
	String pw =System.getProperty("password");
	System.out.println(URL);
	System.out.println(un);
	System.out.println(pw);
	
	
	}
	@Test(groups = "regression")
	
	public void xy() {
	String kak = System.getProperty("kak");
	System.out.println(kak);
		
		
	

}
}
