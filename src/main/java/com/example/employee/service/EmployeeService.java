package com.example.employee.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.example.employee.entity.Employee;

public interface EmployeeService {

	public List<Employee> getEmployee();
	public void addEmployee(Employee e);
	public void update(Employee e,String emp_id_kin);
	
	//validation
	public boolean check(Employee e) throws Exception;
	
	//filters
	public Employee getByName(String name);
	public Employee authenticate(Employee e);
	public Employee getByBillability(String billabilty);
	public Employee getByStatus(String status);
	public Employee getByBu(String bu);
	public Employee getByGgID(long ggId);
	public Employee getByRegion(String region);
	public Employee getByLocation(String location);
	public Employee getByGrade(String grade);
	public Employee getByProjectId(long projectId);
	public Employee getByNewProjectname(String newProjectname);
	public Employee getByProjectType(String projectType);
	public Employee getByCgSupervisorName(String cgSupervisorName);
	public Employee getByService(String Service);
	public Employee getByPrimarySkills(String primarySkills);
	public Employee getBysecondarySkills(String secondarySkills);
	public Employee getBySkills(String Skills);
	public Employee getByAllocationStatus(String allocationStatus);
	public Employee getByReasonForReleaseOrResignation(String  reasonForReleaseOrResignation);
	public Employee getBycorpID(String corpID);
	public Employee getByWorkOrderIdOrSow(String workOrderIdOrSow);
	public Employee getByfgExperience(String fgExperience);
	public Employee getByClientHiringManager(String clientHiringManager);
	public Employee getByfgBu(String fgBu);
	public Employee getByEngagementManager(String engagementManager);
	
	//excel sheet
	 public void saveExcel(MultipartFile file);
	 
	
	
}
