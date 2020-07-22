
public class Employee extends Person{

	double salary;
	String rank;
	String job;
	
	public Employee (){}
	public Employee (String n, double a, String ad, String nat, double sal,String ran,String jo){
		
		super(n,a,ad,nat);
		 salary=sal;
		 rank=ran;
		 job=jo;
			
		
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}
