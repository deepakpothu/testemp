package com.example.employee.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Employee {

	private String region;

	private String billability;

	private String status;

	private String bU;
	@NotNull
	@NotBlank
	@Column(unique = true)
	@Id
	private String empIdKin;

	@NotNull
	private long ggId;
	@NotNull
	@NotBlank
	private String name;
	private String regionArea;
	private String type;
	private String location;

	@NotNull
	@NotBlank
	private String grade;

	@NotNull
	@NotBlank
	private String practice;
	
	private String subPractice;
	
	@NotNull
	private long projectId;
	
	private String newProjectname;
	private String projectType;
	
	//@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date doj;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date billableStartDate;
	private double tenure;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date cGAllocationStartDate;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date cgAllocationEndDate;
	private String cgSupervisorName;
	private String service;
	private String primarySkills;
	private String secondarySkills;
	private String skills;
	private String otherSkills;
	private String allocationStatus;
	private String reasonForReleaseOrResignation;
	private String offboardingUpdates;
	@NotNull
	@NotBlank
	private String internalOrExternal;
	
	@Column(unique = true)
	private String corpID;
	private String fgName;
	private long corBillRate;
	private String workOrderIdOrSow;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fgEndDate;
	private String fgExperience;
	private String clientHiringManager;
	private String fgCostCenter;
	private String fgBu;
	private String engagementManager;
	private String Address;
	
	//@NotNull
	private long Mobile;
	@Email
	@NotNull
	private String email;
	private String visaDetail;
	private String laptopStatus;
	private String shiftDetails;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date cgJoining;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date industryJoiningDate;
	private int cgExpInYears;
	private int totalExperienceInYears;
	private String Comments;
	private String training1InformationProtectionTrainingSp2i;
	private String training2SecureApplicationDevelopmentTraining;
	private String training3CodeOfEthics;
	private String training4Sattraining;
	private String training_5_CG_Information_Security_Training;
	private String signedNdaAck;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String region, String billability, String status, String bU, String empIdKin, long ggId,
			String name, String regionArea, String type, String location, String grade, String practice,
			String subPractice, long projectId, String newProjectname, String projectType, Date doj,
			Date billableStartDate, double tenure, Date cGAllocationStartDate, Date cGAllocationEndDate,
			String cgSupervisorName, String service, String primarySkills, String secondarySkills, String skills,
			String otherSkills, String allocationStatus, String reasonForReleaseOrResignation,
			String offboardingUpdates, String internalOrExternal, String corpID, String fgName, long corBillRate,
			String workOrderIdOrSow, Date fgEndDate, String fgExperience, String clientHiringManager,
			String fgCostCenter, String fgBu, String engagementManager, String address, long mobile,
			@Email @NotNull String email, String visaDetail, String laptopStatus, String shiftDetails, Date cgJoining,
			Date industryJoiningDate, int cgExpInYears, int totalExperienceInYears, String comments,
			String training1InformationProtectionTrainingSp2i, String training2SecureApplicationDevelopmentTraining,
			String training3CodeOfEthics, String training4Sattraining,
			String training_5_CG_Information_Security_Training, String signedNdaAck) {
		super();

		this.region = region;
		this.billability = billability;
		this.status = status;
		this.bU = bU;
		this.empIdKin = empIdKin;
		this.ggId = ggId;
		this.name = name;
		this.regionArea = regionArea;
		this.type = type;
		this.location = location;
		this.grade = grade;
		this.practice = practice;
		this.subPractice = subPractice;
		this.projectId = projectId;
		this.newProjectname = newProjectname;
		this.projectType = projectType;
		this.doj = doj;
		this.billableStartDate = billableStartDate;
		this.tenure = tenure;
		this.cGAllocationStartDate = cGAllocationStartDate;
		this.cgAllocationEndDate = cgAllocationEndDate;
		this.cgSupervisorName = cgSupervisorName;
		this.service = service;
		this.primarySkills = primarySkills;
		this.secondarySkills = secondarySkills;
		this.skills = skills;
		this.otherSkills = otherSkills;
		this.allocationStatus = allocationStatus;
		this.reasonForReleaseOrResignation = reasonForReleaseOrResignation;
		this.offboardingUpdates = offboardingUpdates;
		this.internalOrExternal = internalOrExternal;
		this.corpID = corpID;
		this.fgName = fgName;
		this.corBillRate = corBillRate;
		this.workOrderIdOrSow = workOrderIdOrSow;
		this.fgEndDate = fgEndDate;
		this.fgExperience = fgExperience;
		this.clientHiringManager = clientHiringManager;
		this.fgCostCenter = fgCostCenter;
		this.fgBu = fgBu;
		this.engagementManager = engagementManager;
		Address = address;
		Mobile = mobile;
		this.email = email;
		this.visaDetail = visaDetail;
		this.laptopStatus = laptopStatus;
		this.shiftDetails = shiftDetails;
		this.cgJoining = cgJoining;
		this.industryJoiningDate = industryJoiningDate;
		this.cgExpInYears = cgExpInYears;
		this.totalExperienceInYears = totalExperienceInYears;
		Comments = comments;
		this.training1InformationProtectionTrainingSp2i = training1InformationProtectionTrainingSp2i;
		this.training2SecureApplicationDevelopmentTraining = training2SecureApplicationDevelopmentTraining;
		this.training3CodeOfEthics = training3CodeOfEthics;
		this.training4Sattraining = training4Sattraining;
		this.training_5_CG_Information_Security_Training = training_5_CG_Information_Security_Training;
		this.signedNdaAck = signedNdaAck;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getBillability() {
		return billability;
	}

	public void setBillability(String billability) {
		this.billability = billability;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getbU() {
		return bU;
	}

	public void setbU(String bU) {
		this.bU = bU;
	}

	public String getEmpIdKin() {
		return empIdKin;
	}

	public void setEmpIdKin(String empIdKin) {
		this.empIdKin = empIdKin;
	}

	public long getGgId() {
		return ggId;
	}

	public void setGgId(long ggId) {
		this.ggId = ggId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegionArea() {
		return regionArea;
	}

	public void setRegionArea(String regionArea) {
		this.regionArea = regionArea;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPractice() {
		return practice;
	}

	public void setPractice(String practice) {
		this.practice = practice;
	}

	public String getSubPractice() {
		return subPractice;
	}

	public void setSubPractice(String subPractice) {
		this.subPractice = subPractice;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getNewProjectname() {
		return newProjectname;
	}

	public void setNewProjectname(String newProjectname) {
		this.newProjectname = newProjectname;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getBillableStartDate() {
		return billableStartDate;
	}

	public void setBillableStartDate(Date billableStartDate) {
		this.billableStartDate = billableStartDate;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(double tenure) {
		this.tenure = tenure;
	}

	public Date getcGAllocationStartDate() {
		return cGAllocationStartDate;
	}

	public void setcGAllocationStartDate(Date cGAllocationStartDate) {
		this.cGAllocationStartDate = cGAllocationStartDate;
	}

	public Date getcGAllocationEndDate() {
		return cgAllocationEndDate;
	}

	public void setcGAllocationEndDate(Date cgAllocationEndDate) {
		this.cgAllocationEndDate = cgAllocationEndDate;
	}

	public String getcgSupervisorName() {
		return cgSupervisorName;
	}

	public void setcgSupervisorName(String cgSupervisorName) {
		this.cgSupervisorName = cgSupervisorName;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getPrimarySkills() {
		return primarySkills;
	}

	public void setPrimarySkills(String primarySkills) {
		this.primarySkills = primarySkills;
	}

	public String getSecondarySkills() {
		return secondarySkills;
	}

	public void setSecondarySkills(String secondarySkills) {
		this.secondarySkills = secondarySkills;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getOtherSkills() {
		return otherSkills;
	}

	public void setOtherSkills(String otherSkills) {
		this.otherSkills = otherSkills;
	}

	public String getAllocationStatus() {
		return allocationStatus;
	}

	public void setAllocationStatus(String allocationStatus) {
		this.allocationStatus = allocationStatus;
	}

	public String getReasonForReleaseOrResignation() {
		return reasonForReleaseOrResignation;
	}

	public void setReasonForReleaseOrResignation(String reasonForReleaseOrResignation) {
		this.reasonForReleaseOrResignation = reasonForReleaseOrResignation;
	}

	public String getOffboardingUpdates() {
		return offboardingUpdates;
	}

	public void setOffboardingUpdates(String offboardingUpdates) {
		this.offboardingUpdates = offboardingUpdates;
	}

	public String getInternalOrExternal() {
		return internalOrExternal;
	}

	public void setInternalOrExternal(String internalOrExternal) {
		this.internalOrExternal = internalOrExternal;
	}

	public String getCorpID() {
		return corpID;
	}

	public void setCorpID(String corpID) {
		this.corpID = corpID;
	}

	public String getFgName() {
		return fgName;
	}

	public void setFgName(String fgName) {
		this.fgName = fgName;
	}

	public long getCorBillRate() {
		return corBillRate;
	}

	public void setCorBillRate(long corBillRate) {
		this.corBillRate = corBillRate;
	}

	public String getWorkOrderIdOrSow() {
		return workOrderIdOrSow;
	}

	public void setWorkOrderIdOrSow(String workOrderIdOrSow) {
		this.workOrderIdOrSow = workOrderIdOrSow;
	}

	public Date getFgEndDate() {
		return fgEndDate;
	}

	public void setFgEndDate(Date fgEndDate) {
		this.fgEndDate = fgEndDate;
	}

	public String getFgExperience() {
		return fgExperience;
	}

	public void setFgExperience(String fgExperience) {
		this.fgExperience = fgExperience;
	}

	public String getClientHiringManager() {
		return clientHiringManager;
	}

	public void setClientHiringManager(String clientHiringManager) {
		this.clientHiringManager = clientHiringManager;
	}

	public String getFgCostCenter() {
		return fgCostCenter;
	}

	public void setFgCostCenter(String fgCostCenter) {
		this.fgCostCenter = fgCostCenter;
	}

	public String getFgBu() {
		return fgBu;
	}

	public void setFgBu(String fgBu) {
		this.fgBu = fgBu;
	}

	public String getEngagementManager() {
		return engagementManager;
	}

	public void setEngagementManager(String engagementManager) {
		this.engagementManager = engagementManager;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getMobile() {
		return Mobile;
	}

	public void setMobile(long mobile) {
		Mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVisaDetail() {
		return visaDetail;
	}

	public void setVisaDetail(String visaDetail) {
		this.visaDetail = visaDetail;
	}

	public String getLaptopStatus() {
		return laptopStatus;
	}

	public void setLaptopStatus(String laptopStatus) {
		this.laptopStatus = laptopStatus;
	}

	public String getShiftDetails() {
		return shiftDetails;
	}

	public void setShiftDetails(String shiftDetails) {
		this.shiftDetails = shiftDetails;
	}

	public Date getCgJoining() {
		return cgJoining;
	}

	public void setCgJoining(Date cgJoining) {
		this.cgJoining = cgJoining;
	}

	public Date getIndustryJoiningDate() {
		return industryJoiningDate;
	}

	public void setIndustryJoiningDate(Date industryJoiningDate) {
		this.industryJoiningDate = industryJoiningDate;
	}

	public int getCgExpInYears() {
		return cgExpInYears;
	}

	public void setCgExpInYears(int cgExpInYears) {
		this.cgExpInYears = cgExpInYears;
	}

	public int getTotalExperienceInYears() {
		return totalExperienceInYears;
	}

	public void setTotalExperienceInYears(int totalExperienceInYears) {
		this.totalExperienceInYears = totalExperienceInYears;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public String getTraining1InformationProtectionTrainingSp2i() {
		return training1InformationProtectionTrainingSp2i;
	}

	public void setTraining1InformationProtectionTrainingSp2i(String training1InformationProtectionTrainingSp2i) {
		this.training1InformationProtectionTrainingSp2i = training1InformationProtectionTrainingSp2i;
	}

	public String getTraining2SecureApplicationDevelopmentTraining() {
		return training2SecureApplicationDevelopmentTraining;
	}

	public void setTraining2SecureApplicationDevelopmentTraining(String training2SecureApplicationDevelopmentTraining) {
		this.training2SecureApplicationDevelopmentTraining = training2SecureApplicationDevelopmentTraining;
	}

	public String getTraining3CodeOfEthics() {
		return training3CodeOfEthics;
	}

	public void setTraining3CodeOfEthics(String training3CodeOfEthics) {
		this.training3CodeOfEthics = training3CodeOfEthics;
	}

	public String getTraining4Sattraining() {
		return training4Sattraining;
	}

	public void setTraining4Sattraining(String training4Sattraining) {
		this.training4Sattraining = training4Sattraining;
	}

	public String getTraining_5_CG_Information_Security_Training() {
		return training_5_CG_Information_Security_Training;
	}

	public void setTraining_5_CG_Information_Security_Training(String training_5_CG_Information_Security_Training) {
		this.training_5_CG_Information_Security_Training = training_5_CG_Information_Security_Training;
	}

	public String getSignedNdaAck() {
		return signedNdaAck;
	}

	public void setSignedNdaAck(String signedNdaAck) {
		this.signedNdaAck = signedNdaAck;
	}

	@Override
	public String toString() {
		return "Employee [region=" + region + ", billability=" + billability + ", status=" + status + ", bU=" + bU
				+ ", empIdKin=" + empIdKin + ", ggId=" + ggId + ", name=" + name + ", regionArea=" + regionArea
				+ ", type=" + type + ", location=" + location + ", grade=" + grade + ", practice=" + practice
				+ ", subPractice=" + subPractice + ", projectId=" + projectId + ", newProjectname=" + newProjectname
				+ ", projectType=" + projectType + ", doj=" + doj + ", billableStartDate=" + billableStartDate
				+ ", tenure=" + tenure + ", cGAllocationStartDate=" + cGAllocationStartDate + ", cGAllocationEndDate="
				+ cgAllocationEndDate + ", cgSupervisorName=" + cgSupervisorName + ", service=" + service
				+ ", primarySkills=" + primarySkills + ", secondarySkills=" + secondarySkills + ", skills=" + skills
				+ ", otherSkills=" + otherSkills + ", allocationStatus=" + allocationStatus
				+ ", reasonForReleaseOrResignation=" + reasonForReleaseOrResignation + ", OffboardingUpdates="
				+ offboardingUpdates + ", InternalOrExternal=" + internalOrExternal + ", corpID=" + corpID + ", fgName="
				+ fgName + ", corBillRate=" + corBillRate + ", workOrderIdOrSow=" + workOrderIdOrSow + ", fgEndDate="
				+ fgEndDate + ", fgExperience=" + fgExperience + ", clientHiringManager=" + clientHiringManager
				+ ", fgCostCenter=" + fgCostCenter + ", fgBu=" + fgBu + ", engagementManager=" + engagementManager
				+ ", Address=" + Address + ", Mobile=" + Mobile + ", email=" + email + ", visaDetail=" + visaDetail
				+ ", laptopStatus=" + laptopStatus + ", shiftDetails=" + shiftDetails + ", cgJoining=" + cgJoining
				+ ", industryJoiningDate=" + industryJoiningDate + ", cgExpInYears=" + cgExpInYears
				+ ", totalExperienceInYears=" + totalExperienceInYears + ", Comments=" + Comments
				+ ", training1InformationProtectionTrainingSp2i=" + training1InformationProtectionTrainingSp2i
				+ ", training2SecureApplicationDevelopmentTraining=" + training2SecureApplicationDevelopmentTraining
				+ ", training3CodeOfEthics=" + training3CodeOfEthics + ", training4Sattraining=" + training4Sattraining
				+ ", training_5_CG_Information_Security_Training=" + training_5_CG_Information_Security_Training
				+ ", signedNdaAck=" + signedNdaAck + ", getRegion()=" + getRegion() + ", getBillability()="
				+ getBillability() + ", getStatus()=" + getStatus() + ", getbU()=" + getbU() + ", getEmpIdKin()="
				+ getEmpIdKin() + ", getGgId()=" + getGgId() + ", getName()=" + getName() + ", getRegionArea()="
				+ getRegionArea() + ", getType()=" + getType() + ", getLocation()=" + getLocation() + ", getGrade()="
				+ getGrade() + ", getPractice()=" + getPractice() + ", getSubPractice()=" + getSubPractice()
				+ ", getProjectId()=" + getProjectId() + ", getNewProjectname()=" + getNewProjectname()
				+ ", getProjectType()=" + getProjectType() + ", getDoj()=" + getDoj() + ", getBillableStartDate()="
				+ getBillableStartDate() + ", getTenure()=" + getTenure() + ", getcGAllocationStartDate()="
				+ getcGAllocationStartDate() + ", getcGAllocationEndDate()=" + getcGAllocationEndDate()
				+ ", getcgSupervisorName()=" + getcgSupervisorName() + ", getService()=" + getService()
				+ ", getPrimarySkills()=" + getPrimarySkills() + ", getSecondarySkills()=" + getSecondarySkills()
				+ ", getSkills()=" + getSkills() + ", getOtherSkills()=" + getOtherSkills() + ", getAllocationStatus()="
				+ getAllocationStatus() + ", getReasonForReleaseOrResignation()=" + getReasonForReleaseOrResignation()
				+ ", getOffboardingUpdates()=" + getOffboardingUpdates() + ", getInternalOrExternal()="
				+ getInternalOrExternal() + ", getCorpID()=" + getCorpID() + ", getFgName()=" + getFgName()
				+ ", getCorBillRate()=" + getCorBillRate() + ", getWorkOrderIdOrSow()=" + getWorkOrderIdOrSow()
				+ ", getFgEndDate()=" + getFgEndDate() + ", getFgExperience()=" + getFgExperience()
				+ ", getClientHiringManager()=" + getClientHiringManager() + ", getFgCostCenter()=" + getFgCostCenter()
				+ ", getFgBu()=" + getFgBu() + ", getEngagementManager()=" + getEngagementManager() + ", getAddress()="
				+ getAddress() + ", getMobile()=" + getMobile() + ", getEmail()=" + getEmail() + ", getVisaDetail()="
				+ getVisaDetail() + ", getLaptopStatus()=" + getLaptopStatus() + ", getShiftDetails()="
				+ getShiftDetails() + ", getCgJoining()=" + getCgJoining() + ", getIndustryJoiningDate()="
				+ getIndustryJoiningDate() + ", getCgExpInYears()=" + getCgExpInYears()
				+ ", getTotalExperienceInYears()=" + getTotalExperienceInYears() + ", getComments()=" + getComments()
				+ ", getTraining1InformationProtectionTrainingSp2i()=" + getTraining1InformationProtectionTrainingSp2i()
				+ ", getTraining2SecureApplicationDevelopmentTraining()="
				+ getTraining2SecureApplicationDevelopmentTraining() + ", getTraining3CodeOfEthics()="
				+ getTraining3CodeOfEthics() + ", getTraining4Sattraining()=" + getTraining4Sattraining()
				+ ", getTraining_5_CG_Information_Security_Training()="
				+ getTraining_5_CG_Information_Security_Training() + ", getSignedNdaAck()=" + getSignedNdaAck()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
