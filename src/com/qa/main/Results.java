package com.qa.main;

public class Results {
	
	int maxMark= 450;
	int physics;
	int chemistry;
	int biology;
	int total;
	double percentage;
	
	
	//setters for grades if needed
	public void setPhysics(int physicsMark) {
		this.physics= physicsMark;
	}
	
	public void setChemistry(int chemistryMark) {
		this.chemistry= chemistryMark;
	}
	
	public void setBiology(int biologyMark) {
		this.biology= biologyMark;
	}
	
	//method1
	public String reportCard() {
		int total= physics+chemistry+biology;
		System.out.println((String)("Physics Mark: "+ physics + "/150"));
		System.out.println((String)("Chemistry Mark: " + chemistry + "/150"));
		System.out.println((String)("Biology Mark: " + biology + "/150"));
		System.out.println((String)("Total Mark: " + total + "/450"));
		return null;
		
	}
	
	public double percentage() {
		int total= physics+chemistry+biology;
		double percent= (double)(total/maxMark)*100;
		return percent;
	}

}
