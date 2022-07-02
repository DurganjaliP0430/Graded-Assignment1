package assignment1;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		String dname = "Welcome to Admin Department";
		System.out.println(dname);
		return(dname);	
	}
	
	public String getTodaysWork() {
		String twork = "Complete your documents submission";
		System.out.println(twork);
		return(twork);
	}
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		System.out.println(deadline);
		return(deadline);
	}
	
}
