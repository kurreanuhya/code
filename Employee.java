package com.klef.ep.models;


public class Employee 
{
   private int empid;
   private String empname;
   private String empgender;
   private String empdepartment;
   public String getEmpdepartment() {
	return empdepartment;
}
public void setEmpdepartment(String empdepartment) {
	this.empdepartment = empdepartment;
}
private Double empsalary;
   private String empjoiningdate;
   private boolean empmanager;
   
   public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpgender() {
	return empgender;
}
public void setEmpgender(String empgender) {
	this.empgender = empgender;
}
public Double getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(Double empsalary) {
	this.empsalary = empsalary;
}
public String getEmpjoiningdate() {
	return empjoiningdate;
}
public void setEmpjoiningdate(String empjoiningdate) {
	this.empjoiningdate = empjoiningdate;
}
public boolean isEmpmanager() {
	return empmanager;
}
public void setEmpmanager(boolean empmanager) {
	this.empmanager = empmanager;
}

}
