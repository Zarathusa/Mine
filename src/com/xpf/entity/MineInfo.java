package com.xpf.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_mine")
public class MineInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String projectName;
	@Column
	private String mineName;
	@Column
	private String projectEffect;
	@Column
	private String mineStatus;
	@Column
	private String gasGrade;
	@Column
	private String geoCond;
	@Column
	private String coalSeamGive;
	@Column
	private String exploit;
	@Column
	private String gasGive;
	@Column
	private String staffComp;
	@Column
	private String staffTech;
	@Column
	private String techCond;
	@Column
	private String implPeriod;
	@Column
	private String implArea;
	@Column
	private String techGrade;
	@Column
	private String mineImpact;
	@Column
	private String techDesc;
	@Column
	private String techFeature;
	@Column
	private String quanEffect;
	@Column
	private String organ;
	@Column
	private String manageResp;
	@Column
	private String manageRespFile;
	@Column
	private String resourceSupport;
	@Column
	private String workLink;
	@Column
	private String techFile;
	@Column
	private String workProce;
	@Column
	private String workFile;
	@Column
	private String operProce;
	@Column
	private String techStandard;
	@Column
	private String timeStandard;
	@Column
	private String workAmount;
	@Column
	private String projectReport;
	
	public MineInfo() {
		super();
	}

	public MineInfo(Integer id, String projectName, String mineName,
			String projectEffect, String mineStatus, String gasGrade,
			String geoCond, String coalSeamGive, String exploit,
			String gasGive, String staffComp, String staffTech,
			String techCond, String implPeriod, String implArea,
			String techGrade, String mineImpact, String techDesc,
			String techFeature, String quanEffect, String organ,
			String manageResp, String manageRespFile, String resourceSupport,
			String workLink, String techFile, String workProce,
			String workFile, String operProce, String techStandard,
			String timeStandard, String workAmount, String projectReport) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.mineName = mineName;
		this.projectEffect = projectEffect;
		this.mineStatus = mineStatus;
		this.gasGrade = gasGrade;
		this.geoCond = geoCond;
		this.coalSeamGive = coalSeamGive;
		this.exploit = exploit;
		this.gasGive = gasGive;
		this.staffComp = staffComp;
		this.staffTech = staffTech;
		this.techCond = techCond;
		this.implPeriod = implPeriod;
		this.implArea = implArea;
		this.techGrade = techGrade;
		this.mineImpact = mineImpact;
		this.techDesc = techDesc;
		this.techFeature = techFeature;
		this.quanEffect = quanEffect;
		this.organ = organ;
		this.manageResp = manageResp;
		this.manageRespFile = manageRespFile;
		this.resourceSupport = resourceSupport;
		this.workLink = workLink;
		this.techFile = techFile;
		this.workProce = workProce;
		this.workFile = workFile;
		this.operProce = operProce;
		this.techStandard = techStandard;
		this.timeStandard = timeStandard;
		this.workAmount = workAmount;
		this.projectReport = projectReport;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getMineName() {
		return mineName;
	}

	public void setMineName(String mineName) {
		this.mineName = mineName;
	}

	public String getProjectEffect() {
		return projectEffect;
	}

	public void setProjectEffect(String projectEffect) {
		this.projectEffect = projectEffect;
	}

	public String getMineStatus() {
		return mineStatus;
	}

	public void setMineStatus(String mineStatus) {
		this.mineStatus = mineStatus;
	}

	public String getGasGrade() {
		return gasGrade;
	}

	public void setGasGrade(String gasGrade) {
		this.gasGrade = gasGrade;
	}

	public String getGeoCond() {
		return geoCond;
	}

	public void setGeoCond(String geoCond) {
		this.geoCond = geoCond;
	}

	public String getCoalSeamGive() {
		return coalSeamGive;
	}

	public void setCoalSeamGive(String coalSeamGive) {
		this.coalSeamGive = coalSeamGive;
	}

	public String getExploit() {
		return exploit;
	}

	public void setExploit(String exploit) {
		this.exploit = exploit;
	}

	public String getGasGive() {
		return gasGive;
	}

	public void setGasGive(String gasGive) {
		this.gasGive = gasGive;
	}

	public String getStaffComp() {
		return staffComp;
	}

	public void setStaffComp(String staffComp) {
		this.staffComp = staffComp;
	}

	public String getStaffTech() {
		return staffTech;
	}

	public void setStaffTech(String staffTech) {
		this.staffTech = staffTech;
	}

	public String getTechCond() {
		return techCond;
	}

	public void setTechCond(String techCond) {
		this.techCond = techCond;
	}

	public String getImplPeriod() {
		return implPeriod;
	}

	public void setImplPeriod(String implPeriod) {
		this.implPeriod = implPeriod;
	}

	public String getImplArea() {
		return implArea;
	}

	public void setImplArea(String implArea) {
		this.implArea = implArea;
	}

	public String getTechGrade() {
		return techGrade;
	}

	public void setTechGrade(String techGrade) {
		this.techGrade = techGrade;
	}

	public String getMineImpact() {
		return mineImpact;
	}

	public void setMineImpact(String mineImpact) {
		this.mineImpact = mineImpact;
	}

	public String getTechDesc() {
		return techDesc;
	}

	public void setTechDesc(String techDesc) {
		this.techDesc = techDesc;
	}

	public String getTechFeature() {
		return techFeature;
	}

	public void setTechFeature(String techFeature) {
		this.techFeature = techFeature;
	}

	public String getQuanEffect() {
		return quanEffect;
	}

	public void setQuanEffect(String quanEffect) {
		this.quanEffect = quanEffect;
	}

	public String getOrgan() {
		return organ;
	}

	public void setOrgan(String organ) {
		this.organ = organ;
	}

	public String getManageResp() {
		return manageResp;
	}

	public void setManageResp(String manageResp) {
		this.manageResp = manageResp;
	}

	public String getManageRespFile() {
		return manageRespFile;
	}

	public void setManageRespFile(String manageRespFile) {
		this.manageRespFile = manageRespFile;
	}

	public String getResourceSupport() {
		return resourceSupport;
	}

	public void setResourceSupport(String resourceSupport) {
		this.resourceSupport = resourceSupport;
	}

	public String getWorkLink() {
		return workLink;
	}

	public void setWorkLink(String workLink) {
		this.workLink = workLink;
	}

	public String getTechFile() {
		return techFile;
	}

	public void setTechFile(String techFile) {
		this.techFile = techFile;
	}

	public String getWorkProce() {
		return workProce;
	}

	public void setWorkProce(String workProce) {
		this.workProce = workProce;
	}

	public String getWorkFile() {
		return workFile;
	}

	public void setWorkFile(String workFile) {
		this.workFile = workFile;
	}

	public String getOperProce() {
		return operProce;
	}

	public void setOperProce(String operProce) {
		this.operProce = operProce;
	}

	public String getTechStandard() {
		return techStandard;
	}

	public void setTechStandard(String techStandard) {
		this.techStandard = techStandard;
	}

	public String getTimeStandard() {
		return timeStandard;
	}

	public void setTimeStandard(String timeStandard) {
		this.timeStandard = timeStandard;
	}

	public String getWorkAmount() {
		return workAmount;
	}

	public void setWorkAmount(String workAmount) {
		this.workAmount = workAmount;
	}

	public String getProjectReport() {
		return projectReport;
	}

	public void setProjectReport(String projectReport) {
		this.projectReport = projectReport;
	}

	@Override
	public String toString() {
		return "MineInfo [id=" + id + ", projectName=" + projectName
				+ ", mineName=" + mineName + ", projectEffect=" + projectEffect
				+ ", mineStatus=" + mineStatus + ", gasGrade=" + gasGrade
				+ ", geoCond=" + geoCond + ", coalSeamGive=" + coalSeamGive
				+ ", exploit=" + exploit + ", gasGive=" + gasGive
				+ ", staffComp=" + staffComp + ", staffTech=" + staffTech
				+ ", techCond=" + techCond + ", implPeriod=" + implPeriod
				+ ", implArea=" + implArea + ", techGrade=" + techGrade
				+ ", mineImpact=" + mineImpact + ", techDesc=" + techDesc
				+ ", techFeature=" + techFeature + ", quanEffect=" + quanEffect
				+ ", organ=" + organ + ", manageResp=" + manageResp
				+ ", manageRespFile=" + manageRespFile + ", resourceSupport="
				+ resourceSupport + ", workLink=" + workLink + ", techFile="
				+ techFile + ", workProce=" + workProce + ", workFile="
				+ workFile + ", operProce=" + operProce + ", techStandard="
				+ techStandard + ", timeStandard=" + timeStandard
				+ ", workAmount=" + workAmount + ", projectReport="
				+ projectReport + "]";
	}

	

	
	
	
}
