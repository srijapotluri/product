package com.rite.products.convertrite.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XXR_CLOUD_TEMPLATE_HEADERS")
public class XxrCloudTemplateHeader implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="TEMPLATE_ID")
	private long templateId;
	@Column(name="POD_ID")
	private int podId;
	@Column(name="BU")
	private int bu;
	@Column(name="BU_SPECIFIC")
	private String buSpecific;
	@Column(name="SAAS_OBJECT_CODE")
	private String objectCode;
	@Column(name="SAAS_PARENT_OBJECT_CODE")
	private String parentObjectCode;
    @Column(name="TEMPLATE_NAME")
    private String templateName;
    @Column(name="PROJECT_NAME")
    private String projectName;
    @Column(name="SOURCE_HEADER_TEMPLATE")
    private String sourceHeaderTemplate;
    @Column(name="TEMPLATE_TYPE")
    private String templateType;
    @Column(name="CLOUD_DATA_TABLE_NAME")
    private String cloudDataTableName;
    @Column(name="TABLE_NAME")
    private String tableName;
    @Column(name="VIEW_NAME")
    private String viewName;
	public long getTemplateId() {
		return templateId;
	}
	public void setTemplateId(long templateId) {
		this.templateId = templateId;
	}
	public int getPodId() {
		return podId;
	}
	public void setPodId(int podId) {
		this.podId = podId;
	}
	public int getBu() {
		return bu;
	}
	public void setBu(int bu) {
		this.bu = bu;
	}
	public String getBuSpecific() {
		return buSpecific;
	}
	public void setBuSpecific(String buSpecific) {
		this.buSpecific = buSpecific;
	}
	public String getObjectCode() {
		return objectCode;
	}
	public void setObjectCode(String objectCode) {
		this.objectCode = objectCode;
	}
	public String getParentObjectCode() {
		return parentObjectCode;
	}
	public void setParentObjectCode(String parentObjectCode) {
		this.parentObjectCode = parentObjectCode;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getSourceHeaderTemplate() {
		return sourceHeaderTemplate;
	}
	public void setSourceHeaderTemplate(String sourceHeaderTemplate) {
		this.sourceHeaderTemplate = sourceHeaderTemplate;
	}
	public String getTemplateType() {
		return templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}
	public String getCloudDataTableName() {
		return cloudDataTableName;
	}
	public void setCloudDataTableName(String cloudDataTableName) {
		this.cloudDataTableName = cloudDataTableName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
    
    
	

}
