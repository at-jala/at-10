package main.java.CristelhMiranda.inheritance;

public class TEstMain {
	public static void main(String arg[]) {
		GraduateStudent gStu = new GraduateStudent();
		UndergraduateStudent uStu = new UndergraduateStudent();
		//Student stu = new Student();
		
		/*System.out.println(gStu.ComputeCourseGrade());
		System.out.println(uStu.ComputeCourseGrade());
		
		GraduateStudent[] listGS = new GraduateStudent[2];
		UndergraduateStudent[] listUS = new UndergraduateStudent[2];
		listGS[0] = gStu;
		listUS[0] = uStu;
		*/
		Student[] listS = new Student[2];
		listS[0] = gStu;
		listS[1] = uStu;
		//listS[2] = stu;
		
		gStu.setTestScore(1, 75);
		gStu.setTestScore(2, 70);
		gStu.setTestScore(3, 70);
		
		uStu.setTestScore(1, 71);
		uStu.setTestScore(2, 61);
		uStu.setTestScore(3, 71);
		
		/*stu.setTestScore(1, 5);
		stu.setTestScore(2, 5);
		stu.setTestScore(3, 5);
		*/
		
		for (int i = 0; i < listS.length; i++) {
			Student stud = listS[i];
			System.out.println(stud.ComputeCourseGrade());
		}
	}
}
