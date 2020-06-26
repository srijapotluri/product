package com.rite.products.convertrite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "XXR_SOURCE_TEMPLATE_HEADERS")
public class SourceTemplateHeaders {
	@Id
	private long templateId;
	
	@Column(name="TEMPLATE_NAME")
	private String templateName;
	
	@Column(name="SAAS_OBJECT_CODE")
	private String saasobjectCode;
	
	@Column(name="SAAS_PARENT_OBJECT_CODE")
	private String saasParentObjectCode;

	public long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(long templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	
	public String getSaasobjectCode() {
		return saasobjectCode;
	}

	public void setSaasobjectCode(String saasobjectCode) {
		this.saasobjectCode = saasobjectCode;
	}

	public String getSaasParentObjectCode() {
		return saasParentObjectCode;
	}

	public void setSaasParentObjectCode(String saasParentObjectCode) {
		this.saasParentObjectCode = saasParentObjectCode;
	}
	
	
	
	
	
	

}
