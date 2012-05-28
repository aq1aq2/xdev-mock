package dn.servicemix.example.entity;

public class ModelA {
	private String myName;
	private int myAge;
	
	
	public ModelA(String myName, int myAge) {
		super();
		this.myName = myName;
		this.myAge = myAge;
	}
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getMyAge() {
		return myAge;
	}
	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}
	
}
