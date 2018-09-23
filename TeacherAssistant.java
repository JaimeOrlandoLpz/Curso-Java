/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesalumnos;
//Actividad Siham

import java.util.LinkedList;

 public class TeacherAssistant {
 	public static LinkedList<MathStudent> findSystemsStudents (LinkedList<MathStudent> studentList){
		
		LinkedList<MathStudent> names = new LinkedList<MathStudent>();
		
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getCareer().toUpperCase().equals("ISC")){
                            names.add(studentList.get(i));
                        }
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
		MathStudent milly = new MathStudent("Milly", "IMI", 1, 93);
		MathStudent albert = new MathStudent("Albert", "isC", 2, 93);
		MathStudent lizz = new MathStudent("Lizz", "IBT", 4, 93);
		MathStudent luigi = new MathStudent("Luigi", "isc", 3, 87);
		MathStudent mandy = new MathStudent("Mandy", "IMI", 1, 91);
                MathStudent paola = new MathStudent("Paola", "IBT", 5, 93);
		LinkedList<MathStudent> students = new LinkedList<MathStudent>();
		students.add(albert);
		students.add(lizz);
		students.add(luigi);
		students.add(mandy);
                students.add(paola);
                students.add(milly);
		LinkedList<MathStudent> sorted = findSystemsStudents(students);
		LinkedList<MathStudent> bestStudents = bestStudent(students);
		System.out.println(sorted.toString());
		System.out.println(bestStudents.toString());
		
	}
 }
