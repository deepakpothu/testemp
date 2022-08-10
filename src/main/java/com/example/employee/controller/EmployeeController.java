package com.example.employee.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.employee.helper.Helper;
import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;


@RestController
@RequestMapping("/homepage")
public class EmployeeController {

	@Autowired
	EmployeeService es;

	@GetMapping("/")
	public String home() {
		return "Welcome to Home";
	}

	@GetMapping("/allEmp")
	public List<Employee> getAll() {
		return es.getEmployee();
	}

	@PostMapping("/addEmp")
	public  ResponseEntity<HttpStatus> addEmp(@Valid @RequestBody Employee e) throws Exception {
		
		
			if (es.check(e)) {
				if(es.authenticate(e)!=null) {
					throw new Exception("emp_id_kin already exists.Try again");
				}
				es.addEmployee(e);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}	

	}

	@GetMapping("/findByName/{name}")
	public Employee getEmployeeByName(@PathVariable String name) {
		return es.getByName(name);
	}

	
	
	
	
	
	@PutMapping("/update/{emp_id_kin}")
	public ResponseEntity<HttpStatus> update(@Valid @RequestBody Employee e, @PathVariable String emp_id_kin) {
		try {
			es.update(e, emp_id_kin);
			
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception ee) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		 
	}
	
	//-------Filter------------
	
	@GetMapping("/findByBillability/{billability}")
	public Employee getBillable(@PathVariable String billability) {
		return es.getByBillability(billability);
	}
	
	@GetMapping("/findByStatus/{status}")
	public Employee getStatus(@PathVariable String status) {
		return es.getByStatus(status);
	}
	
	@GetMapping("/findByBU/{bu}")
	public Employee getBu(@PathVariable String bu) {
		return es.getByBu(bu);
	}
	
	@GetMapping("/findByGgID/{ggId}")
	public Employee getGgID(@PathVariable long ggId) {
		return es.getByGgID(ggId);
	}
	
	@GetMapping("/findByRegion/{region}")
	public Employee getRegion(@PathVariable String region) {
		return es.getByRegion(region);
	}
	
	@GetMapping("/findByLocation/{location}")
	public Employee getLocation(@PathVariable String location) {
		return es.getByLocation(location);
	}
	
	@GetMapping("/findByGrade/{grade}")
	public Employee getGrade(@PathVariable String grade) {
		return es.getByGrade(grade);
	}
	
	@GetMapping("/findByNewProjectname/{newProjectName}")
	public Employee getNewProjectName(@PathVariable String newProjectName) {
		return es.getByNewProjectname(newProjectName);
	}
	
	@GetMapping("/findByProjectType/{projectType}")
	public Employee getProjectType(@PathVariable String projectType) {
		return es.getByProjectType(projectType);
	}
	
	@GetMapping("/findByCgSupervisorName/{cgSupervisorName}")
	public Employee getCgSupervisorName(@PathVariable String cgSupervisorName) {
		return es.getByCgSupervisorName(cgSupervisorName);
	}

	@GetMapping("/findByService/{serviceName}")
	public Employee getServiceName(@PathVariable String serviceName) {
		return es.getByService(serviceName);
	}
	
	@GetMapping("/findByPrimarySkills/{primarySkills}")
	public Employee getPrimarySkills(@PathVariable String primarySkills) {
		return es.getByPrimarySkills(primarySkills);
	}
	
	@GetMapping("/findBysecondarySkills/{secondarySkills}")
	public Employee getSecondarySkills(@PathVariable String secondarySkills) {
		return es.getBysecondarySkills(secondarySkills);
	}
	
	@GetMapping("/findBySkills/{skills}")
	public Employee getSkills(@PathVariable String skills) {
		return es.getBySkills(skills);
	}
	
	@GetMapping("/findByAllocationStatus/{allocationStatus}")
	public Employee getAllocationStatus(@PathVariable String allocationStatus) {
		return es.getByAllocationStatus(allocationStatus);
	}
	
	@GetMapping("/findByReasonForReleaseOrResignation/{reasonForReleaseOrResignation}")
	public Employee getReasonForReleaseOrResignation(@PathVariable String ReasonForReleaseOrResignation) {
		return es.getByReasonForReleaseOrResignation(ReasonForReleaseOrResignation);
	}
	
	@GetMapping("/findBycorpID/{corpId}")
	public Employee getCorpID(@PathVariable String corpID) {
		return es.getBycorpID(corpID);
	}
	
	@GetMapping("/findByWorkOrderIdOrSow/{workOrderIdOrSow}")
	public Employee getfindByWorkOrderIdOrSow(@PathVariable String findByWorkOrderIdOrSow) {
		return es.getByWorkOrderIdOrSow(findByWorkOrderIdOrSow);
	}
	
	@GetMapping("/findByfgExperience/{fgExperience}")
	public Employee getFgExperience(@PathVariable String fgExperience) {
		return es.getByfgExperience(fgExperience);
	}
	
	@GetMapping("/findByClientHiringManage{clientHiringManager}")
	public Employee getClientHiringManager(@PathVariable String clientHiringManager) {
		return es.getByClientHiringManager(clientHiringManager);
	}
	
	@GetMapping("/findByfgBu/{fgBu}")
	public Employee getFgBu(@PathVariable String fgBu) {
		return es.getByfgBu(fgBu);
	}
	
	@GetMapping("/findByEngagementManager/{engagementManager}")
	public Employee getEngagementManager(@PathVariable String engagementManager) {
		return es.getByEngagementManager(engagementManager);
	}
	
	
	//-----Excel-----
	
	  @PostMapping("/employee/uploadExcel")
	    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
	        if (Helper.checkExcelFormat(file)) {
	            //true

	            this.es.saveExcel(file);

	            return ResponseEntity.ok(Map.of("message", "File is uploaded and data is saved to db"));


	        }
	        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file ");
	    }
	
	
	
	
}
