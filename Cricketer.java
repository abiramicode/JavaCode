package Program;


//objects is imp

import java.io.Serializable;

public class Cricketer implements Serializable{
	
	String name;
	int runs;
	String address;
	int strikeRate;
    //transient int strikeRate;
	public Cricketer(String name, int runs, String address, int strikeRate) {
		this.name = name;
		this.runs = runs;
		this.address = address;
		this.strikeRate = strikeRate;
	}
	public void disp()
	{
		System.out.println(name);
		System.out.println(runs);
		System.out.println(address);
		System.out.println(strikeRate);
	}
}