package GeneralProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Sort An ArrayList Of Custom Objects Using Comparator
//we sort an ArrayList of Student objects by using our own Comparator. This Comparator sorts the Student objects based on their percentage.

public class ListSorting4 {

	public static void main(String[] args) {
		ArrayList<Student1> listOfStudents = new ArrayList<Student1>();
		listOfStudents.add(new Student1(123, "Student1", 62));
		listOfStudents.add(new Student1(231, "Student2", 81));
		listOfStudents.add(new Student1(85, "Student3", 79));
		listOfStudents.add(new Student1(478, "Student4", 94));
		listOfStudents.add(new Student1(365, "Student5", 62));
		System.out.println("listOfStudents Before Sorting :");
		System.out.println(listOfStudents);
		Collections.sort(listOfStudents, new OrderByPercentage());
		System.out.println("listOfStudents After Sorting :");
		System.out.println(listOfStudents);
	}
}

class Student1 implements Comparable<Student1> {
	int id;
	String name;
	int percentage;

	public Student1(int id, String name, int percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public int compareTo(Student1 s) {
		return this.id - s.id; // Sorts the objects in ascending order
		// return s.id - this.id; //Sorts the objects in descending order
	}

	@Override
	public String toString() {
		return "{ID : " + id + ", Name : " + name + ", Percentage : " + percentage + "}";
	}
}

// Defining our own Comparator

class OrderByPercentage implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		return s1.percentage - s2.percentage;
	}
}
