package api.utilities;

import java.util.Random;

public class JavaUtility {
	
	public int getRandomNumber() {
		Random ran= new Random();		
		return ran.nextInt(200);
	}
	
	public int getUserIdRandomNumber() {
		Random ran= new Random();		
		return ran.nextInt(1, 12);
	}
	
	public int getPageIdRandomNumber() {
		Random ran= new Random();		
		return ran.nextInt(1, 2);
	}

}
