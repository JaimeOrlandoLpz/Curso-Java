package mx.itesm.other;

import java.util.LinkedList;
import mx.itesm.other.*;
import mx.itesm.util.*;

public class TeacherAssistant {

	public static LinkedList<MathStudent> findSystemsStudents (LinkedList<MathStudent> studentList){
		
		LinkedList<MathStudent> names = new LinkedList<MathStudent>();
		
		for (int i = 0; i < studentList.size(); i++) {
			names.add(studentList.get(i));
		}
		
		return names;
	}
	
	public static LinkedList<MathStudent> bestStudent(LinkedList<MathStudent> students){
		
		LinkedList<MathStudent> best = new LinkedList<MathStudent>();
		MathStudent maximum = students.get(0);
		
		for (int i = 0; i < students.size(); i++) {
			MathStudent current = students.get(i);
			if (current.getGrade() > maximum.getGrade()) {
				maximum = current;
			}
		}
		
		best.add(maximum);
		
		double maximumGrade = maximum.getGrade();
		students.remove(maximum);
		
		for (int i = 0; i < students.size(); i++) {
			MathStudent current = students.get(i);
			if (current.getGrade() == maximumGrade) {
				MathStudent newMaximum = current;
				best.add(newMaximum);
			}
		}
		
		return best;
	}

	public static void main(String[] args) {
		
		MathStudent albert = new MathStudent("Albert", "isC", 2, 93);
		MathStudent lizz = new MathStudent("Lizz", "IBT", 4, 93);
		MathStudent luigi = new MathStudent("Luigi", "isc", 3, 87);
		MathStudent mandy = new MathStudent("Mandy", "IMI", 1, 91);
		LinkedList<MathStudent> students = new LinkedList<MathStudent>();
		students.add(albert);
		students.add(lizz);
		students.add(luigi);
		students.add(mandy);
		LinkedList<MathStudent> sorted = findSystemsStudents(students);
		LinkedList<MathStudent> bestStudents = bestStudent(students);
		System.out.println(sorted.toString());
		System.out.println(bestStudents.toString());
		
	}

}
