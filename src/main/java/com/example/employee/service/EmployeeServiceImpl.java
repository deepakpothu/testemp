package com.example.employee.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.employee.helper.Helper;
import com.example.employee.dao.EmployeeDao;
import com.example.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empd;

	// view
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return empd.findAll();

	}

	// add
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		empd.save(e);
	}

	@Override
	public Employee getByName(String name) {
		// TODO Auto-generated method stub
		return empd.findByName(name);

	}

	// update
	@Override
	public void update(Employee e, String emp_id_kin) {
		// TODO Auto-generated method stub
		List<Employee> li = new ArrayList<>();
		li = empd.findAll();
		for (Employee emp : li) {
			if (emp.getEmpIdKin().equals(emp_id_kin)) {
				empd.delete(emp);
				empd.save(e);
			}
		}

	}

	// ----------Validation----------
	@Override
	public boolean check(Employee e) throws Exception {
		// TODO Auto-generated method stub

		if (!e.getBillability().toLowerCase().equals("billable")
				&& !e.getBillability().toLowerCase().equals("non-billable")
				&& !e.getBillability().toLowerCase().equals("nil")) {
			throw new Exception("Allowed values for Billability: Billable,Non-Billable");

		}
		if (!e.getStatus().toLowerCase().equals("active") && !e.getStatus().toLowerCase().equals("inactive")
				&& !e.getStatus().toLowerCase().equals("nil")) {
			throw new Exception("Allowed values for Status: Active or InActive");

		}
		if (!e.getInternalOrExternal().toLowerCase().equals("internal")
				&& !e.getInternalOrExternal().toLowerCase().equals("external")
				&& !e.getInternalOrExternal().toLowerCase().equals("nil")) {
			throw new Exception("Allowed values for InternalOrExternal: Internal or External");
		}

		if (!e.getRegion().toLowerCase().equals("onshore-gdc") && !e.getRegion().toLowerCase().equals("offshore-gdc")
				&& !e.getRegion().toLowerCase().equals("nil")) {
			throw new Exception("Allowed values for Region:Onshore-GDC or OffshoreGDC");
		}
		if (!e.getAllocationStatus().toLowerCase().equals("allocated")
				&& !e.getRegion().toLowerCase().equals("resigned") && !e.getRegion().toLowerCase().equals("nil")) {
			throw new Exception("Allowed values for Allocation status:Allocated or Resigned");
		}
		if (!e.getTraining1InformationProtectionTrainingSp2i().toLowerCase().equals("yes")
				&& !e.getTraining1InformationProtectionTrainingSp2i().toLowerCase().equals("no")
				&& !e.getTraining1InformationProtectionTrainingSp2i().toLowerCase().equals("nil")) {
			throw new Exception("Allowed values for Training1InformationProtectionTrainingSp2i: Yes or No");
		}
		if (!e.getTraining2SecureApplicationDevelopmentTraining().toLowerCase().equals("yes")
				&& !e.getTraining2SecureApplicationDevelopmentTraining().toLowerCase().equals("no")
				&& !e.getTraining2SecureApplicationDevelopmentTraining().toLowerCase().equals("nil")) {
			throw new Exception("Allowed values for Training2SecureApplicationDevelopmentTraining: Yes or No");
		}
		if (!e.getTraining3CodeOfEthics().toLowerCase().equals("yes")
				&& !e.getTraining3CodeOfEthics().toLowerCase().equals("no")
				&& !e.getTraining3CodeOfEthics().toLowerCase().equals("nil")) {
			throw new Exception("Allowed values for Training3CodeOfEthics: Yes or No");
		}
		if (!e.getTraining4Sattraining().toLowerCase().equals("yes")
				&& !e.getTraining4Sattraining().toLowerCase().equals("no")
				&& !e.getTraining4Sattraining().toLowerCase().equals("nil")) {
			throw new Exception("Allowed values for Training4SatTraining: Yes or No");
		}
		if (!e.getTraining_5_CG_Information_Security_Training().toLowerCase().equals("yes")
				&& !e.getTraining_5_CG_Information_Security_Training().toLowerCase().equals("no")
				&& !e.getTraining_5_CG_Information_Security_Training().toLowerCase().equals("nil")) {
			throw new Exception("Allowed values for Training_5_CG_Information_Security_Training: Yes or No");
		}
		if (!e.getSignedNdaAck().toLowerCase().equals("yes") && !e.getSignedNdaAck().toLowerCase().equals("no")
				&& !e.getSignedNdaAck().toLowerCase().equals("nil")) {
			throw new Exception("Allowed values for SignedNdaAck: Yes or No");
		}
		return true;
	}

	@Override
	public Employee authenticate(Employee e) {
		// TODO Auto-generated method stub
		return empd.findByEmpIdKin(e.getEmpIdKin());

	}

	// ------Filters-------
	@Override
	public Employee getByBillability(String billabilty) {
		// TODO Auto-generated method stub
		return empd.findByBillability(billabilty);

	}

	@Override
	public Employee getByStatus(String status) {
		// TODO Auto-generated method stub
		return empd.findByStatus(status);
	}

	@Override
	public Employee getByBu(String bu) {
		// TODO Auto-generated method stub
		return empd.findBybU(bu);
	}

	@Override
	public Employee getByGgID(long ggId) {
		// TODO Auto-generated method stub
		return empd.findByGgId(ggId);
	}

	@Override
	public Employee getByRegion(String region) {
		// TODO Auto-generated method stub
		return empd.findByRegion(region);
	}

	@Override
	public Employee getByLocation(String location) {
		// TODO Auto-generated method stub
		return empd.findByLocation(location);
	}

	@Override
	public Employee getByGrade(String grade) {
		// TODO Auto-generated method stub
		return empd.findByGrade(grade);
	}

	@Override
	public Employee getByProjectId(long projectId) {
		// TODO Auto-generated method stub
		return empd.findByProjectId(projectId);
	}

	@Override
	public Employee getByNewProjectname(String newProjectname) {
		// TODO Auto-generated method stub
		return empd.findByNewProjectname(newProjectname);
	}

	@Override
	public Employee getByProjectType(String projectType) {
		// TODO Auto-generated method stub
		return empd.findByProjectType(projectType);
	}

	@Override
	public Employee getByCgSupervisorName(String cgSupervisorName) {
		// TODO Auto-generated method stub
		return empd.findByCgSupervisorName(cgSupervisorName);
	}

	@Override
	public Employee getByService(String Service) {
		// TODO Auto-generated method stub
		return empd.findByService(Service);
	}

	@Override
	public Employee getByPrimarySkills(String primarySkills) {
		// TODO Auto-generated method stub
		return empd.findByPrimarySkills(primarySkills);
	}

	@Override
	public Employee getBysecondarySkills(String secondarySkills) {
		// TODO Auto-generated method stub
		return empd.findBysecondarySkills(secondarySkills);
	}

	@Override
	public Employee getBySkills(String Skills) {
		// TODO Auto-generated method stub
		return empd.findBySkills(Skills);
	}

	@Override
	public Employee getByAllocationStatus(String allocationStatus) {
		// TODO Auto-generated method stub
		return empd.findByAllocationStatus(allocationStatus);
	}

	@Override
	public Employee getByReasonForReleaseOrResignation(String reasonForReleaseOrResignation) {
		// TODO Auto-generated method stub
		return null;
		// return
		// empd.findByReasonForReleaseOrResignation(reasonForReleaseOrResignation);
	}

	@Override
	public Employee getBycorpID(String corpID) {
		// TODO Auto-generated method stub
		return empd.findBycorpID(corpID);
	}

	@Override
	public Employee getByWorkOrderIdOrSow(String workOrderIdOrSow) {
		// TODO Auto-generated method stub
		return null;
		// return empd.findByWorkOrderIdOrSow(workOrderIdOrSow);
	}

	@Override
	public Employee getByfgExperience(String fgExperience) {
		// TODO Auto-generated method stub
		return empd.findByfgExperience(fgExperience);
	}

	@Override
	public Employee getByClientHiringManager(String clientHiringManager) {
		// TODO Auto-generated method stub
		return empd.findByClientHiringManager(clientHiringManager);
	}

	@Override
	public Employee getByfgBu(String fgBu) {
		// TODO Auto-generated method stub
		return empd.findByfgBu(fgBu);
	}

	@Override
	public Employee getByEngagementManager(String engagementManager) {
		// TODO Auto-generated method stub
		return empd.findByEngagementManager(engagementManager);
	}

	// --------Excel file--------
	@Override
	public void saveExcel(MultipartFile file) {

		try {
			List<Employee> products = Helper.convertExcelToListOfProduct(file.getInputStream());
			this.empd.saveAll(products);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
