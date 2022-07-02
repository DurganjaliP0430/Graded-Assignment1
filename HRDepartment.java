package assignment1;

public class HRDepartment extends SuperDepartment {
	public String departmentName() {
		String dname = "\n\nWelcome to HR Department";
		System.out.println(dname);
		return(dname);
	}
	
	public String getTodaysWork() {
		String work = "Fill today's worksheet and mark your attendance";
		System.out.println(work);
		return(work);
	}
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		System.out.println(deadline);
		return(deadline);
	}
	public String doActivity() {
		String activity = "Team Lunch";
		System.out.println(activity);
		return(activity);
	}
}
