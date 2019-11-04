package com.cg.ems.ProjectCodeModule.bean;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project_details")
public class ProjectDetails {

	@Id
	@Column(name = "project_code")
	private int projectCode;
	@Column(name = "project_desc")
	private String projectDesc;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;
	@Column(name = "business_unit")
	private String businessUnti;

	public ProjectDetails() {
		super();
	}

	public ProjectDetails(int projectCode, String projectDesc, Date startDate, Date endDate,
			String businessUnti) {
		super();
		this.projectCode = projectCode;
		this.projectDesc = projectDesc;
		this.startDate = startDate;
		this.endDate = endDate;
		this.businessUnti = businessUnti;
	}

	public int getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(int projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectDesc() {
		return projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getBusinessUnti() {
		return businessUnti;
	}

	public void setBusinessUnti(String businessUnti) {
		this.businessUnti = businessUnti;
	}

	@Override
	public String toString() {
		return "ProjectDetails [projectCode=" + projectCode + ", projectDesc=" + projectDesc + ", startDate="
				+ startDate + ", endDate=" + endDate + ", businessUnti=" + businessUnti + "]";
	}

}
