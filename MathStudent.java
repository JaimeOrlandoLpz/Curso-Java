package mx.itesm.other;

public class MathStudent {
	
	private String name;
	private int listNumber;
	private String career;
	private double grade;

	public MathStudent (String name, String career, int listNumber, int grade) {

		this.name = name;
		this.career = career;
		this.listNumber = listNumber;
		this.grade = grade;
	}
	
	public String getCareer() {
		
		return career;	
	}
	
	public int getListNumber() {
		
		return listNumber;
	}
	
	public String getName() {
		
		return name;
	}
	
	public double getGrade() {
		
		return grade;
	}
	
	public String toString() {
		
		return name;
	}
}
