package assignment1;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		String dname = "\n\nWelcome to Tech Department";
		System.out.println(dname);                   
		return(dname);          
	}
	
	public String getTodaysWork() {
		String work = "Complete coding of module 1";
		System.out.println(work);
		return(work);
	}
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		System.out.println(deadline);
		return(deadline);
	}
	public String getTechStackInformation() {
		String info = "Core JAVA";
		System.out.println(info);
		return(info);
	}

}
