package main.java.CristelhMiranda.inheritance;

public abstract class Student {
	int NUM_OF_TEST = 3;
	String name;
	int[] test;
	String courseGrade;
	int minScore;
	
	Student(){
		test = new int[3];
	}
	
	Student(String name){
		this.name = name;
		test = new int[3];
	}
	
	String getCourseGrade() {
		return courseGrade;
	}
	
	String getName() {
		return name;
	}
		
	void setName(String name) {
		this.name = name;
	}
	
	void setTestScore(int testNumber, int score) {
		test[testNumber - 1] = score;
	}
	
	String ComputeCourseGrade(){
		int sum = 0;
		for (int i = 0; i < test.length; i++) {
			sum = sum + test[i];			
		}
		
		double average = sum/3;
		
		if(average > minScore) {
			return "Passed";
		}else {
			return "Failed";
		}
	}
}
