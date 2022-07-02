package assignment1.driver;

import assignment1.AdminDepartment;
import assignment1.HRDepartment;
import assignment1.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SuperDepartment sd = new SuperDepartment();
		AdminDepartment ad = new AdminDepartment();
		HRDepartment hrd = new HRDepartment();
		TechDepartment td = new TechDepartment();
		ad.departmentName();
		ad.getTodaysWork();
		ad.getWorkDeadline();
		ad.isTodayAHoliday();
		hrd.departmentName();
		hrd.doActivity();
		hrd.getTodaysWork();
		hrd.getWorkDeadline();
		hrd.isTodayAHoliday();
		td.departmentName();
		td.getTodaysWork();
		td.getWorkDeadline();
		td.getTechStackInformation();
		td.isTodayAHoliday();
		

	} 

}
