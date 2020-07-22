
public class Student extends Person {

	int student_level;
	String speclization;
	double gpa;

	public Student() {
		System.out.println("Hellow From Sub Class Constructor ... ");
	}

	public Student(String n, double a, String ad, String nat, int lev, String sp, double gpa) {

		super(n, a, ad, nat);
		student_level = lev;
		speclization = sp;
		this.gpa = gpa;

	}

	public int getStudent_level() {
		return student_level;
	}

	public void setStudent_level(int student_level) {
		this.student_level = student_level;
	}

	public String getSpeclization() {
		return speclization;
	}

	public void setSpeclization(String speclization) {
		this.speclization = speclization;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
