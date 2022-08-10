package com.example.employee.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.example.employee.entity.Employee;

public class Helper {
	
	
		public static boolean checkExcelFormat(MultipartFile file) {
			String contentType = file.getContentType();

			if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
				return true;
			} else {
				return false;
			}

		}

	public static List<Employee> convertExcelToListOfProduct(InputStream is) {

		List<Employee> list = new ArrayList<>();

		try {

			XSSFWorkbook workbook = new XSSFWorkbook(is);

			XSSFSheet sheet = workbook.getSheetAt(0);

			int rowNumber = 0;
			Iterator<Row> iterator = sheet.iterator();

			while (iterator.hasNext()) {
				Row row = iterator.next();

				if (rowNumber == 0) {
					rowNumber++;
					continue;
				}

				Iterator<Cell> cells = row.iterator();

				

				Employee p = new Employee();

				while (cells.hasNext()) {
					Cell cell = cells.next();
					int cid = cell.getColumnIndex();
					switch (cid) {
					
					case 0:
						p.setRegion(cell.getStringCellValue());
						break;
					case 1:
						p.setBillability(cell.getStringCellValue());
						break;
					case 2:
						p.setStatus(cell.getStringCellValue());
						break;
					case 3:
						p.setbU(cell.getStringCellValue());
						break;
					case 4:
						p.setEmpIdKin(cell.getStringCellValue());
						break;
					
					case 5:
						p.setGgId((long)cell.getNumericCellValue());
						break;
					case 6:
						p.setName(cell.getStringCellValue());
						break;
					case 7:
						p.setRegionArea(cell.getStringCellValue());
						break;
					case 8:
						p.setType(cell.getStringCellValue());
						break;
					case 9:
						p.setLocation(cell.getStringCellValue());
						break;
					case 10	:
						p.setGrade(cell.getStringCellValue());
						break;
					case 11:
						p.setPractice(cell.getStringCellValue());
						break;
					case 12:
						p.setSubPractice(cell.getStringCellValue());
						break;
					case 13:
						p.setProjectId((long)cell.getNumericCellValue());
						break;
					case 14:
						p.setNewProjectname(cell.getStringCellValue());
						break;
					case 15:
						p.setProjectType(cell.getStringCellValue());
						break;
					case 16:
						p.setDoj(cell.getDateCellValue());
						break;
					case 17:
						p.setBillableStartDate(cell.getDateCellValue());
						break;
					case 18:
						p.setTenure((double)cell.getNumericCellValue());
						break;
					case 19:
						p.setcGAllocationStartDate(cell.getDateCellValue());
						break;
					case 20:
						p.setcGAllocationEndDate(cell.getDateCellValue());
						break;
					case 21:
						p.setcgSupervisorName(cell.getStringCellValue());
						break;
					case 22:
						p.setService(cell.getStringCellValue());
						break;
					case 23:
						p.setPrimarySkills(cell.getStringCellValue());
						break;
					case 24:
						p.setSecondarySkills(cell.getStringCellValue());
						break;
					case 25:
						p.setSkills(cell.getStringCellValue());
						break;
					case 26:
						p.setOtherSkills(cell.getStringCellValue());
						break;
					case 27:
						p.setAllocationStatus(cell.getStringCellValue());
						break;
					case 28:
						p.setReasonForReleaseOrResignation(cell.getStringCellValue());
						break;
					case 29:
						p.setOffboardingUpdates(cell.getStringCellValue());
						break;
					case 30:
						p.setInternalOrExternal(cell.getStringCellValue());
						break;
					case 31:
						p.setCorpID(cell.getStringCellValue());
						break;
					case 32:
						p.setFgName(cell.getStringCellValue());
						break;
					case 33:
						p.setCorBillRate((long)cell.getNumericCellValue());
						break;
					case 34:
						p.setWorkOrderIdOrSow(cell.getStringCellValue());
						break;
					case 35:
						p.setFgEndDate(cell.getDateCellValue());
						break;
					case 36:
						p.setFgExperience(cell.getStringCellValue());
						break;
					case 37:
						p.setClientHiringManager(cell.getStringCellValue());
						break;
					case 38:
						p.setFgCostCenter(cell.getStringCellValue());
						break;
					case 39:
						p.setFgBu(cell.getStringCellValue());
						break;
					case 40:
						p.setEngagementManager(cell.getStringCellValue());
						break;
					case 41:
						p.setAddress(cell.getStringCellValue());
						break;
					case 42:
						p.setMobile((long)cell.getNumericCellValue());
						break;
					case 43:
						p.setEmail(cell.getStringCellValue());
						break;
					case 44:
						p.setVisaDetail(cell.getStringCellValue());
						break;
					case 45:
						p.setLaptopStatus(cell.getStringCellValue());
						break;
					case 46:
						p.setShiftDetails(cell.getStringCellValue());
						break;
					case 47:
						p.setCgJoining(cell.getDateCellValue());
						break;
					case 48:
						p.setIndustryJoiningDate(cell.getDateCellValue());
						break;
					case 49:
						p.setCgExpInYears((int)cell.getNumericCellValue());
						break;
					case 50:
						p.setTotalExperienceInYears((int)cell.getNumericCellValue());
						break;
					case 51:
						p.setComments(cell.getStringCellValue());
						break;
					case 52:
						p.setTraining1InformationProtectionTrainingSp2i(cell.getStringCellValue());
						break;
					case 53:
						p.setTraining2SecureApplicationDevelopmentTraining(cell.getStringCellValue());
						break;
					case 54:
						p.setTraining3CodeOfEthics(cell.getStringCellValue());
						break;
					case 55:
						p.setTraining4Sattraining(cell.getStringCellValue());
						break;
					case 56:
						p.setTraining_5_CG_Information_Security_Training(cell.getStringCellValue());
						break;
					case 57:
						p.setSignedNdaAck(cell.getStringCellValue());
						break;
						
					default:
						break;
					}
					
					

				}

				list.add(p);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		

	}
}
