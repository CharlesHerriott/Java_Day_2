package week_two_j_beginner;

import java.util.ArrayList;

public class Functionality {
	
	private Calculator cal = new Calculator();
	
	private Records Charlie = new Records(45, 80, 50, "Charlie");
	private Records Bloke = new Records(60, 55, 45, "Bloke");
	private Records b = new Records(45, 80, 50, "Charlie");
	private Records d = new Records(60, 55, 45, "Bloke");
	private Records e = new Records(45, 80, 50, "Charlie");
	private Records f = new Records(60, 55, 45, "Bloke");
	
	
	ArrayList<Records> recordList = new ArrayList<Records>();
	
	

	public void doStuff() {
		
		recordList.add(Bloke);
		recordList.add(Charlie);
		recordList.add(b);
		recordList.add(d);
		recordList.add(e);
		recordList.add(f);
		
		
		for (int i =0; i < recordList.size(); i++) {
			cal.displayResults(recordList.get(i));
						
		}
		
		
		
	}
}
