package com.example.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
	
	Employee findByName(String Name);
	Employee findByEmpIdKin(String empIdKin);
	Employee findByBillability(String billability);
	Employee findByStatus(String Status);
	Employee findBybU(String bU);
	Employee findByGgId(long ggId);
	Employee findByRegion(String region); 
	Employee findByLocation(String location); 
	Employee findByGrade(String grade); 
	Employee findByProjectId(long projectId); 
	Employee findByNewProjectname(String newProjectName); 
	Employee findByProjectType(String projectType); 
	Employee findByCgSupervisorName(String cgSupervisorName);
	Employee findByService(String Service);
	Employee findByPrimarySkills(String primarySkills);
	Employee findBysecondarySkills(String secondarySkills);
	Employee findBySkills(String Skills);
	Employee findByAllocationStatus(String allocationStatus);
	//Employee findByReasonForReleaseOrResignation(String  reasonForReleaseOrResignation);
	Employee findBycorpID(String corpID);
	//Employee findByWorkOrderIdOrSow(String workOrderIdOrSow);
	Employee findByfgExperience(String fgExperience);
	Employee findByClientHiringManager(String clientHiringManager);
	Employee findByfgBu(String fgBu);
	Employee findByEngagementManager(String engagementManager);
	
	

	
}
