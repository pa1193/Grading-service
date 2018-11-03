package edu.learn.rest.model;

public class Grade {

	private String lettergrade;
	private float range1, range2;
	private float gpa;
	public Grade(String lettergrade, float range1, float range2, float gpa) {
		super();
		this.lettergrade = lettergrade;
		this.range1 = range1;
		this.range2 = range2;
		this.gpa = gpa;
	}
	public String getLettergrade() {
		return lettergrade;
	}
	public void setLettergrade(String lettergrade) {
		this.lettergrade = lettergrade;
	}
	public float getRange1() {
		return range1;
	}
	public void setRange1(float range1) {
		this.range1 = range1;
	}
	public float getRange2() {
		return range2;
	}
	public void setRange2(float range2) {
		this.range2 = range2;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	
	
	
}
